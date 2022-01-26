package com.telran.herokuapp.pages;

import org.openqa.selenium.WebDriver;

public abstract class Page {

    protected WebDriver driver;

    /*
     * Constructor injecting the WebDriver interface
     *
     * @param webDriver
     */
    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public static String BASE_URL = "http://the-internet.herokuapp.com";
}
