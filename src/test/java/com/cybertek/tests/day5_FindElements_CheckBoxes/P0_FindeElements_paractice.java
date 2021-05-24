package com.cybertek.tests.day5_FindElements_CheckBoxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P0_FindeElements_paractice {
    public static void main(String[] args) {


        WebDriver drive = WebDriverFactory.getDriver("chrome");
        // if web element not found this will wait unit giving time
        // if web element located than this will be not wait 15 second
        drive.manage().timeouts().implicitlyWait(15 , TimeUnit.SECONDS);
        drive.get("http://practice.cybertekschool.com/forgot_password");
        List<WebElement> link = drive.findElements(By.xpath("//body//a"));
        for (int i = 0; i < link.size(); i++) {
            System.out.println("link.get(i).isDisplayed() = " + link.get(i).isDisplayed());
        }




    }
}
