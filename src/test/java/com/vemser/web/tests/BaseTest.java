package com.vemser.web.tests;

import com.vemser.web.data.service.SeleniumService;
import org.junit.After;
import org.junit.Before;

public class BaseTest {
    SeleniumService seleniumService = new SeleniumService();

    @Before
    public void openBrowser() {
        seleniumService.initBrowser("https://automationexercise.com");
    }

    @After
    public void closeBrowser() {
        seleniumService.tearDownBrowser();
    }
}