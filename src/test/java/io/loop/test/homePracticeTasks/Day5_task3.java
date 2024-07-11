package io.loop.test.homePracticeTasks;

import io.loop.test.utilities.DocuportConstants;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static io.loop.test.utilities.DocuportConstants.DOCUPORT_URL;

/*
1. login as an advisor
2. go to received document
3. click search
4. click status dropdown
5. choose in progress
 */
public class Day5_task3 {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(DOCUPORT_URL);

    }
    @Test
    public void loginAsAdvisor() {
        WebElement inputAdvisorname = driver.findElement(By.xpath("//input[@id='input-14']"));
        inputAdvisorname.sendKeys(DocuportConstants.USERNAME_ADVISOR);

        WebElement inputAdvisorPassword = driver.findElement(By.xpath("//input[@id='input-15']"));
        inputAdvisorPassword.sendKeys(DocuportConstants.PASSWORD_ADVISOR);

        WebElement loginButton = driver.findElement(By.xpath("//div[@class='col col-12']/button"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement receivedDocument = driver.findElement(By.xpath("//div[@class='mb-4 col-md-4 col-12']"));
        receivedDocument.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement searchButton = driver.findElement(By.xpath("//button[@class='mr-3 mb-1 mb-sm-0 v-btn v-btn--has-bg theme--light v-size--large']"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement dropdownSelect = driver.findElement(By.xpath("//div[@class='v-select__selection v-select__selection--comma']"));
        dropdownSelect.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement inProgressDropDown = driver.findElement(By.xpath("//div[@class='v-list-item v-list-item--link theme--light']/div[.='In progress']"));
        inProgressDropDown.click();

//        WebElement currentStatusDropDown = driver.findElement(By.xpath("//div[@class='v-select__selection v-select__selection--comma']"));
//        Assert.assertEquals(currentStatusDropDown, "In progress");
    }
}
