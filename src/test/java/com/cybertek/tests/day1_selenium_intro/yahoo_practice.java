package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoo_practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver drive = new ChromeDriver();

        drive.get("http://www.yahoo.com");
        Thread.sleep(3000);
//        drive.manage().window().maximize();
        String title = drive.getTitle();
        if (title.equals("Yahoo")){
            System.out.println(title + " correct title");
        }else {
            System.out.println("the title is not correct");
        }

        drive.close();


    }
}
