package com.cybertek.tests.me;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_BasicLoginAuthentication {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver drive = new ChromeDriver();
        drive.manage().window().maximize();

        drive.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        Thread.sleep(600);

        WebElement username = drive.findElement(By.id("ctl00_MainContent_username"));
        WebElement password = drive.findElement(By.id("ctl00_MainContent_password"));
        WebElement loginIn = drive.findElement(By.id("ctl00_MainContent_login_button"));
        Thread.sleep(600);

        username.sendKeys("Tester");
        Thread.sleep(600);
        password.sendKeys("test");
        Thread.sleep(600);
        loginIn.click();
        Thread.sleep(600);
        String actualTitle = drive.getTitle();
        String expectedTitle = "Web Orders";
        Thread.sleep(600);
        if (actualTitle.equals(expectedTitle)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
 /*           String a=  drive.getCurrentUrl();
            System.out.println(a);
*/        }







    }
}
