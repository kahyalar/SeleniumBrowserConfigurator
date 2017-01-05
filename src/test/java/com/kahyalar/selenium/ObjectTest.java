package com.kahyalar.selenium;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by kahyalar on 05/01/2017.
 */
public class ObjectTest extends BaseTest {
    @Test
    public void chromeTest(){
        SeleniumBrowserConfigurator configurator = new SeleniumBrowserConfigurator(chromeDriver);
        configurator.maximizeBrowserForMBP13();

        assertTrue("Window size must be 1280 x 800", isWindowSizeMatched(1280, 800, chromeDriver));
    }

    @Test
    public void firefoxTest(){
        SeleniumBrowserConfigurator configurator = new SeleniumBrowserConfigurator(firefoxDriver);
        configurator.maximizeBrowserForMBP13();

        assertTrue("Window size must be 1280 x 800", isWindowSizeMatched(1280, 800, firefoxDriver));
    }
}
