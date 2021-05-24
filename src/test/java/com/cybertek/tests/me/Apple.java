package com.cybertek.tests.me;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Apple {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebElement checkBox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        System.out.println("checkBox1.isDisplayed() = " + checkBox1.isDisplayed());
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));
        System.out.println("checkBox2.isDisplayed() = " + checkBox2.isDisplayed());
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        if (!checkBox1.isSelected()){
            System.out.println("Check box one is selected by default TEST PASSED");
        }else {
            System.out.println("Check box one is Not selected by default TEST FAILED");
        }






        checkBox1.click();

        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());

        checkBox2.click();
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());




        driver.close();


    }
}
