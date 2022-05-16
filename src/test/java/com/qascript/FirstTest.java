package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {


    @Test
	 ChromeOptions options = new ChromeOptions();
	 options.setHeadless(true);
         System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
	 WebDriver driver = new ChromeDriver(options);
	 driver.get("https://www.impactguru.com");
	
   
    }


}


