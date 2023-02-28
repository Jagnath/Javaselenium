package Locators;

import TestNG.Base_Run_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class By_Tag extends Base_Run_Class {

    @Test
    public void byTag(){
        driver.get("https://www.facebook.com");
        List<WebElement> link = driver.findElements(By.tagName("a"));
        System.out.println("total linls " +link.size());
        for(WebElement links:link){
            System.out.println(links.getText() + " -- " + links.getAttribute("href"));
        }
    }
}
