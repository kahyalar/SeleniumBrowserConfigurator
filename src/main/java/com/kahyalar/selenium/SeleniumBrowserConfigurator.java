package com.kahyalar.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by kahyalar on 03/01/2017.
 */
public class SeleniumBrowserConfigurator {
    WebDriver driver;

    public SeleniumBrowserConfigurator(WebDriver driver){
        this.driver = driver;
    }

    public void maximizeChromeDriverMBP13(){
        driver.manage().window().setSize(new Dimension(1280, 800));
        driver.manage().window().setPosition(new Point(0, 0));
    }

    public void maximizeChromeDriverMBP15(){
        driver.manage().window().setSize(new Dimension(1440, 900));
        driver.manage().window().setPosition(new Point(0, 0));
    }

    public void maximizeChromeDriveriMac4K(){
        driver.manage().window().setSize(new Dimension(2048, 1152));
        driver.manage().window().setPosition(new Point(0, 0));
    }

    public void maximizeChromeDriveriMac5K(){
        driver.manage().window().setSize(new Dimension(2560, 1440));
        driver.manage().window().setPosition(new Point(0, 0));
    }

    public void maximizeChromeDriveriMac(){
        driver.manage().window().setSize(new Dimension(1280, 720));
        driver.manage().window().setPosition(new Point(0, 0));
    }

    public void maximizeChromeDriverWindows(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }
}
