package io.loop.test.homePracticeTasks;


import io.loop.test.utilities.DocuportConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1. login to docuport application
2. logout from docuport application
3. Validate successful login
4. Validate successful logout
 */
public class Day4_Task2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://beta.docuport.app/");

        WebElement inputUsername = driver.findElement(By.xpath("//input[@id='input-14']"));
        inputUsername.sendKeys(DocuportConstants.USERNAME_CLIENT);

        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='input-15']"));
        inputPassword.sendKeys(DocuportConstants.PASSWORD_CLIENT);

        WebElement loginButton = driver.findElement(By.xpath("//div[@class='col col-12']/button"));
        loginButton.click();

        Thread.sleep(3000);
        WebElement dropDownChoseAccountToSelectContinueButton = driver.findElement(By.xpath("//div[@class='d-modal__footer']/div/button"));
        if(dropDownChoseAccountToSelectContinueButton.isDisplayed()){
            System.out.println("Success login");
        } else{
            System.out.println("Fail login");
        }
        dropDownChoseAccountToSelectContinueButton.click();
        Thread.sleep(1000);
        WebElement profileMenueButton = driver.findElement(By.xpath("//div[@class='v-avatar primary']"));
        profileMenueButton.click();
        Thread.sleep(1000);

        WebElement logOutButton = driver.findElement(By.xpath("//div[@id='list-item-160']"));
        logOutButton.click();
        Thread.sleep(1000);

        String expectedUrl = "https://beta.docuport.app/login";
        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)) {
            System.out.println("Actual url: " + actualUrl + " matches expected url: " + expectedUrl + " Success logOUT");
        } else {
            System.err.printf("Actual url: " + actualUrl + " DOES NOT match expected url: " + expectedUrl + " TEST FAIL not success logOUT");
        }
        driver.quit();
    }
}
