package io.loop.test.homePracticeTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1. go to https://loopcamp.vercel.app/forgot-password.html
2. locate 5 elements, forgot password, email, email input, retrieve password, powered by LOOPCAMP
3. use css
4. verify those elements are displayed

 */

public class Day4_Task1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://loopcamp.vercel.app/forgot-password.html");
        driver.manage().window().maximize();

//        WebElement forgotPasswordHeading = driver.findElement(By.xpath("//*[@id='content']/div/h2"));
//        WebElement e_Mail = driver.findElement(By.xpath("//*[.='E-mail']"));
//        WebElement emailInput = driver.findElement(By.id("email"));
//        WebElement buttonRetrivePassword = driver.findElement(By.xpath("//*[@id='form_submit']/i"));
//        WebElement poweredByLoopcamp = driver.findElement(By.xpath("//*[@class='large-4 large-centered columns']/div"));


        WebElement forgotPasswordHeading = driver.findElement(By.cssSelector("div[class='example']>h2"));
        System.out.println("forgotPasswordHeading.getText() = " + forgotPasswordHeading.isDisplayed());


        WebElement e_Mail = driver.findElement(By.cssSelector("div[class='large-6 small-12 columns']>label"));
        System.out.println("e_Mail = " + e_Mail.isDisplayed());


        WebElement emailInput = driver.findElement(By.cssSelector("div[class='large-6 small-12 columns']>input"));
        System.out.println("emailInput = " + emailInput.isDisplayed());


        WebElement buttonRetrivePassword = driver.findElement(By.cssSelector("button[id = 'form_submit']"));
        System.out.println("buttonRetrivePassword = " + buttonRetrivePassword.isDisplayed());

        WebElement poweredByLoopcamp = driver.findElement(By.cssSelector("div[class='large-4 large-centered columns']>div"));
        System.out.println("poweredByLoopcamp = " + poweredByLoopcamp.isDisplayed());



    }
}
