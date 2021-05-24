package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_estySerach_TitleVerfication {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();

        drive.get("https://www.etsy.com");


        drive.findElement(By.id("global-enhancements-search-query")).sendKeys("Wooden spoon" + Keys.ENTER);

        String expectedTitle = "Wooden spoon | Esty";
        String  actualTitle = drive.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title test PASSED");
        }else {
            System.out.println("Title test FAILED");
        }





    }
}
