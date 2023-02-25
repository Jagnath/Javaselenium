package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_google_02 extends BaseClass{


    @Test
    public void test(){

        driver.get("https://www.google.com");
        String tl=driver.getTitle();
        System.out.println(tl);
        Reporter.log(tl);
    }

}
