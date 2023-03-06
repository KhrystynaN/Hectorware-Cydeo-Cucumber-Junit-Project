package com.hectorware.step_definitions;

import com.hectorware.pages.FilesPage;
import com.hectorware.pages.LoginPage;
import com.hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US01_US02_Login_Step_Definition {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User is on login page");
    }

    @When("user use username {string} and passcode {string}")
    public void userUseUsernameAndPasscode(String username, String password) {
        loginPage.input_username.sendKeys(username);
        loginPage.input_password.sendKeys(password);
    }

    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPage.login_Btn.click();
    }

    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        String expectedTitle = "Files - Hectorware - QA";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String invalidUsername, String invalidPassword) {
        loginPage.input_username.sendKeys(invalidUsername);
        loginPage.input_password.sendKeys(invalidPassword);
    }

    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String expectedMessage) {
        String actualMessage = loginPage.invalidLoginMsg.getText();

        Assert.assertEquals(expectedMessage,actualMessage);
    }
}
