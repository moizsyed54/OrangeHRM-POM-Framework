package com.ohrm.qa.pages;

import com.ohrm.qa.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import static java.awt.SystemColor.window;

public class RecruitmentPage extends TestBase {
    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    WebElement Recruitment;

    @FindBy(xpath ="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement Add;

    @FindBy(name="firstName")
    WebElement Firstname;

    @FindBy(name="middleName")
    WebElement MidName;

    @FindBy(name="lastName")
    WebElement Lastname;

    @FindBy(xpath= "//div[@class='oxd-select-text--after']")
    WebElement Select;

   @FindBy(xpath= "//div[@class='oxd-select-option']//following::span[contains(text(),'Associate IT Manager')]")

    WebElement OptionSelect;

    @FindBy(css = "#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(3) > div > div:nth-child(1) > div > div:nth-child(2) > input")
    WebElement Email;

    @FindBy(css = "#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(3) > div > div:nth-child(2) > div > div:nth-child(2) > input")
    WebElement ContactNumber;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    WebElement SaveBtn;

    @FindBy(xpath = "//i[@class='oxd-icon bi-eye-fill']")
    WebElement Eye;

    //@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--danger']")
    @FindBy(xpath = "//button[contains(text(),’Reject’)]")
    WebElement Reject;



    public RecruitmentPage() {
        PageFactory.initElements(driver, this);
    }

    public RecruitmentPage clickOnRecruitment(String fn, String mn, String ln, String em, String cn){
        Recruitment.click();
        Add.click();

        Firstname.sendKeys(fn);
        MidName.sendKeys(mn);
        Lastname.sendKeys(ln);

        Select.click();

        OptionSelect.click();

       Email.sendKeys(em);
       ContactNumber.sendKeys(cn);

        SaveBtn.click();

        Eye.click();

        Reject.click();
        //System.out.println(Reject.getAttribute("class"));

        return new RecruitmentPage();
    }


}



