package com.hectorware.pages;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.hectorware.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class FilesPage extends BasePage{


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
}
