package com.ohrm.qa.testcases;

import com.ohrm.qa.base.TestBase;
import com.ohrm.qa.pages.*;
import com.ohrm.qa.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RecruitmentPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    AdminPage adminPage;
    PinPage pinPage;
    LeavePage leavePage;
    RecruitmentPage recruitmentPage;

    public RecruitmentPageTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        initialization();
        testUtil = new TestUtil();
        loginPage = new LoginPage();
        adminPage = new AdminPage();
        pinPage = new PinPage();
        leavePage= new LeavePage();
        recruitmentPage= new RecruitmentPage();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }
    @Test(priority = 1)
    public void verifyRecruitmentLinkTest(){

        recruitmentPage = recruitmentPage.clickOnRecruitment(prop.getProperty("Firstname"), prop.getProperty("MidName"), prop.getProperty("Lastname"), prop.getProperty("Email"), prop.getProperty("ContactNumber"));
        recruitmentPage=homePage.clickOnRecruitment();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
