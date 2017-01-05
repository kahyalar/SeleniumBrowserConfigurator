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

    public void maximizeBrowserForMBP13(){
        driver.manage().window().setSize(new Dimension(1280, 800));
        driver.manage().window().setPosition(new Point(0, 0));
    }

    public void maximizeBrowserForMBP15(){
        driver.manage().window().setSize(new Dimension(1440, 900));
        driver.manage().window().setPosition(new Point(0, 0));
    }

    public void maximizeBrowserForiMac4K(){
        driver.manage().window().setSize(new Dimension(2048, 1152));
        driver.manage().window().setPosition(new Point(0, 0));
    }

    public void maximizeBrowserForiMac5K(){
        driver.manage().window().setSize(new Dimension(2560, 1440));
        driver.manage().window().setPosition(new Point(0, 0));
    }

    public void maximizeBrowseriMac(){
        driver.manage().window().setSize(new Dimension(1280, 720));
        driver.manage().window().setPosition(new Point(0, 0));
    }

    public void maximizeBrowserForWindows(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    public static void maximizeBrowserForMBP13(WebDriver driver){
        driver.manage().window().setSize(new Dimension(1280, 800));
        driver.manage().window().setPosition(new Point(0, 0));
    }

    public static void maximizeBrowserForMBP15(WebDriver driver){
        driver.manage().window().setSize(new Dimension(1440, 900));
        driver.manage().window().setPosition(new Point(0, 0));
    }

    public static void maximizeBrowserForiMac4K(WebDriver driver){
        driver.manage().window().setSize(new Dimension(2048, 1152));
        driver.manage().window().setPosition(new Point(0, 0));
    }

    public static void maximizeBrowserForiMac5K(WebDriver driver){
        driver.manage().window().setSize(new Dimension(2560, 1440));
        driver.manage().window().setPosition(new Point(0, 0));
    }

    public static void maximizeBrowseriMac(WebDriver driver){
        driver.manage().window().setSize(new Dimension(1280, 720));
        driver.manage().window().setPosition(new Point(0, 0));
    }

    public static void maximizeBrowserForWindows(WebDriver driver){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }
}
