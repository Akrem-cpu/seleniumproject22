package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginTitleVerfication {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();

        drive.get("https://www.facebook.com");

//        // Title search
//        String expectedTitle = drive.getTitle();
//        String actualTitle = "Facebook -Log In or Sign Up";
//
//        if (expectedTitle.equals(actualTitle)){
//            System.out.println("TITLE TEST PASSED");
//        }else {
//            System.out.println("TITLE TEST FAILED");
//        }
//
        // finding element to pass value to.
        WebElement emailInput = drive.findElement(By.id("email"));
        WebElement passwordInput  = drive.findElement(By.id("pass"));
        WebElement click = drive.findElement(By.name("login"));

        emailInput.sendKeys("akremjemal");
        Thread.sleep(500);
        passwordInput.sendKeys("lakdfjlkafsklasdjf");
        Thread.sleep(500);
        click.click();
        Thread.sleep(500);
        String actualTitle = drive.getTitle();
        String expectedTitle = "Log into Facebook";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Incorrect login title test verification PASSED");
        }else {
            System.out.println("Incorrect login title test verification FAILED");
        }











    }
}
