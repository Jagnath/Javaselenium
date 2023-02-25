package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
    WebDriver driver;
    @BeforeTest
    @Parameters("browser")
    public void setup(String browser){
        if(browser.equalsIgnoreCase("chrome")){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
            
        }

        @AfterTest
    public void close(){
        driver.quit();
    }
}
