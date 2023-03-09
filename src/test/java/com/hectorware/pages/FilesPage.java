package com.hectorware.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hectorware.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilesPage extends BasePage{



    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Files']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement Files;


    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement mainCheckBox;

    @FindBy(xpath = "//span[text()='Readme']")
    public WebElement readMe;

    @FindBy(xpath = "//span[text()='Selenium']")
    public WebElement selenium;


    @FindBy(xpath = "//span[text()='Talk']")
    public WebElement talk;


    @FindBy(xpath = "//span[text()='Git_commands']")
    public WebElement GitCommands;



    @FindBy(xpath = "//span[text()='Java']")
    public WebElement java;




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
    //(//tbody[@id='fileList'])[1]//tr[2]//a[@data-action='menu']
    public WebElement navigateToFilesSubMenu(String option){
        return Driver.getDriver().findElement(By.xpath("//ul[@class='with-icon']//a[.='"+option+"']"));
    }


}

