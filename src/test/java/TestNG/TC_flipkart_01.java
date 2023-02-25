package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_flipkart_01  extends Base_Run_Class{
    @Test
    public void test(){

        driver.get("https://www.flipkart.com");
        String tl=driver.getTitle();
        System.out.println(tl);
        Reporter.log(tl);
    }

}
