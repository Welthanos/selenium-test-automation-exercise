package com.vemser.web.tests;

import com.vemser.web.data.factory.UserDataFactory;
import com.vemser.web.dto.UserDto;
import com.vemser.web.pages.SignupPage;
import org.junit.Assert;
import org.junit.Test;

public class SignupTest extends BaseTest {
    SignupPage signupPage = new SignupPage();
    UserDataFactory userDataFactory = new UserDataFactory();

    @Test
    public void verifySignupWithSuccess() {
        UserDto user = userDataFactory.userWithValidData();
        signupPage.verifyHomePage();
        signupPage.redirectToSignupPage();
        signupPage.signup(user.getName(), user.getEmail());
        signupPage.enterAccountInformation(
                user.getPassword(),
                user.getDayOfBirth(),
                user.getMonthOfBirth(),
                user.getYearOfBirth(),
                user.getFirstName(),
                user.getLastName(),
                user.getCompany(),
                user.getAddress(),
                user.getAddress(),
                user.getState(),
                user.getCity(),
                user.getZipCode(),
                user.getMobileNumber()
        );
        String messageCreated = signupPage.verifyAccountCreated();
        Assert.assertEquals("ACCOUNT CREATED!", messageCreated);

        signupPage.continueToHomePageLoggedIn();
        String info = signupPage.verifyLoggedInUser();
        Assert.assertEquals("Logged in as " + user.getName(), info);

        signupPage.deleteAccount();
        String messageDeleted = signupPage.verifyAccountDeleted();
        Assert.assertEquals("ACCOUNT DELETED!", messageDeleted);

        signupPage.continueToHomePage();
    }
}
