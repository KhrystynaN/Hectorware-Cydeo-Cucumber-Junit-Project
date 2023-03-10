package com.hectorware.step_definitions;

import com.beust.ah.A;
import com.hectorware.pages.BasePage;
import com.hectorware.pages.FilesPage;
import com.hectorware.utilities.BrowserUtils;

import com.hectorware.utilities.Driver;
import io.cucumber.java.en.And;
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
        filesPage.actionIcon.click();
/*

           List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//a[@data-action='menu']"));

        for (int i = 0; i < elements.size(); i++) {
            WebElement element = elements.get(i);
            element.click();
        }

 */

BrowserUtils.sleep(2);

        }

    @When("user should click to {string} option")
    public void userShouldClickToOption(String arg0) {

      /*
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//span[.='Add to favorites']"));

        for (int i = 0; i < elements.size(); i++) {
            WebElement element = elements.get(i);
            element.click();
        }
       */
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
    public void user_choose_the_option(String expectedRemove) {
       ///Assert.assertEquals(filesPage.removeOption.getText(),expectedRemove);
        filesPage.removeOption.click();
        BrowserUtils.sleep(2);

    }

    @When("user click the {string} sub-module")
    public void user_click_the_sub_module(String removeOption) {

          filesPage.FavoriteTable.click();

          BrowserUtils.sleep(3);

    }

/*

        //Actions actions = new Actions(Driver.getDriver());
        // actions.moveToElement(filesPage.nameText).click();
 */

        @Then("Verify that the file is not listed in the Favorites table")
        public void verify_that_the_file_is_not_listed_in_the_favorites_table () {

            String fileName="";
            WebElement favoritesTable = Driver.getDriver().findElement(By.id("sublist-favorites"));
            List<WebElement> favoriteFiles = favoritesTable.findElements(By.className("innernametext"));

            boolean isFileListed = false;
            for (WebElement file : favoriteFiles) {
                if (file.getText().equals("fileName")) {
                    isFileListed = true;
                    break;
                }
            }

            Assert.assertFalse("File " + fileName + " should not be listed in the favorites table.", isFileListed);
        }

}









