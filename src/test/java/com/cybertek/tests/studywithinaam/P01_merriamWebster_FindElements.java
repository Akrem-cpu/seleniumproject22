package com.cybertek.tests.studywithinaam;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class P01_merriamWebster_FindElements {
    public static void main(String[] args) {


        WebDriver a = WebDriverFactory.getDriver("chrome");
        a.get("https://www.merriam-webster.com/");
        a.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        List<WebElement> links = a.findElements(By.tagName("a"));
        List<WebElement> DLinks = new ArrayList<>();
        List<WebElement> NLinks = new ArrayList<>();

        int count = 0;
        int notDisplayed = 0;
        for (WebElement each: links) {
          /*  System.out.println(each.getText());*/
            if (each.isDisplayed()){
                DLinks.add(each);
                count++;
            }else {
                NLinks.add(each);
                notDisplayed++;
            }

        }
        System.out.println("Missing text = " + notDisplayed );
        System.out.println("Have text  = " + count );
        System.out.println("Total links = "+links.size());





        a.close();


    }
}
