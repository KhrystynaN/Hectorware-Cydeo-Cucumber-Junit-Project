package com.hectorware.pages;

import com.hectorware.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PhotosPage extends BasePage{

    public List<WebElement> photosSubMenu(){
        return Driver.getDriver().findElements(By.xpath("//ul[@class='app-navigation__list']//span[@class='app-navigation-entry__title']"));
    }
}
