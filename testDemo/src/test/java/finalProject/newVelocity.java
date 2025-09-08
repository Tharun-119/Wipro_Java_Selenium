package finalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class newVelocity {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setup() {
        // Adjust the path to your chromedriver
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void testUserRegistration() {
        // Navigate to the Bagisto demo site
        driver.get("https://demo.bagisto.com/bagisto-common/");

        // Click on the "Sign Up" link (update if needed)
        WebElement signUp = wait.until(
            ExpectedConditions.elementToBeClickable(By.linkText("Sign Up"))
        );
        signUp.click();

        // Wait for the registration form to appear
        // Update `By.id("name")` etc. with actual locators from Sign Up page
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("Test User");
        driver.findElement(By.id("email")).sendKeys("testuser" + System.currentTimeMillis() + "@example.com");
        driver.findElement(By.id("password")).sendKeys("P@ssw0rd123!");
        driver.findElement(By.id("password_confirmation")).sendKeys("P@ssw0rd123!");

        // Submit the registration form – update selector if different
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Validate registration success – adjust locator/text as per site
        WebElement confirmation = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Welcome') or contains(text(),'Account')]"))
        );

        Assert.assertTrue(confirmation.isDisplayed(), "Registration might have failed or element not found!");
    }

//    @AfterClass
//    public void teardown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}

