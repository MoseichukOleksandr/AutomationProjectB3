package io.loop.test.homePracticeTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
Task 1
================
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
 */
public class Task1 {
    public static void main(String[] args) {

        // create the driver object
        WebDriver driver = new ChromeDriver();

        // navigate to google
        driver.get("https://www.google.com");

        // maximize
        driver.manage().window().maximize();

        WebElement gmail = driver.findElement(By.className("gb_I"));
        gmail.click();

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("expected title is " + expectedTitle +  " is match actual title "+ actualTitle);
        } else {
            System.err.println("expected title is " + expectedTitle +  " is different than actual title "+ actualTitle);
        }

        driver.navigate().back();

        String expectedTitleGoggle = "Google";
        String actualTitleGoogle = driver.getTitle();

        if (expectedTitleGoggle.equals(actualTitleGoogle)) {
            System.out.println("expected title is " + expectedTitleGoggle +  " is match actual title "+ actualTitleGoogle);
        } else {
            System.err.println("expected title is " + expectedTitleGoggle +  " is different than actual title "+ actualTitleGoogle);
        }
        driver.quit();

    }
}
