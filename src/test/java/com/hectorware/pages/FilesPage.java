package com.hectorware.pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesPage extends BasePage{


    // USER STORY 08
    @FindBy(xpath = "//span[@class=\"icon icon-add\"]")
    public WebElement uploadBar;

    @FindBy(xpath = "//*[contains(text(),'New folder')]")
    public WebElement selectNewFolder;

    @FindBy(xpath = "//input[@value=\"New folder\"]")
    public WebElement newFolderText;

    @FindBy(xpath = "//input[@class=\"icon-confirm\"]")
    public WebElement submitButton;

    @FindBy(xpath = "//span[text()='Java folder']")
    public WebElement javaFolder;

    // USER STORY 13

    @FindBy(xpath = "//a[@class=\"header-menu__trigger\"]")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@type=\"search\"]")
    public WebElement searchTextInput;

    @FindBy(xpath = "//ul[@aria-label=\"Files\"]")
    public WebElement filesResult;

    @FindBy(xpath = "//ul[@aria-label=\"Apps\"]")
    public WebElement appsResult;




}
