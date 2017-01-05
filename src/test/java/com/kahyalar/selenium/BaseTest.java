package com.kahyalar.selenium;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;
/**
 * Created by kahyalar on 03/01/2017.
 */
public class BaseTest {
    protected WebDriver firefoxDriver = new FirefoxDriver();
    protected WebDriver chromeDriver = new ChromeDriver();

    public boolean isWindowSizeMatched(int width, int height, WebDriver driver){
        int X = driver.manage().window().getSize().getWidth();
        int Y = driver.manage().window().getSize().getHeight();
        if(X >= width - 4 && Y >= height - 23)
            return true;
        else
            System.out.printf("Width: %s, Height: %s", X, Y);
            return false;
    }

    @After
    public void tearDown(){
        firefoxDriver.quit();
        chromeDriver.quit();
    }
}
