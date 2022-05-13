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
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("browser");
        options.addArguments("disable-gpu");
        options.addArguments("--privileged");
        driver = new ChromeDriver(options);
        driver.get("https://www.impactguru.com");
        System.out.println("Title of the page is: " + driver.getTitle());
   
    }


}


