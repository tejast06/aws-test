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
	    options.addArguments("headless");
        options.addArguments("browser");		
	ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NONE);
        driver = new ChromeDriver(options);
        driver.get("https://www.impactguru.com");
        
 
    }


}


