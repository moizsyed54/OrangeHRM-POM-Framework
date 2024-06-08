package com.ohrm.qa.testcases;

import com.ohrm.qa.base.TestBase;
import com.ohrm.qa.pages.HomePage;
import com.ohrm.qa.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod
    public void setUp(){
        initialization();
        loginPage = new LoginPage();
    }
    @Test(priority = 1)
    public void loginTest(){

        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }
    @Test(priority = 2)
    public void forgotTest(){
        loginPage = loginPage.forget(prop.getProperty("username"));
    }

//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }
}
