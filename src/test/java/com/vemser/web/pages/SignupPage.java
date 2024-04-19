package com.vemser.web.pages;

import org.openqa.selenium.By;

public class SignupPage extends BasePage {
    private static final By homePageLink = By.cssSelector("div.shop-menu > ul.nav.navbar-nav > li > a");
    private static final By signupPageLink = By.cssSelector("div.shop-menu > ul.nav.navbar-nav > li:nth-child(4) > a");
    private static final By carousel = By.cssSelector("#slider-carousel");
    private static final By nameField = By.cssSelector("[data-qa='signup-name']");
    private static final By emailField = By.cssSelector("[data-qa='signup-email']");
    private static final By signupBtn = By.cssSelector("[data-qa='signup-button']");
    private static final By gender = By.cssSelector("#id_gender1");
    private static final By passwordField = By.cssSelector("#password");
    private static final By dayOfBirthSelect = By.cssSelector("#days");
    private static final By monthOfBirthSelect = By.cssSelector("#months");
    private static final By yearOfBirthSelect = By.cssSelector("#years");
    private static final By firstNameField = By.cssSelector("#first_name");
    private static final By lastNameField = By.cssSelector("#last_name");
    private static final By companyField = By.cssSelector("#company");
    private static final By address1Field = By.cssSelector("#address1");
    private static final By address2Field = By.cssSelector("#address2");
    private static final By countryField = By.cssSelector("#country");
    private static final By stateField = By.cssSelector("#state");
    private static final By cityField = By.cssSelector("#city");
    private static final By zipCodeField = By.cssSelector("#zipcode");
    private static final By mobileNumberField = By.cssSelector("#mobile_number");
    private static final By createAccountBtn = By.cssSelector("[data-qa='create-account']");
    private static final By accountCreatedInfo = By.cssSelector("[data-qa='account-created']");
    private static final By accountDeletedInfo = By.cssSelector("[data-qa='account-deleted']");
    private static final By continueBtn = By.cssSelector("[data-qa='continue-button']");
    private static final By logoutLink = By.cssSelector("div.shop-menu > ul.nav.navbar-nav > li:nth-child(4) > a");
    private static final By deleteAccountLink = By.cssSelector("div.shop-menu > ul.nav.navbar-nav > li:nth-child(5) > a");
    private static final By loggedInUserInfo = By.cssSelector("div.shop-menu > ul.nav.navbar-nav > li:nth-child(10) > a");

    public void verifyHomePage() {
        verifyElement(carousel);
    }

    public String verifyAccountCreated() {
        return readText(accountCreatedInfo);
    }

    public String verifyAccountDeleted(){
        return readText(accountDeletedInfo);
    }

    public String verifyLoggedInUser(){
        return readText(loggedInUserInfo);
    }

    public void redirectToSignupPage() {
        click(signupPageLink);
    }

    public void signup(String name, String email) {
        fillInput(nameField, name);
        fillInput(emailField, email);
        click(signupBtn);
    }

    public void enterAccountInformation(String password, String day, String month, String year, String firstName, String lastName, String company, String address1, String address2, String state, String city, String zipCode, String mobileNumber) {
        click(gender);
        fillInput(passwordField, password);
        selectOptionByValue(dayOfBirthSelect, day);
        selectOptionByValue(monthOfBirthSelect, month);
        selectOptionByValue(yearOfBirthSelect, year);
        fillInput(firstNameField, firstName);
        fillInput(lastNameField, lastName);
        fillInput(companyField, company);
        fillInput(address1Field, address1);
        fillInput(address2Field, address2);
        selectOptionByText(countryField, "United States");
        fillInput(stateField, state);
        fillInput(cityField, city);
        fillInput(zipCodeField, zipCode);
        fillInput(mobileNumberField, mobileNumber);
        click(createAccountBtn);
    }

    public void logout() {
        click(logoutLink);
    }

    public void deleteAccount() {
        click(deleteAccountLink);
    }

    public void continueToHomePageLoggedIn() {
        click(continueBtn);
        closeAdsByGoogle();
        click(continueBtn);
    }

    public void continueToHomePage() {
        click(continueBtn);
    }
}
