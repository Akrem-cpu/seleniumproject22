package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_FaceBookAttribute {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();



        drive.get(" https://www.facebook.com");
        Thread.sleep(600);

        WebElement linkForCreateAPage = drive.findElement(By.linkText("Create a Page"));


        String actualLinkText = linkForCreateAPage.getAttribute("href");
        String expectedLinkText = "registration_form";

        if (actualLinkText.contains(expectedLinkText)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }



    }
}
