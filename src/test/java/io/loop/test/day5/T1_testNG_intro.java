package io.loop.test.day5;

import org.testng.Assert;
import org.testng.annotations.*;

import javax.swing.plaf.PanelUI;

public class T1_testNG_intro {
    @Test(priority =   2)
    public void test2(){
        System.out.println("Test 2 IS RUNNING");
    }


    @Test (priority = 1)
    public void test1(){
        System.out.println("Test 1 is running");
        String actual = "Feyruz";
        String  expected = "Feyruz";
        Assert.assertEquals(actual,expected, "it will show only if test is fail" );
    }



    @BeforeMethod
    public void setUpMethod(){
        System.out.println("before method is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After Method is running");
    }

    @BeforeClass
    public void setUp(){
        System.out.println("before class");
    }
    @AfterClass
    public void tearDown(){
        System.out.println("after class");
    }
}
