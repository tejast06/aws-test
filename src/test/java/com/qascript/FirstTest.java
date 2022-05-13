package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {


    @Test
    public void OpenBrowser()  {
       
        
        WebDriver driver;
       System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
             options = webdriver.ChromeOptions()
options.add_argument('headless')
options.add_argument('--disable-infobars')
options.add_argument('--disable-dev-shm-usage')
options.add_argument('--no-sandbox')
options.add_argument('--remote-debugging-port=9222')
driver = webdriver.Chrome(options=options)
        driver.get("https://www.impactguru.com");
        System.out.println("Title of the page is: " + driver.getTitle());
   
        
 
    }


}


