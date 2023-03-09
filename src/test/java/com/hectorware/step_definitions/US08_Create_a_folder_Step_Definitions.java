package com.hectorware.step_definitions;

import com.hectorware.pages.FilesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US08_Create_a_folder_Step_Definitions {



    FilesPage filesPage = new FilesPage();


    @Given("user is on Files module")
    public void userIsOnFilesModule() {
        System.out.println("User is on the Files module page");
    }

    @When("user click on upload bar")
    public void userClickOnUploadBar() {
        System.out.println("user click on upload bar");
        filesPage.uploadBar.click();
    }

    @And("user select New folder")
    public void userSelectNewFolder() {
        System.out.println("user select New folder");
      filesPage.selectNewFolder.click();
    }

    @And("user enter Java folder as name")
    public void userEnterJavaFolderAsName() {
        System.out.println("user enter Java folder as name");
      filesPage.newFolderText.sendKeys("Java folder");
    }

    @And("user click on submit")
    public void userClickOnSubmit() {
        System.out.println("user click on submit");
      filesPage.submitButton.click();
    }

    @Then("verify user should see Java folder created in Files module")
    public void verifyUserShouldSeeJavaFolderCreatedInFilesModule() {
        System.out.println("user verify Java folder is visible and created in Files module");
        filesPage.javaFolder.isDisplayed();
        Assert.assertTrue(filesPage.javaFolder.isDisplayed());
    }

}
