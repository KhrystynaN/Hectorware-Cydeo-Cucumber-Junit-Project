package com.hectorware.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesPage extends BasePage {

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
}




