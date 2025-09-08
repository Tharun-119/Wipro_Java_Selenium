package testDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigateMethodsPageBasics {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testNavigation() throws InterruptedException {
        // Open Facebook
        driver.get("https://www.facebook.com/");
        System.out.println("Title 1: " + driver.getTitle());
        Thread.sleep(2000);

        // Navigate to Google
        driver.navigate().to("https://www.google.com/");
        System.out.println("Title 2: " + driver.getTitle());
        Thread.sleep(2000);

        // Back to Facebook
        driver.navigate().back();
        System.out.println("Back to: " + driver.getTitle());
        Thread.sleep(2000);

        // Forward to Google
        driver.navigate().forward();
        System.out.println("Forward to: " + driver.getTitle());
        Thread.sleep(2000);

        // Refresh the page
        driver.navigate().refresh();
        System.out.println("Page refreshed: " + driver.getTitle()); 
        // Title = the html title tag of current web page
        System.out.println("Current url: " + driver.getCurrentUrl());
        // current url = url of current web page
        System.out.println("Window handle: " + driver.getWindowHandle());
        // window handle = unique id (string) of web page to idetify the work
        System.out.println("Window handle: " + driver.getWindowHandles());
        //set of window handles used when multiple tabs/pop ups
    }

//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
}
