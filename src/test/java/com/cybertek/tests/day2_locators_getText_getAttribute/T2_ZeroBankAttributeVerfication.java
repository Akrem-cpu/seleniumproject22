package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankAttributeVerfication {
    public static void main(String[] args) {
        //TC #2: Zero Bank link text verification
        //1. Open Chrome browser
        //2. Go to http://zero.webappsecurity.com/login.html
        //3. Verify link text from top left:
        //Expected: “Zero Bank”
        //4. Verify link href attribute value contains:
        //Expected: “index.html”
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");



       WebElement zeroBankLike =  driver.findElement(By.className("brand"));
        //3. Verify link text from top left:
        //Expected: “Zero Bank”

        String expectedLikeText = "Zero Bank";
        String actualLikeText = zeroBankLike.getText();

        if (actualLikeText.equals(expectedLikeText)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        String expectedAttributeValue = "index.html";
        String actualHerfValue = zeroBankLike.getAttribute("href");
        System.out.println(actualHerfValue);
        if (actualHerfValue.contains(expectedAttributeValue)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }
}
