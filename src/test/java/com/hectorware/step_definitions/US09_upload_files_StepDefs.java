package com.hectorware.step_definitions;

import com.hectorware.pages.FilesPage;
import com.hectorware.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US09_upload_files_StepDefs {


    LoginPage loginPage = new LoginPage();
    FilesPage filesPage = new FilesPage();


    @When("the user enters valid credentials")
    public void theUserEntersValidCredentials() {
        loginPage.login();


    }


    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        filesPage.filesModule.click();

    }

    @When("user choose a folder from the page")
    public void user_choose_a_folder_from_the_page() {

        filesPage.noteFolder.click();
    }

    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {
        filesPage.plusButton.click();
    }

    @When("the user uploads a file with the upload file option")
    public void the_user_uploads_a_file_with_the_upload_file_option() {
        filesPage.uploadFile.click();
    }

    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
filesPage.textDisplayed.isDisplayed();
    }


}
