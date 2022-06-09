package com.qascript;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTest  {
	
	 @Test
         public void OpenBrowser() {
         FirefoxBinary firefoxBinary = new FirefoxBinary();

         firefoxBinary.addCommandLineOptions("--headless");

         firefoxBinary.addCommandLineOptions("--no-sandbox");

         System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");

         FirefoxOptions firefoxOptions = new FirefoxOptions();

         firefoxOptions.setBinary(firefoxBinary);

         FirefoxDriver driver = new FirefoxDriver(firefoxOptions);

         driver.get("https://google.com");
   
   
    }
}


