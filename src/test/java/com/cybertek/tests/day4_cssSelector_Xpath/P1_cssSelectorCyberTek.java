package com.cybertek.tests.day4_cssSelector_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelectorCyberTek {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement forgotPassWordHeader = driver.findElement(By.tagName("h2"));
        WebElement emailLabel = driver.findElement(By.cssSelector("label[for='email']"));
       WebElement emailInputBox = driver.findElement(By.cssSelector("input[name= 'email']"));
       WebElement passWordButton = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
       WebElement textOfCyberTek = driver.findElement(By.cssSelector("div[style='text-align: center;']"));


        System.out.println("homeLink = " + homeLink.isDisplayed());
        System.out.println("forgotPassWordHeader = " + forgotPassWordHeader.isDisplayed());
        System.out.println("emailLabel = " + emailLabel.isDisplayed());
        System.out.println("emailInputBox = " + emailInputBox.isDisplayed());
        System.out.println("passWordButton = " + passWordButton.isDisplayed());
        System.out.println("textOfCyberTek = " + textOfCyberTek.isDisplayed());


    }
}
