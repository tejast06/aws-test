package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FirstTest {
	 @Test
         public void OpenBrowser() {
         WebDriver driver;


        ChromeOptions options = new ChromeOptions();
        //options.setHeadless(false);
	options.addArguments("headless");
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        driver = new ChromeDriver(options);
        driver.get("https://www.impactguru.com");
        System.out.println(driver.getTitle());
    }


   


}


