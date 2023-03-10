package com.hectorware.step_definitions;

import com.github.javafaker.Faker;
import com.hectorware.pages.FilesPage;
import com.hectorware.utilities.BrowserUtils;
import com.hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US05_AddToFavorite_Step_Definition {

    FilesPage filesPage = new FilesPage();

    String lastFileName;

    @Given("user sees  the last added file or folder {string} without favorite icon")
    public void userSeesTheLastAddedFileOrFolderWithoutFavoriteIcon(String folderName) {
        Faker faker = new Faker();
        folderName = faker.name().firstName();
        filesPage.addNewFolderOrFileBtn.click();
        filesPage.addNewFolderBtn.click();
        filesPage.inputBoxForNewFolderName.clear();
        filesPage.inputBoxForNewFolderName.sendKeys(folderName + Keys.ENTER);
        BrowserUtils.sleep(2);
    }

    @When("user clicks on {string} module")
    public void user_clicks_on_module(String module) {
        filesPage.navigateTo(module);
    }

    @When("user clicks action-icon from any file on the page")
    public void user_clicks_action_icon_from_any_file_on_the_page() {
        List<WebElement> allFilesAndFoldersRowsElements = filesPage.allFilesAndFoldersRowsElements;
        System.out.println("allFilesAndFoldersRowsElements = " + allFilesAndFoldersRowsElements);
        int numberOfFiles = allFilesAndFoldersRowsElements.size();
        System.out.println("numberOfFiles = " + numberOfFiles);

        lastFileName = filesPage.getFileName(numberOfFiles);
        WebElement lastFileOrFolder_ActionIcon = filesPage.getActionIcon(numberOfFiles);
        System.out.println("lastFileOrFolder_ActionIcon = " + lastFileOrFolder_ActionIcon);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(lastFileOrFolder_ActionIcon).click().perform();

    }

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

    @When("user choose Add to favorites option")
    public void user_choose_add_to_favorites_option() {
        wait.until(ExpectedConditions.visibilityOf(filesPage.addToFavoriteBtn));
        filesPage.addToFavoriteBtn.click();
        BrowserUtils.sleep(1);
    }

    @When("user clicks the {string} sub-module on the left side")
    public void user_clicks_the_sub_module_on_the_left_side(String option) {
        filesPage.navigateToFilesSubMenu(option).click();
        BrowserUtils.sleep(1);
    }

    @Then("verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {
        List<String> allFilesAndFoldersInFavorites = new ArrayList<>();
        for (WebElement each : filesPage.allFilesAndFoldersNames_InFavorites) {
            allFilesAndFoldersInFavorites.add(each.getText());
        }
        Assert.assertTrue(allFilesAndFoldersInFavorites.contains(lastFileName));
    }


}
