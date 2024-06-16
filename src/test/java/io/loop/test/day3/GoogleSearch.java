package io.loop.test.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Navigate to Google search
 * maximize the page
 * get title of the page
 * get url of the page
 * validate the title, expected title is "Google"
 * validate the url of the page, expected url is "https://www.google.com/"
 * close the brower
 */
public class GoogleSearch {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        // maximaze
        driver.manage().window().maximize();

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();


        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Actual titles: " + actualTitle + " matches expected title: " + expectedTitle + "TEST PASS");

        } else {
            System.err.println("Actual title " + actualTitle + " does not match expected title " + expectedTitle + "TEST FAIL");
        }

        System.out.println(driver.getCurrentUrl());

        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)) {
            System.out.println("Actual url: " + actualUrl + " matches expected url: " + expectedUrl + "TEST PASS");
        } else {
            System.err.printf("Actual url: " + actualUrl + " DOES NOT match expected url: " + expectedUrl + " TEST FAIL");
        }

        driver.quit();

    }
}
