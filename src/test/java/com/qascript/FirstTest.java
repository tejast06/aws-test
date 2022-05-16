package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {


    @Test
	 WebDriver driver;  
	    System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
	    options.addArguments("--privileged");
	   options.addArguments("--no-sandbox");
	options.addArguments("window-size=1400,800");    
        options.addArguments("browser");
       options.addArguments("disable-gpu");
	//options.addArguments("--disable-features=VizDisplayCompositor");
        driver = new ChromeDriver(options);
	driver.manage().window().maximize();
        driver.get("https://www.impactguru.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Crowdfunding in India: Best Fundraising Platform Online | ImpactGuru"));
 
	
   
    }


}


