package com.qascript;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTest  {
	
	 @Test
         System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
         FirefoxOptions options = new FirefoxOptions();
         options.setBinary("/usr/bin/firefox");
         WebDriver driver =  new FirefoxDriver(options);
         driver.get("https://www.impactguru.com");
   
   
    }
}


