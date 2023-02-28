package Locators;

import TestNG.Base_Run_Class;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class By_Name extends Base_Run_Class {

    @Test
    public void NameClass(){
        driver.get("https://www.facebook.com");
        driver.findElement(By.name("pass")).sendKeys("jaggu@123");


    }
}
