package com.kahyalar.selenium;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;
/**
 * Created by kahyalar on 03/01/2017.
 */
public class ConfigTest {
    private WebDriver driver = new ChromeDriver();
    private SeleniumBrowserConfigurator configurator = new SeleniumBrowserConfigurator(driver);

    public boolean isWindowSizeMatched(int width, int height){
        int X = driver.manage().window().getSize().getWidth();
        int Y = driver.manage().window().getSize().getHeight();
        if(X == width && Y == height - 23)
            return true;
        else
            return false;
    }

    @Test
    public void startUp(){
        configurator.maximizeChromeDriverMBP13();

        assertTrue("Window size must be 1280 x 800", isWindowSizeMatched(1280, 800));
    }

    @After
    public void tearDown(){driver.close();}
}
