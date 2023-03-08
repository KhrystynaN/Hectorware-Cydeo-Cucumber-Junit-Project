package com.hectorware.pages;

import com.hectorware.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteFilePage {

    public DeleteFilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='icon-delete no-hover']")
    public WebElement deleteFilePage;

    @FindBy(xpath = "//span[.='Git_commands']")
    public WebElement deleteFile;
}
