package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_CyberTekTItileVerifcation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();

        drive.get("http://practice.cybertekschool.com/inputs");

        Thread.sleep(3000);

        drive.findElement(By.className("nav-link")).click();

       String actualTitle =   drive.getTitle();
       String expeectedTitle = "Practice";

       if (actualTitle.equals(expeectedTitle)){
           System.out.println("Title Verification PASSED");
       }else {
           System.out.println("Title Verification FAILED");
       }


    }
}
