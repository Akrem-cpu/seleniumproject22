package com.cybertek.tests.Taskxpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class verifying {
    WebDriver driver = WebDriverFactory.getDriver("Chrome");

 /*   @AfterClass
    public void finish() throws InterruptedException {
        Thread.sleep(500);
        driver.close();
    }*/

    @BeforeClass
    public void setUp(){
        driver.get("http://practice.cybertekschool.com/add_remove_elements");
        driver.manage().window().maximize();

    }
    @Test
    public void test1(){

    }

}
