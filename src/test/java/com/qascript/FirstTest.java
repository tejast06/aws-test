package com.qascript;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class FirstTest {
	 @Test
         public void OpenBrowser() {
         Thread.sleep(15000);
        WebDriver driver;
	Thread.sleep(15000);
        System.setProperty("webdriver.chrome.driver","/usr/bin/google-chrome");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.impactguru.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Crowdfunding in India: Best Fundraising Platform Online | ImpactGuru"));
   
    }


   


}


