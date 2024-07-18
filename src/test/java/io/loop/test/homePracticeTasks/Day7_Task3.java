package io.loop.test.homePracticeTasks;

import io.loop.test.base.TestBase;
import io.loop.test.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.Assert.assertEquals;

public class Day7_Task3 extends TestBase {
    /*
    go to https://loopcamp.vercel.app/
click "Multiple Windows" link
Validate "Powered by Loopcamp" is displayed
Validate title is "Windows"
Click - click here
Switch to new window and validate title

     */

    @Test
    public void testVersel() throws InterruptedException {
        driver.get("https://loopcamp.vercel.app/");
        WebElement elementMultipleW = driver.findElement(By.xpath("//a[.='Multiple Windows']"));
        elementMultipleW.click();

        WebElement poweredBYLoop = driver.findElement(By.xpath("//div[(text()='Powered by ')]"));
        boolean expectedDispalay = true;
        boolean actualDisplay = poweredBYLoop.isDisplayed();
        assertEquals(expectedDispalay, actualDisplay, "Powered by LOOPCAMP is not displayed");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        assertEquals(actualTitle, expectedTitle, "Title is not match to Window");

        WebElement clickHere = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHere.click();

        String title = "New Window";
        BrowserUtils.switchToWindow(driver, title);
        Thread.sleep(3000);
        String actualTitleNew = driver.getTitle();

        String expectedTitleNew = "New Window";
        assertEquals(actualTitleNew, expectedTitleNew, "Actual Title "+ actualTitleNew+" is not match to "+expectedTitleNew);


    }

}
