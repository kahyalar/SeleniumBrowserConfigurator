package com.kahyalar.selenium;

import org.junit.Test;

import static com.kahyalar.selenium.SeleniumBrowserConfigurator.*;
import static org.junit.Assert.assertTrue;

/**
 * Created by kahyalar on 05/01/2017.
 */
public class StaticTest extends BaseTest {
    @Test
    public void chromeTest(){
        maximizeBrowserForMBP13(chromeDriver);

        assertTrue("Window size must be 1280 x 800", isWindowSizeMatched(1280, 800, chromeDriver));
    }

    @Test
    public void firefoxTest(){
        maximizeBrowserForMBP13(firefoxDriver);

        assertTrue("Window size must be 1280 x 800", isWindowSizeMatched(1280, 800, firefoxDriver));
    }
}
