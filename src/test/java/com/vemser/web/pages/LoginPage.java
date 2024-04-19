package com.vemser.web.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private static final By homePageLink = By.cssSelector("div.shop-menu > ul.nav.navbar-nav > li > a");
    private static final By loginPageLink = By.cssSelector("div.shop-menu > ul.nav.navbar-nav > li:nth-child(4) > a");
    private static final By carousel = By.cssSelector("#slider-carousel");

    public void verifyHomePage() {
        verifyElement(carousel);
    }

    public void redirectToLoginPage() {
        click(loginPageLink);
    }

    public void login() {
    }
}
