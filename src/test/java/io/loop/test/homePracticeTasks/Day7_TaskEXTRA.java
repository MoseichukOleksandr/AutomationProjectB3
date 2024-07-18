package io.loop.test.homePracticeTasks;

import com.beust.ah.A;
import io.loop.test.base.TestBase;
import io.loop.test.utilities.ConfigurationReader;
import io.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


import static io.loop.test.utilities.Driver.getDriver;

public class Day7_TaskEXTRA {

    @Test
    public void taskEXTRA() {
        Driver.getDriver().get(ConfigurationReader.getProperties("docuport_resident"));
        Faker faker = new Faker();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement TypeOfBussinesText = Driver.getDriver().findElement(By.xpath("//h4[.=' What type of business do you want to start? ']"));
        String expected = "What type of business do you want to start?";
        String actual = TypeOfBussinesText.getText();
        Assert.assertEquals(actual, expected, "Message 'Type of business do you want to start?' is incorrect. TEST FAIL");
        WebElement LlcRadioButton = Driver.getDriver().findElement(By.xpath("//div[@class='v-input--selection-controls__ripple primary--text']"));
        WebElement CorporationRadioButton = Driver.getDriver().findElement(By.xpath("//div[@class='v-input--selection-controls__ripple']"));
        CorporationRadioButton.click();
        WebElement formationStateText = Driver.getDriver().findElement(By.xpath("//h4[text()=' Formation State * ']"));
        String expected2 = "Formation State *";
        String actual2 = formationStateText.getText();
        Assert.assertEquals(actual2, expected2, "Message 'Formation State * ' is incorrect. TEST FAIL");
        WebElement WashingtonDCRadiobutton = Driver.getDriver().findElement(By.xpath("//label[.='Washington D.C.']/preceding-sibling::div"));
        WebElement MarylandDCRadiobutton = Driver.getDriver().findElement(By.xpath("//label[.='Maryland']/preceding-sibling::div"));
        WebElement VirginiaDCRadiobutton = Driver.getDriver().findElement(By.xpath("//label[.='Virginia']/preceding-sibling::div"));
        WebElement DelawereDCRadiobutton = Driver.getDriver().findElement(By.xpath("//label[.='Delaware']/preceding-sibling::div"));
        List<WebElement> cityRadioButtons = new ArrayList<>();
        cityRadioButtons.add(WashingtonDCRadiobutton);
        cityRadioButtons.add(MarylandDCRadiobutton);
        cityRadioButtons.add(VirginiaDCRadiobutton);
        cityRadioButtons.add(DelawereDCRadiobutton);
        for (WebElement cityRadioButton : cityRadioButtons) {
            cityRadioButton.click();
        }
        WashingtonDCRadiobutton.click();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement weWillCheckNameText = Driver.getDriver().findElement(By.xpath("//p[.=' We will check the name availability for you ']"));

        String expected3 = "We will check the name availability for you";
        String actual3 = weWillCheckNameText.getText().trim();
        Assert.assertEquals(expected3, actual3, "Message 'We will check the name availability for you'. is incorrect. TEST FAIL");
        WebElement legalCompanyPlaceholder = getDriver().findElement(By.xpath("//label[.='Legal Company Name  *']"));
        String expectedPlacehold = "Legal Company Name *";
        String actualPlaceholder = legalCompanyPlaceholder.getText().trim();
        Assert.assertEquals(expectedPlacehold, actualPlaceholder, "Message 'Legal Company name *' is incorrect. TEST FAIL ");

        WebElement legalCompanyNameInput = getDriver().findElement(By.xpath("//div[.='Legal Company Name  *']//following-sibling::input"));
        legalCompanyNameInput.sendKeys(faker.commerce().productName());

        getDriver().findElement(By.xpath("//div[.='DBA (Doing Business As)']//following-sibling::input")).sendKeys(faker.commerce().department());
        getDriver().findElement(By.xpath("//div[.='Industry *']//following-sibling::input[1]")).click();
        getDriver().findElement(By.xpath("//div[.='Industry *']//following-sibling::input[1]")).sendKeys("Retail");
        getDriver().findElement(By.xpath("//div[span='Retail']")).click();
        getDriver().findElement(By.xpath("//div[.='First name *']//following-sibling::input")).sendKeys(faker.name().firstName());
        getDriver().findElement(By.xpath("//div[.='Last name *']//following-sibling::input")).sendKeys(faker.name().lastName());
        getDriver().findElement(By.xpath("//div[.='Email address *']//following-sibling::input")).sendKeys(faker.internet().emailAddress());
        getDriver().findElement(By.xpath("//div[.='Phone number *']//following-sibling::input")).sendKeys(faker.phoneNumber().cellPhone());
        getDriver().findElement(By.xpath("//div[.='Fax']//following-sibling::input")).sendKeys(faker.phoneNumber().phoneNumber());
        getDriver().findElement(By.xpath("//span[text()=' Next ']/..")).click();


    }

}
