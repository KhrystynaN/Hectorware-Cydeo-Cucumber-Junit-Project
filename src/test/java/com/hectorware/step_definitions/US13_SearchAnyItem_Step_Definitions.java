package com.hectorware.step_definitions;

import com.hectorware.pages.FilesPage;
import com.hectorware.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US13_SearchAnyItem_Step_Definitions {


    FilesPage filesPage = new FilesPage();

    @When("user click on search icon")
    public void user_click_on_search_icon() {
        System.out.println("User click on search icon");
        filesPage.searchButton.click();

    }
    @And("user type selenium in search")
    public void user_type_selenium_in_search() {
        System.out.println("User search for selenium");
        filesPage.searchTextInput.sendKeys("selenium" + Keys.ENTER);

    }
    @Then("verify, the app is displaying related result")
    public void verify_the_app_is_displaying_related_result() {
        System.out.println("User verify if app is displaying search result");
        System.out.println("filesPage.filesResult.isDisplayed() = " + filesPage.filesResult.isDisplayed());
        int expectedNumberOfFiles = 2;
        List<WebElement> actualNumberOfFiles = Driver.getDriver().findElements(By.xpath("//ul[@aria-label=\"Files\"]"));
        int actualNumber = actualNumberOfFiles.size();

        Assert.assertEquals(expectedNumberOfFiles,actualNumber);

    }

}
