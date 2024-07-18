package io.loop.test.homePracticeTasks;

import com.github.javafaker.Faker;
import io.loop.test.utilities.ConfigurationReader;
import io.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Day8_Task1 {

    @Test
    public void PositiveTest() {
        Driver.getDriver().get(ConfigurationReader.getProperties("loopcamp-reg-form"));

        Faker faker = new Faker();
        WebElement firstNameInput = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstNameInput.sendKeys(faker.name().firstName());

        WebElement lastNameInput = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastNameInput.sendKeys(faker.name().lastName());

        WebElement userNameInput = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        userNameInput.sendKeys(faker.name().username().replace('.','A'));

        WebElement emailAdressInput = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        emailAdressInput.sendKeys(faker.internet().emailAddress());

        WebElement passInput = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        passInput.sendKeys(faker.internet().password());

        WebElement phoneInput = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneInput.sendKeys(faker.numerify("###-###-####"));

        WebElement buttonGenderFemale = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        buttonGenderFemale.click();

        WebElement buttonGenderOther = Driver.getDriver().findElement(By.xpath("//input[@value='other']"));
        buttonGenderOther.click();

        WebElement buttonGenderMale = Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        buttonGenderMale.click();

        WebElement bDateInput = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        bDateInput.sendKeys(faker.numerify("05/05/2000"));

        WebElement selectDepartmentOffice = Driver.getDriver().findElement(By.xpath("//select[@name='department']"));
        selectDepartmentOffice.click();
        Select selectDepartment = new Select( Driver.getDriver().findElement(By.xpath("//select[@name='department']")));

        for (int i = 2; i < 10; i++) {
            selectDepartmentOffice.click();
            selectDepartment.selectByIndex(i);
        }

        WebElement selectJobTitle = Driver.getDriver().findElement(By.xpath("//select[@name='job_title']"));
        selectJobTitle.click();
        Select selectJob = new Select( Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));

        for (int i = 2; i < 9; i++) {
            selectJobTitle.click();
            selectJob.selectByIndex(i);
        }

        WebElement progLangC = Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox1']"));
       progLangC.click();

        WebElement progLangJava = Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox2']"));
        progLangJava.click();

        WebElement progLangJS = Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox3']"));
        progLangJS.click();

        WebElement signUp = Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']"));
        signUp.click();

        String expectedResult = "Thanks for signing up!";
        WebElement actual = Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']"));
        String actualResult = actual.getText();

        Assert.assertEquals(expectedResult,actualResult,"Actual message "+actual.getText()+" does NOT match expected "+expectedResult+" - TEST FAIL");



    }
    public void NegativeTest() {
        Driver.getDriver().get(ConfigurationReader.getProperties("loopcamp-reg-form"));

        Faker faker = new Faker();
        WebElement firstNameInput = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstNameInput.sendKeys(faker.name().firstName());

        WebElement lastNameInput = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastNameInput.sendKeys(faker.name().lastName());

        WebElement userNameInput = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        userNameInput.sendKeys(faker.name().username());

        WebElement emailAdressInput = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        emailAdressInput.sendKeys(faker.internet().emailAddress());

        WebElement passInput = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        passInput.sendKeys(faker.internet().password());

        WebElement phoneInput = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneInput.sendKeys(faker.numerify("###-###-####"));

        WebElement buttonGenderFemale = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        buttonGenderFemale.click();

        WebElement buttonGenderOther = Driver.getDriver().findElement(By.xpath("//input[@value='other']"));
        buttonGenderOther.click();

        WebElement buttonGenderMale = Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        buttonGenderMale.click();

        WebElement bDateInput = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        bDateInput.sendKeys(faker.numerify("05/05/2000"));

        WebElement selectDepartmentOffice = Driver.getDriver().findElement(By.xpath("//select[@name='department']"));
        selectDepartmentOffice.click();
        Select selectDepartment = new Select( Driver.getDriver().findElement(By.xpath("//select[@name='department']")));

        for (int i = 2; i < 10; i++) {
            selectDepartmentOffice.click();
            selectDepartment.selectByIndex(i);
        }

        WebElement selectJobTitle = Driver.getDriver().findElement(By.xpath("//select[@name='job_title']"));
        selectJobTitle.click();
        Select selectJob = new Select( Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));

        for (int i = 2; i < 9; i++) {
            selectJobTitle.click();
            selectJob.selectByIndex(i);
        }

        WebElement progLangC = Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox1']"));
        progLangC.click();

        WebElement progLangJava = Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox2']"));
        progLangJava.click();

        WebElement progLangJS = Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox3']"));
        progLangJS.click();

        WebElement signUp = Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']"));
        signUp.click();

        String expectedResult = "Please fix the errors below";
        WebElement actual = Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']"));
        String actualResult = actual.getText();

        Assert.assertEquals(expectedResult,actualResult,"Actual message "+actual.getText()+" does NOT match expected "+expectedResult+" - TEST FAIL");



    }


}
