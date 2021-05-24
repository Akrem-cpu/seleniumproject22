package com.cybertek.tests.day6_testing_intro_Testing;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setUpClass(){
        System.out.println("---> before Class is running...");
    }
    @AfterClass
    public void closeUpCLass(){
        System.out.println("---> After class is running ");
    }


    @BeforeMethod
    public void setUpMethod(){
        System.out.println("---> before method is running...");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("-----> After Method is running ");
    }
    @Test(priority = 1)
    public  void test1(){
        System.out.println("running test 1....");
        String actual = "apple";
        String expected = "apple";
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void test2(){
        System.out.println("running test 2......");
        Assert.assertTrue("name".equals("name"));
    }





}
