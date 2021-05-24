package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSerachVerfiation {
    public static void main(String[] args) {
        //TC #4:	Google	search
        //1- Open	a	chrome	browser
        //2- Go	to:	https://google.com
        //3- Write	“apple”	in	search	box
        //4- Click	google	search	button
        //5- Verify	title:
        //Expected:	Title	should	start	with	“apple”	word

        //TC #4:	Google	search
        //1- Open	a	chrome	browser
        //2- Go	to:	https://google.com
        WebDriverManager.chromedriver().setup();
        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();
        drive.get("https://google.com");


        //3- Write	“apple”	in	search	box
         drive.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);

        //5- Verify	title:
        String expectedTitle = "apple";
        String actualTitle = drive.getTitle();
        System.out.println(actualTitle);

        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title Verification FAILED");
        }





    }
}
