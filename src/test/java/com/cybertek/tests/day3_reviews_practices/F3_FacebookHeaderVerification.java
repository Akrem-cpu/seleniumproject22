package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_FacebookHeaderVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();

        drive.get(" https://www.facebook.com");
        Thread.sleep(600);

        WebElement header2 = drive.findElement(By.tagName("h2"));


        String actualHeader = header2.getText();
        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        Thread.sleep(600);
        if (actualHeader.equals(expectedHeader)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        drive.close();





    }
}
