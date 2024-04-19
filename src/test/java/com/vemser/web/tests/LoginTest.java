package com.vemser.web.tests;

import com.vemser.web.pages.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseTest {
    private LoginPage loginPage = new LoginPage();

    @Test
    public void verifyHomePage() {
        loginPage.verifyHomePage();
    }
}
