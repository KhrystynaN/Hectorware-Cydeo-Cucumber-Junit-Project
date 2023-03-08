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


    @FindBy(xpath = "//a[@aria-label='Files']//span[.='Files']")
    public WebElement FilesModule;


    public void goToFiles(){
        FilesModule.click();

    }

}
