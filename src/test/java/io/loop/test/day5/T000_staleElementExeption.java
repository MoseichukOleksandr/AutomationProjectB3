package io.loop.test.day5;

import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

//1. Open Chrome browser
//        2. Go to http://the-internet.herokuapp.com/add_remove_elements/
//        3. Click to “Add Element” button
//        4. Verify “Delete” button is displayed after clicking.
//        5. Click to “Delete” button.
//        6. Verify “Delete” button is NOT displayed after clicking.
//        USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
public class T000_staleElementExeption {
    public static void main(String[] args) {

        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement addButton = driver.findElement(By.xpath("//button[contains(.,'Add Element')]"));
        addButton.click();

        WebElement deleteButton = driver.findElement(By.xpath("//button[contains(.,'Delete')]"));
        if (deleteButton.isDisplayed()){
            System.out.println("\"Delete button is dispayed");

        }else {
            System.out.println("\"Delete button is NOT dispayed");
        }

        deleteButton.click();

        try {
            deleteButton.isDisplayed();
        } catch (StaleElementReferenceException e){
            System.out.println("exeption handle");
            System.out.println("element is not displayed");
        }


    }
}
