package com.hectorware.pages;

import com.hectorware.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    //(//tbody[@id='fileList'])[1]//tr[2]//a[@data-action='menu']
    public WebElement navigateToFilesSubMenu(String option){
        return Driver.getDriver().findElement(By.xpath("//ul[@class='with-icon']//a[.='"+option+"']"));
    }


 // Marko Ivanovic US13
    @FindBy(xpath = "//a[@class=\"header-menu__trigger\"]")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@type=\"search\"]")
    public WebElement searchTextInput;

    @FindBy(xpath = "//ul[@aria-label=\"Files\"]")
    public WebElement filesResult;

    @FindBy(xpath = "//ul[@aria-label=\"Apps\"]")
    public WebElement appsResult;


}
