package com.hectorware.step_definitions;


import com.hectorware.pages.FilePage;
import com.hectorware.utilities.BrowserUtils;
import com.hectorware.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US10_Files_Module_Step_Definition {


    FilePage filePage = new FilePage();

     String deleteFileFolder;



    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
     filePage.file_Module.click();
    }
    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {

      deleteFileFolder = filePage.firstFileFolder.getText();
      System.out.println("deleteFileFolder = " + deleteFileFolder);
      filePage.action_icon.click();
    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
    filePage.delete_fileOption.click();
    }
    @When("the user clicks the {string} sub-module on the left side")
    public void the_user_clicks_the_sub_module_on_the_left_side(String string) {

    filePage.deleteSubModule.click();
    }
    @Then("Verify the deleted file is displayed on the Deleted Files page.")
    public void verify_the_deleted_file_is_displayed_on_the_deleted_files_page() {

   //Actions actions = new Actions(Driver.getDriver());

   //actions.scrollToElement(deleteFileFolder);

        List<String> allFilesAndFoldersInDeleted = new ArrayList<>();
        for (WebElement each : filePage.allFilesAndFoldersNames_InDeletedFiles) {
            allFilesAndFoldersInDeleted.add(each.getText());
        }
        Assert.assertTrue(allFilesAndFoldersInDeleted.contains(deleteFileFolder));
    }


}
