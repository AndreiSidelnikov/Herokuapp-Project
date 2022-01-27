package com.telran.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecureAreaPage extends PageBase {
    public SecureAreaPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(css = ".icon-2x.icon-signout")
    WebElement logOutButton;

    public boolean isLogOutButtonExist() {
        return logOutButton.isDisplayed();

    }
}
