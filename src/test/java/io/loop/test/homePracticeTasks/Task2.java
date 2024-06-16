package io.loop.test.homePracticeTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”

 */
public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.etsy.com");

        WebElement searchInput = driver.findElement(By.id("global-enhancements-search-query"));
        String searchText = "wooden spoon";
        searchInput.sendKeys(searchText);
        searchInput.submit();

        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Expecned Title "+expectedTitle + " Match actual title "+actualTitle  );
        } else {
            System.out.println("Expecned Title "+expectedTitle + " DOES NOT Match actual title "+actualTitle  );
        }
        Thread.sleep(5000);

            driver.close();
    }
}
