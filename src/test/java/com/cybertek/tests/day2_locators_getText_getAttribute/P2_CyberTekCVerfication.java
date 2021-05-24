package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CyberTekCVerfication {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver go = new ChromeDriver();
        go.manage().window().maximize();
        String ActualUrl = go.getCurrentUrl();

        go.get("http:/practice.cybertekschool.com/");


        String expectedUrl = "cybertekschool";
        if(ActualUrl.equals(expectedUrl)){
            System.out.println("Url verifications PASSED");
        }else {
            System.out.println("Url Verification FAILED ");
        }

        String expectedTitle = "Practice";
        String actualTitle = go.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verifications PASSED");
        }else {
            System.out.println("Title verifications FAILED");
        }











    }
}
