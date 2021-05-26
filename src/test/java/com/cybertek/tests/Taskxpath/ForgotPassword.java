package com.cybertek.tests.Taskxpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ForgotPassword {
    WebDriver driver = WebDriverFactory.getDriver("Chrome");

    @AfterClass
     public void finish() throws InterruptedException {
        Thread.sleep(500);
        driver.close();
    }

    @BeforeClass
    public void setUp(){
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();

    }

    @Test
    public void test1(){
        driver.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        WebElement forgotPassword = driver.findElement(By.xpath("//h2"));
        WebElement  emailText = driver.findElement(By.xpath("//label[@for='email']"));
        WebElement  emailBox = driver.findElement(By.xpath("//input[@pattern='[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$']"));
        WebElement retrievePassword = driver.findElement(By.xpath("//i[contains(.,Retrieve)]"));
        WebElement linkCyberTekSchool = driver.findElement(By.xpath("//a[@target='_blank']"));
        WebElement poweredByText = driver.findElement(By.xpath("//a[@target='_blank']/.."));

        Assert.assertTrue(homeLink.isDisplayed());
        Assert.assertTrue(forgotPassword.isDisplayed());
        Assert.assertTrue(emailText.isDisplayed());
        Assert.assertTrue(emailBox.isDisplayed());
        Assert.assertTrue(retrievePassword.isDisplayed());
        Assert.assertTrue(linkCyberTekSchool.isDisplayed());
        Assert.assertTrue(poweredByText.isDisplayed());

    }






}
