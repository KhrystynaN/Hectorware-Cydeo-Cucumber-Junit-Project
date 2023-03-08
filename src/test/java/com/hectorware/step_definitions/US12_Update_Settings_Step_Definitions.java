package com.hectorware.step_definitions;

import com.hectorware.pages.FilesPage;
import com.hectorware.pages.LoginPage;
import com.hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US12_Update_Settings_Step_Definitions {


    FilesPage filesPage = new FilesPage();


    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string)  {
        filesPage.goToFiles();

    }

    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner()  {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(filesPage.settingsButton));
        filesPage.settingsButton.click();


    }
    @Then("the user should be able to click any checkbox")
    public void the_user_should_be_able_to_click_any_checkbox() {

    }

}
