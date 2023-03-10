package com.hectorware.pages;

import com.hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Files']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement files;

@FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Photos']")
    public WebElement photos;

@FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Activity']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement activity;

@FindBy (xpath = "//ul[@id='appmenu']//a[@aria-label='Talk']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement talk;

@FindBy (xpath = "//ul[@id='appmenu']//a[@aria-label='Mail']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement mail;

@FindBy (xpath = "//ul[@id='appmenu']//a[@aria-label='Contacts']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement contacts;

@FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Calendar']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement calendar;

@FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Notes']")
    public WebElement notes;



}
