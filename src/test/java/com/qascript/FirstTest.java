package com.qascript;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class FirstTest  {
	
	@Test
         public void OpenBrowser()  {

         FirefoxBinary firefoxBinary = new FirefoxBinary();

        firefoxBinary.addCommandLineOptions("--headless");

        // firefoxBinary.addCommandLineOptions("--no-sandbox");

         System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");

         FirefoxOptions firefoxOptions = new FirefoxOptions();

         firefoxOptions.setBinary(firefoxBinary);

         WebDriver driver = new FirefoxDriver(firefoxOptions);

         driver.get("https://www.google.com/");
         System.out.println(driver.getTitle());
    }
}


