package com.ohrm.qa.testcases;

import com.ohrm.qa.base.TestBase;
import com.ohrm.qa.pages.*;
import com.ohrm.qa.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class HomePageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    AdminPage adminPage;
    PinPage pinPage;
    LeavePage leavePage;
    AddButton addButton;
    RecruitmentPage recruitmentPage;
    public HomePageTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        loginPage = new LoginPage();
        adminPage = new AdminPage();
        pinPage = new PinPage();
        leavePage= new LeavePage();
        addButton= new AddButton();
        recruitmentPage= new RecruitmentPage();
        homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
    }
    @Test(priority = 1)
    public void verifyAdminLinkTest(){
       adminPage= homePage.clickOnAdmin();
    }
    @Test(priority =2)
    public void verifyPinLinkTest(){
        pinPage= homePage.clickOnPin();
    }
    @Test(priority =3)
    public void verifyLeaveLinkTest(){
        leavePage=homePage.clickOnLeave();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
