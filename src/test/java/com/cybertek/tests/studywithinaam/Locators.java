package com.cybertek.tests.studywithinaam;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
    public static void main(String[] args) throws InterruptedException {

        WebDriver inaam = WebDriverFactory.getDriver("chrome");

        inaam.get("http://www.google.com");

        WebElement link = inaam.findElement(By.linkText("Gmail"));
        System.out.println("link.isDisplayed() = " + link.isDisplayed());
        // partialLinkText
        WebElement partialLinkText = inaam.findElement(By.partialLinkText("Search"));
        System.out.println("partialLinkText.isDisplayed() = " + partialLinkText.isDisplayed());

        WebElement name = inaam.findElement(By.name("q"));
        name.sendKeys("Cute dinner" );

        Thread.sleep(500);


        WebElement className = inaam.findElement(By.cssSelector("input[value='Google Search']"));
        Thread.sleep(500);
        className.click();


    }
}
