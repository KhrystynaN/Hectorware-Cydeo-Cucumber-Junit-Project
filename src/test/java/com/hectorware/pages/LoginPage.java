package com.hectorware.pages;

import com.hectorware.utilities.ConfigurationReader;
import com.hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement input_username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement input_password;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement login_Btn;

    @FindBy (xpath = "//p[contains(@class,'warning wrongPasswordMsg')]")
    public WebElement invalidLoginMsg;

    public void login(){
        input_username.sendKeys(ConfigurationReader.getProperty("username"));
        input_password.sendKeys(ConfigurationReader.getProperty("password"));
        login_Btn.click();
    }

}
