package io.loop.test.day8;

import io.loop.test.base.TestBase;
import io.loop.test.utilities.ConfigurationReader;
import io.loop.test.utilities.Driver;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

/*
1. Go to “http://demo.guru99.com/test/upload”
2. Upload file into Choose File
3. Click terms of service check box
4. Click Submit File button
5. Validate expected message appeared. Expected: “1 file has been successfully uploaded.
*/
public class T3_upload  {

    @Test
    public void upload_file() throws InterruptedException {

        Driver.getDriver().get(ConfigurationReader.getProperties("guru.url"));
        Thread.sleep(3000);
        WebElement choseFile = Driver.getDriver().findElement(By.xpath("//input[@type='file']"));
        String path = "C:/Users/Kristina/Pictures/Screenshots/Screenshot 2024-07-07 013446.png";
        choseFile.sendKeys(path);

        WebElement checkbox = Driver.getDriver().findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();

        WebElement submithButton = Driver.getDriver().findElement(By.xpath("//button[@id='submitbutton']"));
        submithButton.click();

        Thread.sleep(3000);
        WebElement succsessMessage = Driver.getDriver().findElement(By.xpath("//h3[@id='res']"));

        String expected ="1 file\nhas been successfully uploaded.";
        Assert.assertEquals(expected,succsessMessage.getText());

    }
}
