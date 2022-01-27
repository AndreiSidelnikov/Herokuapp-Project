package com.telran.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {

    protected WebDriver driver;

    /*
     * Constructor injecting the WebDriver interface
     *
     * @param webDriver
     */
    public PageBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public static String BASE_URL = "http://the-internet.herokuapp.com";
}
