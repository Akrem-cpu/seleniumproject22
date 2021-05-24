package com.cybertek.tests.me;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_FacebookTitleVerfication {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();

        drive.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement checkBox = drive.findElement(By.id("isAgeSelected"));
        String actualText = checkBox.getText();
        String expectedText = "";
        if (actualText.equals(expectedText)){
            System.out.println("CHECK BOX test PASSED");
        }else {
            System.out.println("CHECK BOX test FAILED");
        }
        Thread.sleep(400);
        checkBox.click();
        checkBox = drive.findElement(By.id("txtAge"));
        String actualTextAfterClicking = checkBox.getText();
        String expectedTextAfterClicking = "Success – Check box is checked";
        if (actualTextAfterClicking.equals(expectedTextAfterClicking)){
            System.out.println("CheckBox after click has displayed a message - PASSED ");
        }else {
            System.out.println("CheckBox after click has NOT displayed a message - FAILED ");
        }








    }
}
