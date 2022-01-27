package com.telran.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private static final String LOGIN_URL = BASE_URL + "/login";

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(css = ".radius")
    WebElement loginButton;

    public void goToTheLoginPage() {
        driver.navigate().to(LOGIN_URL);
    }

    public LoginPage insertCredentials(String userNameValue, String passwordValue) {
        username.sendKeys(userNameValue);
        password.sendKeys(passwordValue);
        return this;
    }

    public SecureAreaPage clickOnLoginButton() {
        loginButton.click();
        return new SecureAreaPage(driver);
    }

    @FindBy(id = "flash")
    WebElement message;

    public String isAlertPresent() {
        return message.getText();
    }
}
