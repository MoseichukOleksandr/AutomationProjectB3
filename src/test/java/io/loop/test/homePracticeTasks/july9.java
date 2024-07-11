package io.loop.test.homePracticeTasks;

import io.loop.test.utilities.webdriverUtil2_0;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/*
    go to https://loopcamp.vercel.app/nested-frames.html
    validate "LEFT", "MIDDLE", "RIGHT", "BOTTOM"

 */

public class july9 extends webdriverUtil2_0 {
    WebDriver driver;

    @Test
    public void july9() {
       driver = getDriver2_0("chrome");
        driver.get("https://loopcamp.vercel.app/nested-frames.html");

    }
}
