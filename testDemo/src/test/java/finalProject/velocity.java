package finalProject;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

public class velocity {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://demo.bagisto.com/bagisto-common/");
    }

    @Test
    public void userLoginAndBuyTest() {
        try {
            // --- Sign in ---
            safeClick(By.cssSelector("span.icon-users"));
            safeClick(By.xpath("//a[contains(@href,'/customer/login') and contains(text(),'Sign In')]"));
            safeClick(By.cssSelector("button.primary-button[type='submit']"));
            sleep(2000);

            // --- Navigate to Woman category ---
            WebElement womanCategory = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[@href='https://demo.bagisto.com/bagisto-common/woman' and text()='Woman']")));
            jsClick(womanCategory);
            sleep(2000);

            // --- Open first product ---
            WebElement firstProductImg = wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector("img[id^='image-']")));
            jsClick(firstProductImg);
            sleep(2000);

            // --- Select size if needed ---
            selectAnySizeIfPresent();

            // --- Add To Cart & Buy Now ---
            safeClick(By.xpath("//button[contains(text(),'Add To Cart')]"));
            safeClick(By.xpath("//button[contains(text(),'Buy Now')]"));
            sleep(2000);

            // --- Billing Address ---
            selectFirstBillingAddressLabel();
            sleep(2000);

            // --- Use same address for shipping ---
            clickIfPresent(By.cssSelector("label[for='use_for_shipping']"));
            sleep(2000);

            // --- Proceed to Shipping ---
            WebElement proceedBtn = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[normalize-space()='Proceed']")));
            jsClick(proceedBtn);
            sleep(4000);

            // --- Select Free Shipping ---
            selectRadioInputById("free_free"); 
            sleep(3000);

            // --- Select COD (Cash on Delivery) ---
            WebElement codLabel = wait.until(ExpectedConditions
                    .elementToBeClickable(By.cssSelector("label[for='cashondelivery']")));
            codLabel.click();

            // --- Place Order ---
            WebElement placeOrderBtn = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[normalize-space()='Place Order']")));
            scrollIntoView(placeOrderBtn);
            jsClick(placeOrderBtn);
            sleep(5000);

            System.out.println("✅ Order placed successfully.");

        } catch (Exception e) {
            System.out.println("❌ Test failed: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // ----------------- helpers -----------------

    private void safeClick(By by) {
        try {
            WebElement el = wait.until(ExpectedConditions.elementToBeClickable(by));
            el.click();
        } catch (Exception clickFail) {
            WebElement el = wait.until(ExpectedConditions.presenceOfElementLocated(by));
            scrollIntoView(el);
            jsClick(el);
        }
        sleep(1500);
    }

    private void jsClick(WebElement el) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", el);
    }

    private void scrollIntoView(WebElement el) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", el);
    }

    private void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException ignored) {}
    }

    /** Select any size if present */
    private void selectAnySizeIfPresent() {
        try {
            List<WebElement> sizeOptions = driver.findElements(By.cssSelector("input[name^='super_attribute']"));
            if (!sizeOptions.isEmpty()) {
                WebElement first = wait.until(ExpectedConditions.elementToBeClickable(sizeOptions.get(0)));
                jsClick(first);
                sleep(1000);
            }
        } catch (Exception ignored) {}
    }

    /** Select first saved billing address */
    private void selectFirstBillingAddressLabel() {
        List<WebElement> radios = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
                By.cssSelector("input[name='billing.id']")));
        WebElement first = radios.get(0);
        String id = first.getAttribute("id");
        WebElement label = driver.findElement(By.cssSelector("label[for='" + id + "']"));
        scrollIntoView(label);
        jsClick(label);
        waitUntilChecked(first);
    }

    /** Select radio input by ID (clicks input directly, not just label) */
    private void selectRadioInputById(String id) {
        WebElement radio = wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
        scrollIntoView(radio);
        if (!radio.isSelected()) {
            jsClick(radio); // <-- clicking input
        }
        waitUntilChecked(radio);
    }

    private void waitUntilChecked(WebElement radio) {
        for (int i = 0; i < 5; i++) {
            if (radio.isSelected() || Boolean.parseBoolean(radio.getAttribute("checked"))) return;
            sleep(500);
        }
        throw new RuntimeException("Radio not selected after click: " + radio.getAttribute("id"));
    }

    private void clickIfPresent(By by) {
        List<WebElement> els = driver.findElements(by);
        if (!els.isEmpty()) {
            scrollIntoView(els.get(0));
            jsClick(els.get(0));
            sleep(1000);
        }
    }
//
//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) driver.quit();
// }
}