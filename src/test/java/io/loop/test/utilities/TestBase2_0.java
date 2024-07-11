package io.loop.test.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestBase2_0 {
    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = webdriverUtil2_0.getDriver2_0("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }


}
