package com.hectorware.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.hectorware.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;


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


//US05
    @FindBy(xpath = "(//a[@class='action action-menu permanent'])[1]")
    public WebElement actionIconForFolder;

    @FindBy(xpath = "//span[@class='icon icon-starred']")
    public WebElement favoriteIcon;

    @FindBy(xpath = "//a[@data-action='Favorite']")
    public WebElement addToFavoriteBtn;

    @FindBy(xpath = "(//tbody[@id='fileList'])[1]//tr")
    public List<WebElement> allFilesAndFoldersRowsElements;

    @FindBy(xpath = "//tbody[@id='fileList']//td[@class='filename']//span[@class='innernametext']")
    public List<WebElement> allFilesAndFoldersNames_InFavorites;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addNewFolderOrFileBtn;

    @FindBy(xpath = "//a[@data-templatename='New folder']")
    public WebElement addNewFolderBtn;

    @FindBy(xpath = "//input[@value='New folder']")
    public WebElement inputBoxForNewFolderName;

    public String getFileName(int fileOrFolderNumber){
        return Driver.getDriver().findElement(By.xpath("//tbody[@id='fileList']//tr["+fileOrFolderNumber+"]//span[@class='innernametext']")).getText();
    }

    public WebElement getActionIcon(int fileOrFolderNumber){
        return Driver.getDriver().findElement(By.xpath("(//tbody[@id='fileList'])[1]//tr["+fileOrFolderNumber+"]//a[@data-action='menu']"));
    }
    public WebElement navigateToFilesSubMenu(String option){
        return Driver.getDriver().findElement(By.xpath("//ul[@class='with-icon']//a[.='"+option+"']"));
    }

//US12
    @FindBy(xpath = "//div[@id='app-navigation']//div[@id='app-settings-header']") // //button[@class='settings-button']
    public WebElement settingsButton;

    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement filesModule;

    @FindBy(xpath = "//label[@for='showRichWorkspacesToggle']")
    public WebElement settingCheckbox1_richWorkspaces;

    @FindBy(xpath = "//label[@for='recommendationsEnabledToggle']")
    public WebElement settingCheckbox2_recommendations;

    @FindBy(xpath = "//label[@for='showhiddenfilesToggle']")
    public WebElement settingCheckbox3_hiddenFiles;

 // Marko Ivanovic US13
    @FindBy(xpath = "//a[@class=\"header-menu__trigger\"]")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@type=\"search\"]")
    public WebElement searchTextInput;

    @FindBy(xpath = "//ul[@aria-label=\"Files\"]")
    public WebElement filesResult;

    @FindBy(xpath = "//ul[@aria-label=\"Apps\"]")
    public WebElement appsResult;

//Moh
  @FindBy(xpath = "//a[@href='/index.php/apps/files/']")
    public WebElement inputFiles;

    @FindBy(xpath = "//a[@data-action='menu']")
    public WebElement actionIcon;
    @FindBy(xpath = "//span[.='Remove from favorites']")
    public WebElement removeOption;
    @FindBy(xpath = "//a[@class='nav-icon-favorites svg']")
    public WebElement FavoriteTable;
    @FindBy(xpath = "//span[.='Add to favorites']")
    public WebElement AddFavoriteOption;

    @FindBy(xpath = "//span[@class='innernametext']")
    public WebElement nameText;


//Attitaya

    @FindBy(xpath = "//a[@data-action='menu']")
    public WebElement btn_action_icon;

    @FindBy(xpath = "//a[@data-action='Details']")
    public WebElement btn_details;

    @FindBy(xpath = "//a[@aria-controls=\"tab-commentsTabView\"]")
    public WebElement btn_comments;

    @FindBy(xpath = "//div[@contenteditable='true']")
    public WebElement input_comment;

    @FindBy(css = "input[class='submit icon-confirm has-tooltip']")
    public WebElement btn_summit;

   @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement comment_Display_box;

   @FindBy(xpath = "//div[normalize-space()='seconds ago']")
    public WebElement txt_seconds_ago;


    @FindBy(xpath = "//div[@class='tooltip-inner']")
    public WebElement msg_error;

    @FindBy(xpath = "(//li[@class='comment'])[1]")
    public WebElement first_comment_msg;


    
}



