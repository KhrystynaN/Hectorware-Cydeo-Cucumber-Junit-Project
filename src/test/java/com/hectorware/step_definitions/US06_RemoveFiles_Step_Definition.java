package com.hectorware.step_definitions;

import com.hectorware.pages.BasePage;
import com.hectorware.pages.FilesPage;
import com.hectorware.utilities.BrowserUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class US06_RemoveFiles_Step_Definition extends BasePage {


    @When("user click to action-icon")
    public void userClickToActionIcon() {
        filesPage.actionIcon.click();
    }

    @When("user should click to {string} option")
    public void userShouldClickToOption(String arg0) {

        filesPage.AddFavoriteOption.click();
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
        /*
         List<WebElement> list = new ArrayList<>();
        list.add(filesPage.actionIcon);
        list.add(filesPage.removeOption);
        list.add(filesPage.FavoriteTable);
        list.add(filesPage.AddFavoriteOption);
        for (WebElement each : list) {
            each.click();
            Assert.assertTrue(each.isDisplayed());
        }
         */


        }


    }





