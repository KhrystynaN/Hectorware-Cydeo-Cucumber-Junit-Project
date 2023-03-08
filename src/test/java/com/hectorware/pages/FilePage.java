package com.hectorware.pages;

import com.hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilePage extends BasePage{

    public FilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//a[@aria-label='Files']")
        public WebElement file_Module;


        @FindBy(xpath = "(//a[@data-action='menu'])[1]")
         public WebElement action_icon;

       @FindBy(xpath = "//a[@data-action='Delete']")
       public  WebElement delete_fileOption;

       @FindBy(xpath = "//a[@class='nav-icon-trashbin svg']")
       public WebElement deleteSubModule;

     @FindBy(xpath = "(//span[@class='innernametext'])[1]")
     public WebElement firstFileFolder;


}

