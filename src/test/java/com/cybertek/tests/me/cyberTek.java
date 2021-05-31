package com.cybertek.tests.me;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cyberTek {
    public static void main(String[] args) throws InterruptedException {
        WebDriver akrem = WebDriverFactory.getDriver("Chrome");

        akrem.get("https://learn.cybertekschool.com/courses/581");

        WebElement UserName = akrem.findElement(By.id("okta-signin-username"));
        System.out.println("UserName.isDisplayed() = " + UserName.isDisplayed());
        Thread.sleep(1000);
        WebElement passWord = akrem.findElement(By.id("okta-signin-password"));
        System.out.println("passWord.isDisplayed() = " + passWord.isDisplayed());
        Thread.sleep(1000);
        WebElement login = akrem.findElement(By.id("okta-signin-submit"));
        System.out.println("login.isDisplayed() = " + login.isDisplayed());
        // send key send letters
        UserName.sendKeys("Akremabud71@gmail.com");
        passWord.sendKeys("");



        Thread.sleep(10000);

        login.click();




    }
}
