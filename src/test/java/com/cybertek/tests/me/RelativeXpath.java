package com.cybertek.tests.me;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RelativeXpath {
    public static void main(String[] args) {

        WebDriver drive = WebDriverFactory.getDriver("Chrome");

        drive.get("http://practice.cybertekschool.com/forgot_password");


        WebElement HomeLink = drive.findElement(By.xpath("//a[@href=\"/\"]"));
        System.out.println("HomeLink.isDisplayed() = " + HomeLink.isDisplayed());
        WebElement emailText = drive.findElement(By.xpath("//label[@for='email']"));
        System.out.println("emailText.isDisplayed() = " + emailText.isDisplayed());


    }
}
