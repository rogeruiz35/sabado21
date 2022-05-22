package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AppTest {
    @Test
    public void test() throws Exception{
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com");

        Thread.sleep(8000);

        String pageTitle = driver.getTitle();

        Assert.assertEquals(pageTitle, "Login | Salesforce");

        Thread.sleep(500);

        driver.quit();
    }
}
