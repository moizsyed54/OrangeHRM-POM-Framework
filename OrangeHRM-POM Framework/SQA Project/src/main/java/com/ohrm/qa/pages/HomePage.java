package com.ohrm.qa.pages;

import com.ohrm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    @FindBy(xpath="//a[@class='oxd-main-menu-item']")
    WebElement Admin;
    @FindBy(xpath="//span[normalize-space()='PIM']" )
    WebElement Pin;
    @FindBy(xpath="//span[normalize-space()='Leave']" )
    WebElement Leave;

    @FindBy(xpath ="//span[normalize-space()='Recruitment']")
    WebElement Recruitment;
    @FindBy(xpath ="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement Add;


    public HomePage(){
        PageFactory.initElements(driver,this);
    }
     public AdminPage clickOnAdmin(){
        Admin.click();
        return new AdminPage();
     }
     public PinPage clickOnPin(){
        Pin.click();
        return new PinPage();
     }
    public LeavePage clickOnLeave(){
        Leave.click();
        return new LeavePage();
    }
    public RecruitmentPage clickOnRecruitment(){
        Recruitment.click();
        return new RecruitmentPage();
    }

//    public AddButton clickOnButton(){
//        Add.click();
//        return  new AddButton();
//    }

}
