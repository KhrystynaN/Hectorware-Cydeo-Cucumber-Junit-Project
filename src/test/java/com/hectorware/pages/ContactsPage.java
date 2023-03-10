package com.hectorware.pages;

import com.hectorware.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.cert.X509Certificate;
import java.util.List;

public class ContactsPage extends BasePage {


    @FindBy(id = "new-contact-button")
    public WebElement btn_new_contact_button;

    @FindBy(xpath = "//input[@placeholder='Company']")
    public WebElement input_companyName;


    public static String getContactsName(int num) {

        String locator = "(//div[@class='app-content-list-item-line-one'])[" + num + "]";

        return Driver.getDriver().findElement(By.xpath(locator)).getText();

    }


        @FindBy(xpath = "//ul[@id='appmenu']//a[@aria-label='Contacts']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
        public WebElement contacts;

}
