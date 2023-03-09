package com.hectorware.pages;

import com.hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends BasePage{
    public ContactsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Contacts']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
        public WebElement contacts;

}
