package io.loop.test.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocatorsPractice {
    public static void main(String[] args) {

          // create driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to loopcamp practice page
        driver.get("https://loopcamp.vercel.app/registration_form.html");
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Loop");

//        WebElement withClassname = driver.findElement(By.className("form-control"));
//        withClassname.sendKeys("Loop");

//WebElement lastnameWithClass = driver.findElement(By.className("form-control"));
//lastnameWithClass.sendKeys("Academy");

        WebElement lastnameWithClass = driver.findElement(By.name("lastname"));
 lastnameWithClass.sendKeys("Academy");

 WebElement female = driver.findElement(By.name("gender"));
 female.click();


//        WebElement femaleRadioButton = driver.findElement(By.value("female"));
//        femaleRadioButton.click();
//

    }
}
