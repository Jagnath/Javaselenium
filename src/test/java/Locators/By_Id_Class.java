package Locators;

import TestNG.Base_Run_Class;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

 public class By_Id_Class extends Base_Run_Class {
    @Test
    public void IdClass(){
       driver.get("https://www.facebook.com");
       driver.findElement(By.id("email")).sendKeys("Jagnath");
       driver.findElement(By.id("pass")).sendKeys("143143143");


    }
}
