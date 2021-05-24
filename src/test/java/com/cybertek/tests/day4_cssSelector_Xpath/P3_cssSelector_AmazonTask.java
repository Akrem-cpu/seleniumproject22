package com.cybertek.tests.day4_cssSelector_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_cssSelector_AmazonTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("https://www.amazon.com");

        WebElement amazonSearchBar = driver.findElement(By.cssSelector("input[id ='twotabsearchtextbox']"));
        Thread.sleep(500);
        amazonSearchBar.sendKeys("love books" + Keys.ENTER);
    }
}
