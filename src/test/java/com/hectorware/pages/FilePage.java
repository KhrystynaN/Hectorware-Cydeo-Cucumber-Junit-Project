package com.hectorware.pages;

import com.hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilePage{

    public FilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//a[@aria-label='Files']")
        public WebElement file_Module;


        @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[2]/a[2]/span[1]")
         public WebElement action_icon;

       @FindBy(xpath = "//span[.='Delete file']")
       public  WebElement delete_fileOption;

       @FindBy(xpath = "//a[@class='nav-icon-trashbin svg']")
       public WebElement deleteSubModule;




}

