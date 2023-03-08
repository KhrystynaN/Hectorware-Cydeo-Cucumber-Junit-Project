package com.hectorware.step_definitions;


import com.hectorware.pages.DeleteFilePage;
import com.hectorware.pages.FilePage;
import com.hectorware.pages.LoginPage;
import com.hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class US10_Files_Module_Step_Definition {

    LoginPage loginPage =new LoginPage();
    FilePage filePage = new FilePage();
    DeleteFilePage deleteFilePage = new DeleteFilePage();

    @Given("user on the home page")
    public void user_on_the_home_page() {
    loginPage.login();
    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
     filePage.file_Module.click();
    }
    @When("user click action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
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

    deleteFilePage.deleteFile.isDisplayed();
    }

}
