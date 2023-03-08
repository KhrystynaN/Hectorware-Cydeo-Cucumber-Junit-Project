package com.hectorware.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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



}
