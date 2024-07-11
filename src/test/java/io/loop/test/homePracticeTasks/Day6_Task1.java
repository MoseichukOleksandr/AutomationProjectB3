package io.loop.test.homePracticeTasks;

import io.loop.test.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * go to https://demoqa.com/alerts
 * click - click button to see alert
 * handle alert
 * click - On button click, alert will appear after 5 seconds
 * handle alert
 * click - On button click, confirm box will appear
 * click ok and validate - You selected Ok
 * after that do it again this time cancel and validate - You selected Cancel
 * click - On button click, prompt box will appear
 * enter "Loop Academy" and validate You entered Loop Academy
 */
public class Day6_Task1 extends TestBase {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        String text = "Loopcamp";

        
    }
}
