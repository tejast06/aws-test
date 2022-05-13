package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {


    @Test
    public void OpenBrowser()  {
       
        //old one
       // WebDriver driver;
       //System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        //ChromeOptions options = new ChromeOptions();
       // options.addArguments("browser");
       // options.addArguments("disable-gpu");
       // options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
      //  options.addArguments("--privileged");
       // driver = new ChromeDriver(options);
    //    driver.get("https://www.impactguru.com/");
     //   System.out.println("Title of the page is: " + driver.getTitle());
    
        //New one
       System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
       ChromeOptions options = new ChromeOptions();
       options.addArguments("start-maximized"); // open Browser in maximized mode
       options.addArguments("disable-infobars"); // disabling infobars
       options.addArguments("--disable-extensions"); // disabling extensions
       options.addArguments("--disable-gpu"); // applicable to windows os only
       options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
       options.addArguments("--no-sandbox"); // Bypass OS security model
       WebDriver driver = new ChromeDriver(options);
       driver.get("https://www.impactguru.com");
        System.out.println("Title of the page is: " + driver.getTitle()); 
    }


}


