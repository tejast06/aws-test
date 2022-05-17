package com.qascript;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTest {
	 @Test
         public void OpenBrowser() {
       System.setProperty("webdriver.gecko.driver", " /usr/bin/geckodriver");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.impactguru.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }


   


}


