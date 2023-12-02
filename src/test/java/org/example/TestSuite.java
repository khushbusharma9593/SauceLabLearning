package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest
{
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LogInPage logInPage=new LogInPage();


    @Test
    public void verifyUserShouldAbleToRegisterSuccessfully()
    {
        homePage.clickOnRegisterButton();
        registerPage.verifyUserIsOnRegisterPage();
        registerPage.enterRegistrationDetails();
        registerResultPage.verifyUserRegisteredSuccessfully();
    }
    @Test
    public void verifyUserShouldBeLoginSuccessfully()
    {
        homePage.verifyUserIsOnLoginPage();
        logInPage.verifyUserShouldAbleToLogInSuccessfully();

    }




}
