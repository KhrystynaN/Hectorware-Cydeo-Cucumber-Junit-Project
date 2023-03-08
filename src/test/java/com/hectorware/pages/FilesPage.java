package com.hectorware.pages;

import com.hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage extends BasePage{


    @FindBy(xpath = "//div[@id='app-navigation']//div[@id='app-settings-header']") // //button[@class='settings-button']
    public WebElement settingsButton;

  @FindBy(xpath = "//div[@id='app-navigation']//li[@id='quota']")
   public WebElement usedKB_Button;


    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement filesModule;


    @FindBy(xpath = "//label[@for='showRichWorkspacesToggle']")
    public WebElement settingCheckbox1_richWorkspaces;

    @FindBy(xpath = "//label[@for='recommendationsEnabledToggle']")
    public WebElement settingCheckbox2_recommendations;

    @FindBy(xpath = "//label[@for='showhiddenfilesToggle']")
    public WebElement settingCheckbox3_hiddenFiles;
}
