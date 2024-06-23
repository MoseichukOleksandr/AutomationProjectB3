package io.loop.test.homePracticeTasks;

import io.loop.test.utilities.DocuportConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1. navigate to docuport application
2. validate placeholders for user name and password
3. without sending username and password click login button
4. validate username and password error messages
 */
public class Day4_Task3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://beta.docuport.app/");

        WebElement loginButton = driver.findElement(By.xpath("//div[@class='col col-12']/button"));
        loginButton.click();

        WebElement errorMessageForUserNameOrEmail = driver.findElement(By.xpath("//div[contains(text(),'Please enter your username or email address')] "));
        String actualerrorMessageForUserNameOrEmail = errorMessageForUserNameOrEmail.getText();

        if (actualerrorMessageForUserNameOrEmail.equals(DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_USER_NAME_OR_EMAIL)) {
            System.out.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_USER_NAME_OR_EMAIL + ", matches actual error message: " + actualerrorMessageForUserNameOrEmail + " => TEST PASS");
        } else {
            System.err.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_USER_NAME_OR_EMAIL + ", DOES NOT MATCH actual error message: " + actualerrorMessageForUserNameOrEmail + " => TEST FAIL");
        }

        WebElement errorMessageForEmptyPassword = driver.findElement(By.xpath("//div[contains(text(),'Please enter your password')] "));
        String actualerrorMessageForEmptyPassword = errorMessageForEmptyPassword.getText();


        if (actualerrorMessageForEmptyPassword.equals(DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD)) {
            System.out.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ", matches actual error message: " + actualerrorMessageForEmptyPassword + " => TEST PASS");
        } else {
            System.err.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ", DOES NOT MATCH actual error message: " + actualerrorMessageForEmptyPassword + " => TEST FAIL");
        }
        Thread.sleep(1000);
        driver.quit();

    }
}
