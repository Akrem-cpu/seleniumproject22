package com.cybertek.tests.me;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class  FaceBookHeader {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();


        drive.get("http://www.google.com");
        WebElement name = drive.findElement(By.name("q"));
        Thread.sleep(300);
        name.sendKeys("Apple"  + Keys.ENTER);



    }
}
