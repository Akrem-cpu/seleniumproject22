package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailVerfication {
    public static void main(String[] args) {

        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        //2- Go to: https://google.com
        //3- Click to Gmail from top right.
        //4- Verify title contains:
        //Expected: Gmail
        //5- Go back to Google by using the .back();
        //6- Verify title equals:
        //Expected: Google

        WebDriverManager.chromedriver().setup();
        WebDriver go = new ChromeDriver();
        go.manage().window().maximize();

        go.get("https://google.com");

        //3- Click to Gmail from top right.
//        go.findElement(By.linkText("Gmail")).click();
        go.findElement(By.partialLinkText("Gmail")).click();


        String actualTitle = go.getTitle();
        String expectedTitle = "Gmail";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification Failed");
        }
        go.navigate().back();

        String expectedGoogleTitle = "Google";
        String actualGoogleTitleTitle = go.getTitle();

        if (actualGoogleTitleTitle.equals(expectedGoogleTitle)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification Failed");
        }









    }
}
