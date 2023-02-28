package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion extends Base_Run_Class {

    @Test
    public void hardassert(){

        driver.get("https://www.facebook.com");
        System.out.println("Beginning");
        String title=driver.getTitle();
        System.out.println("The page is " +title);
        Assert.assertEquals(title,"Facebook – log in or sign up");
        System.out.println("close");

    }
}
