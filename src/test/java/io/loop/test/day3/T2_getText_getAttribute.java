package io.loop.test.day3;

import io.loop.test.utilities.LoopCampConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {

            /*
    go to url: https://loopcamp.vercel.app/registration_form.html
    verify header text expected:  Registration form
    verify placeholder attribute value expected - username
     */

        // got to url
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/registration_form.html");

        WebElement headerForForm = driver.findElement(By.tagName("h2"));
        String actualHeaderForForm = headerForForm.getText();

        if (actualHeaderForForm.equals(LoopCampConstants.EXPECTED_HEADER_FOR_FORM)) {
            System.out.println("Expected header for form: \"" + LoopCampConstants.EXPECTED_HEADER_FOR_FORM + "\", matches actual header: \"" + actualHeaderForForm + "\" => TEST PASSED");
        } else {
            System.err.println("Expected header for form: \"" + LoopCampConstants.EXPECTED_HEADER_FOR_FORM + "\", DOES NOT MATCH actual header: \"" + actualHeaderForForm + "\" => TEST FAILED");
        }

        WebElement firstNamePlaceHolder = driver.findElement(By.name("firstname"));
        String actuaPlaceHolderForFirstName = firstNamePlaceHolder.getAttribute("placeholder");

        if (actuaPlaceHolderForFirstName.equals(LoopCampConstants.EXPECTED_PLACEHOLDER_FIRSTNAME)) {
            System.out.println("Expected placeholder matches with actual ");
            System.out.println("TEST PASSED");
        } else {
            System.out.println("Expected placeholder are DOES NOT MAtch  with actual");
            System.err.println("TEST FAILED");

        }





    }
}
