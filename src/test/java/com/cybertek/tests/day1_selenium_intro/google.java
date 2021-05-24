package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();


        drive.get("http://www.google.com");

        drive.findElement(By.name("q")).sendKeys("Apple"+ Keys.ENTER);

    }
}
