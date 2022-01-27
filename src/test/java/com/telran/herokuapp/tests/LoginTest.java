package com.telran.herokuapp.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends TestBase {

    @Test
    public void positiveLoginTest() {
        loginPage.goToTheLoginPage();
        loginPage.insertCredentials("tomsmith", "SuperSecretPassword!");
        secureAreaPage = loginPage.clickOnLoginButton();
        Assertions.assertTrue(secureAreaPage.isLogOutButtonExist());
    }

    @Test

    public void negativeLoginTest() {
        loginPage.goToTheLoginPage();
        loginPage.insertCredentials("tomsmithZ", "SuperSecretPassword!");
        secureAreaPage = loginPage.clickOnLoginButton();
        Assertions.assertTrue(loginPage.isAlertPresent().contains("Your username is invalid"));
    }
}
