package com.cybertek.tests.me;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class P2_ZeroVankHeader {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();


        drive.get("http://zero.webappsecurity.com/login.html");

        ArrayList<WebElement> element = new ArrayList<>();
        element.add(drive.findElement(By.tagName("h3")));




        String expectedHeaderText = "Log in to ZeroBank";
         String  actualHeaderText = element.get(0).getText();

         if (expectedHeaderText.equals(actualHeaderText)){
             System.out.println("PASSED");
         }else {
             System.out.println("FILED");
         }




    }
}
