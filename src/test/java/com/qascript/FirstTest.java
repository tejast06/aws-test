package com.qascript;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTest {
	 @Test
         public void OpenBrowser() {
       WebDriver driver;

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\impac\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");

        DesiredCapabilities capabilities = DesiredCapabilities.firefox();

        capabilities.setCapability("marionette", true);

        driver = new FirefoxDriver(capabilities);

        driver.get("https://google.com");
    }


   


}


