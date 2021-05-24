package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_TitleVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(" http://zero.webappsecurity.com/login.html");

        // finding the header element
        WebElement gmailLink = driver.findElement(By.tagName("h3"));
        String actualHeader = gmailLink.getText();
        String expectedHeader = "Log in to ZeroBank";
        Thread.sleep(600);

        WebElement link = driver.findElement(By.linkText("Zero Bank"));
        String actualLinkText = link.getText();
        String expectedLinkText = "Zero Bank";
        Thread.sleep(600);
         String actualLinkAttribute = link.getAttribute("href");

         String expectedLinkAttribute = "index.html";
        Thread.sleep(600);
        // test for header
        if (actualHeader.contains(expectedHeader)){
            System.out.println( "HEADER TEST PASSED");
        }else {
            System.out.println( "HEADER TEST FAILED");
        }
        //test for link text
        if(actualLinkText.equals(expectedLinkText)){
            System.out.println( "LINK TEXT TEST PASSED");
        }else {
            System.out.println( "LINK TEXT TEST FAIlED");

        }
        // test for attribute for the link text
        if (actualLinkAttribute.contains(expectedLinkAttribute)){
            System.out.println( "LINK ATTRIBUTE VALUE TEST PASSED");
        }else {
            System.out.println( "LINK ATTRIBUTE VALUE TEST FAIlED");
        }
        Thread.sleep(600);








    }
}
