package com.telran.herokuapp.tests;

import com.telran.herokuapp.pages.HoversPage;
import com.telran.herokuapp.pages.LoginPage;
import com.telran.herokuapp.pages.SecureAreaPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    HoversPage hoversPage;
    LoginPage loginPage;
    SecureAreaPage secureAreaPage;
    private ChromeDriver driver;

    @BeforeEach
    public void initPageObjects() {

        driver = new ChromeDriver();
        hoversPage = new HoversPage(driver);
        loginPage = new LoginPage(driver);
        secureAreaPage = new SecureAreaPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
