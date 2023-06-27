package testsuite;

import browserfectory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginTest extends BaseTest {
    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Enter “standard_user” username
        driver.findElement(By.xpath("//input[@id= 'user-name']")).sendKeys("standard_user");

        // Enter “secret_sauce” password
        driver.findElement(By.xpath("//input[@id= 'password']")).sendKeys("secret_sauce");

        // Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//input[@id= 'login-button']")).click();

        // Verify the text “Products”
        String expectedText = "Products";
        String actualText = driver.findElement(By.xpath("//span[@class='title']")).getText();
        Assert.assertEquals("Not directed to Login page", actualText, expectedText);
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        //Enter “standard_user” username
        driver.findElement(By.xpath("//input[@id= 'user-name']")).sendKeys("standard_user");

        //Enter “secret_sauce” password
        driver.findElement(By.xpath("//input[@id= 'password']")).sendKeys("secret_sauce");

        // Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//input[@id= 'login-button']")).click();

        // Verify that six products are displayed on page
        List<WebElement> sixProductsDisplayed = driver.findElements(By.xpath("//img[@class= 'inventory_item_img']"));
        System.out.println("Total products are displayed on the page " + sixProductsDisplayed.size());
    }
}
