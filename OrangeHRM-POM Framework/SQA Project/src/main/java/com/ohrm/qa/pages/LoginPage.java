package com.ohrm.qa.pages;
import com.ohrm.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

public class LoginPage extends TestBase {
    @FindBy(name ="username")
    WebElement username;
    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath="//button[@type='submit']")
    WebElement loginBtn;
  //  @FindBy(name ="username")
    //WebElement username;

    @FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    WebElement ResetPassword;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-forgot-password-button orangehrm-forgot-password-button--reset']")
    WebElement forget;
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    public HomePage login(String un, String pwd){
        username.sendKeys(un);
        password.sendKeys(pwd);
        loginBtn.click();

        return new HomePage();
    }
    public LoginPage forget(String un)  {
        ResetPassword.click();
        username.sendKeys(un);;
        forget.click();




        return new LoginPage();
    }

}

