package io.loop.test.homePracticeTasks;

/*
task1
=============
    go to https://loopcamp.vercel.app/nested-frames.html
    validate "LEFT", "MIDDLE", "RIGHT", "BOTTOM"
 */

import io.loop.test.utilities.webdriverUtil2_0;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.util.TimeUtils;

public class Day7_Task1 extends webdriverUtil2_0 {

WebDriver driver;


@Test
    public void task1() {
   driver = getDriver2_0("chrome");
   driver.get("https://loopcamp.vercel.app/nested-frames.html");


}



}
