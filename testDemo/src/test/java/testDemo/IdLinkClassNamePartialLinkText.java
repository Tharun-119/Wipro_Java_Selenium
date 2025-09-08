package testDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Set;

public class IdLinkClassNamePartialLinkText {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
    }

    @Test
    public void testIdLink() {
        driver.findElement(By.cssSelector("a.ico-register")).click();
        driver.findElement(By.id("gender-male")).click();
    	driver.findElement(By.id("FirstName")).sendKeys("Tharun");
    	driver.findElement(By.id("LastName")).sendKeys("Kesireddy");
    	driver.findElement(By.id("Email")).sendKeys("tharunkesireddy2066@gmail.com");
    	driver.findElement(By.id("Password")).sendKeys("Tharun101");
    	driver.findElement(By.id("ConfirmPassword")).sendKeys("Tharun101");
    	driver.findElement(By.id("register-button")).click();
    	driver.findElement(By.className("register-continue-button")).click();
    	driver.findElement(By.xpath("//a[@href='/books']")).click();
    	driver.findElement(By.className("product-box-add-to-cart-button")).click();
    	driver.findElement(By.className("cart-qty")).click();
    	driver.findElement(By.id("termsofservice")).click();
    	driver.findElement(By.className("checkout-button")).click();
    	
    	
    	
    	
//    	driver.findElement(By.id("Email")).sendKeys("tharunkesireddy101@gmail.com");
//    	driver.findElement(By.id("Password")).sendKeys("Tharun101");
//    	driver.findElement(By.className("button-1 login-button"));
    }
//
//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
}
