package browserfectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Create the package ‘browserfactory’ and create the
class with the name ‘BaseTest’ inside the
‘browserfactory’ package. And write the browser setup
code inside the class ‘Base Test’.
 */
public class BaseTest {
    public static WebDriver driver;
    public static String baseUrl = "https://www.saucedemo.com/";

    public void openBrowser(String baseUrl) {
        //launce the Chrome browser
        driver = new ChromeDriver();
        //Open the Url into browser
        driver.get(baseUrl);
        //Maximise Browser
        driver.manage().window().maximize();
        //Give Implicit wait to driver
    }
    public void closeBrowser(){
      closeBrowser();
    }

}
