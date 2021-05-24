package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_ZeroBankHeaderTextVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();


        drive.get("http://zero.webappsecurity.com/login.html");

        String expectedHeader = "Log in to ZeroBank";
       WebElement actualHeader =  drive.findElement(By.tagName("h3"));
        System.out.println(actualHeader);
        String actualHeaderText = actualHeader.getText();
         String className = drive.findElement(By.className("wrapper")).getText();
        System.out.println(className);

       if (expectedHeader.equals(actualHeaderText)){
           System.out.println("True");
       }else {
           System.out.println("false");

       }








    }
}
