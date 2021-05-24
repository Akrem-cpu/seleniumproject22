package com.cybertek.tests.me;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathLocatorAbsoulute {
    public static void main(String[] args) {
        WebDriver drive = WebDriverFactory.getDriver("Chrome");
        drive.get("http://practice.cybertekschool.com/forgot_password");

       WebElement homeLink = drive.findElement(By.xpath("/html/body/nav/ul/li/a"));
       WebElement passWordHeader = drive.findElement(By.xpath("/html/body/div/div/div/div/h2"));


        System.out.println("passWordHeader.isDisplayed() = " + passWordHeader.isDisplayed());
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());

    }
}
