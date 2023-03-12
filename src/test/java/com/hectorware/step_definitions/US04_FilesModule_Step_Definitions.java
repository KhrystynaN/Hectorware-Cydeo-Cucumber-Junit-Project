package com.hectorware.step_definitions;
import com.hectorware.pages.FilesPage;
import com.hectorware.utilities.BrowserUtils;
import com.hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.Arrays;

public class US04_FilesModule_Step_Definitions {
    FilesPage filesPage=new FilesPage();
    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

        System.out.println("User on the dashboard page!");

    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String expectedModule) {
           expectedModule="Files";
          filesPage.Files.click();
         BrowserUtils.verifyTitleContains(expectedModule);
    }
    @Then("verify the page title is {string}")
    public void verifyThePageTitleIs(String expectedTitle) {

        expectedTitle="Files - Hectorware - QA";


        Assert.assertTrue(expectedTitle.equals(Driver.getDriver().getTitle()));

    }


    @When("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {

   filesPage.mainCheckBox.click();
    }

    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {

        filesPage.readMe.isSelected();
        filesPage.selenium.isSelected();
        filesPage.talk.isSelected();
        filesPage.GitCommands.isSelected();
        filesPage.java.isSelected();

ArrayList<WebElement>ActualChecked=new ArrayList<>();
        ActualChecked.addAll(Arrays.asList(filesPage.readMe, filesPage.selenium,filesPage.talk,filesPage.GitCommands, filesPage.java));

       int expectedSelectedNo=5;
       int ActualSelectedNo=ActualChecked.size();
       Assert.assertTrue(ActualSelectedNo==expectedSelectedNo);


   }

    }

