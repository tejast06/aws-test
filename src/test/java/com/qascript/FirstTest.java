package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {


    @Test
    public void OpenBrowser()  {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("browser");
        options.addArguments("disable-gpu");
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
        options.addArguments("--privileged");
        options.setExperimentalOption("useAutomationExtension", true);
        driver = new ChromeDriver(options);
        driver.get("https://www.impactguru.com/");
        System.out.println("Title of the page is: " + driver.getTitle());
        
       
    }


}


