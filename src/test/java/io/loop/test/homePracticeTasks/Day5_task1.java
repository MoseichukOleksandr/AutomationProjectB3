package io.loop.test.homePracticeTasks;

import io.loop.test.day5.T4_dropdown_options;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static io.loop.test.utilities.HerokuappConstans.DROPDOWN_NAME;

/*
1. go to http://the-internet.herokuapp.com/dropdown
2. validate "Please select an option" is selected by default
3. Choose option 1 and validate that it is selected
4. Choose option 2 and validate that it is selected
5. Validate dropdown name is "Dropdown List"
 */

public class Day5_task1 {

    WebDriver driver;
    WebElement DropDownTitle;


    @BeforeClass
    public void setUpMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/dropdown");
    }

    @Test
    public void dropDownTest1() {
        Select selectAnOptionOfDropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        selectAnOptionOfDropDown.selectByValue("1");
        Assert.assertEquals(selectAnOptionOfDropDown.getFirstSelectedOption().getText(), "Option 1");
    }

    @Test
    public void dropDownTest2() {
        Select selectAnOptionOfDropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        selectAnOptionOfDropDown.selectByValue("2");
        Assert.assertEquals(selectAnOptionOfDropDown.getFirstSelectedOption().getText(), "Option 2");
    }

    @Test
    public void dropDownNameTest() {
        DropDownTitle = driver.findElement(By.xpath("//*[@id='content']/div/h3"));
        Assert.assertEquals(DropDownTitle.getText(), DROPDOWN_NAME);
    };
}

