package com.qascript;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTest {
	 @Test
         public void OpenBrowser() {
        System.setProperty("webdriver.chrome.driver", " /usr/bin/chromedriver/chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.impactguru.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Crowdfunding in India: Best Fundraising Platform Online | ImpactGuru"));
    }


   


}


