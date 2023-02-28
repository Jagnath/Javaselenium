package Locators;


import TestNG.Base_Run_Class;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class By_LinkText extends Base_Run_Class {

    @Test
    public void ByClass() {
        driver.get("https://www.facebook.com");
        driver.findElement(By.linkText("Forgotten password?")).click();


    }

}
