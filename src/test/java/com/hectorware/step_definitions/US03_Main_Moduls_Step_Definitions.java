package com.hectorware.step_definitions;

import com.hectorware.pages.HomePage;
import com.hectorware.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US03_Main_Moduls_Step_Definitions {

    LoginPage loginPage =new LoginPage();
    HomePage homePage= new HomePage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        loginPage.login();
    }

    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(io.cucumber.datatable.DataTable dataTable) {
        Assert.assertTrue(homePage.activity.isDisplayed());
        Assert.assertTrue(homePage.calendar.isDisplayed());
        Assert.assertTrue(homePage.contacts.isDisplayed());
        Assert.assertTrue(homePage.mail.isDisplayed());
        Assert.assertTrue(homePage.notes.isDisplayed());
        Assert.assertTrue(homePage.files.isDisplayed());
        Assert.assertTrue(homePage.talk.isDisplayed());
        Assert.assertTrue(homePage.photos.isDisplayed());

    }





}



