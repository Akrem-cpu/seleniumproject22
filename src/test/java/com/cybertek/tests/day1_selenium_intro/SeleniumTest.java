package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {


        // 1- set up the web driver
        WebDriverManager.chromedriver().setup();

        // 2- creat the instance of the chrome driver
        // this is the line that is opining the browser
        WebDriver driver = new ChromeDriver();


        // 3- test if driver id working
        driver.get("https://www.facebook.com");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.navigate().to("https://www.google.com");

        System.out.println(driver.getTitle());

        System.out.println("CurrentUrl" +driver.getCurrentUrl());
        // this line will maximize the browser size
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();

        driver.close();


    }
}
