package io.loop.test.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    public static void switchWindowAndValidate(WebDriver driver, String expectedUrl,String expectedTitle){
        expectedTitle = expectedTitle.toLowerCase();
        expectedUrl = expectedUrl.toLowerCase();

        Set <String> windowHandles = driver.getWindowHandles();

        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            if (driver.getCurrentUrl().toLowerCase().contains(expectedUrl)){
                break;
            }

        }
        Assert.assertTrue(driver.getTitle().toLowerCase().contains(expectedTitle));
    }

    public static void switchToWindow(WebDriver driver, String targetTitle ){

        String origin = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
            if (driver.getTitle().contains(targetTitle)){
                return;
            }
        }


    }

}
