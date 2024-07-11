package io.loop.test.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class webdriverUtil2_0 {

    public static WebDriver getDriver2_0(String browser) {

        WebDriver driver = new ChromeDriver();
        switch (browser) {
            case "chrome":
                return new ChromeDriver();
            case "firefox":
                return new FirefoxDriver();
            case "EDGE":
                return new InternetExplorerDriver();
            case "safari":
                return new SafariDriver();
            default:
                System.out.println("Invalid browser: " + browser);
        }
        return null;
    }


}
