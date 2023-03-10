package com.hectorware.step_definitions;

import com.hectorware.pages.BasePage;
import com.hectorware.pages.FilesPage;
import com.hectorware.utilities.BrowserUtils;

import com.hectorware.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class US06_RemoveFiles_Step_Definition extends BasePage {


    @When("user click to action-icon")
    public void userClickToActionIcon() {
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//a[@data-action='menu']"));

        for (int i = 0; i < elements.size(); i++) {
            WebElement element = elements.get(i);
            element.click();
        }


        }

    @When("user should click to {string} option")
    public void userShouldClickToOption(String arg0) {

        //Actions actions = new Actions(Driver.getDriver());
        //actions.moveToElement(filesPage.AddFavoriteOption).doubleClick();
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//span[.='Add to favorites']"));

        for (int i = 0; i < elements.size(); i++) {
            WebElement element = elements.get(i);
            element.click();
        }
        BrowserUtils.sleep(3);
    }

    FilesPage filesPage = new FilesPage();

    @When("user clicks to the Files module")
    public void userClicksToTheFilesModule() {
        navigateTo("Files");

    }

    @When("user click action-icon from any file on the page to remove")
    public void userClickActionIconFromAnyFileOnThePageToRemove() {
       filesPage.actionIcon.click();
    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String remove) {

        filesPage.removeOption.isEnabled();
    }

    @When("user click the {string} sub-module")
    public void user_click_the_sub_module(String removeOption) {

          filesPage.removeOption.click();
            BrowserUtils.sleep(3);

        }

        @Then("Verify that the file is not listed in the Favorites table")
        public void verify_that_the_file_is_not_listed_in_the_favorites_table () {

            filesPage.FavoriteTable.isDisplayed();

        }



        }








