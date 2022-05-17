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
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver/chromedriver.exe");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setJavascriptEnabled(true);
        ChromeOptions opt = new ChromeOptions();
        opt.merge(cap);
        WebDriver driver = new ChromeDriver(opt);
        driver.get("https://www.impactguru.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }


   


}


