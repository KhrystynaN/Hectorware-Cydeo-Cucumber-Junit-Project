package com.hectorware.pages;

import com.hectorware.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void navigateTo(String module){
        WebElement linkToPage = Driver.getDriver().findElement(By.xpath("(//a[@aria-label='" + module + "'])[1]"));
    }


}
