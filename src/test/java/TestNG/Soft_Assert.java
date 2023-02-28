package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert extends Base_Run_Class {

    @Test
    public void softassert() {

        driver.get("https://www.facebook.com");
        System.out.println("Beginning");
        String title = driver.getTitle();
        System.out.println("The page is " + title);
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(title,"Facebook – log in or sign up");
        System.out.println("close");
        soft.assertAll();
    }
}