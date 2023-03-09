package com.hectorware.step_definitions;

import com.hectorware.pages.ContactsPage;
import com.hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US15_ContactsModule_Step_Definitions {


    @Given("user on the dashboard page.")
    public void user_on_the_dashboard_page() {

        System.out.println("user on the dashboard page!");


    }

    @When("the user clicks the {string} module.")
    public void the_user_clicks_the_module(String Module) {

        Module="Contacts";
        ContactsPage contactsPage=new ContactsPage();

        contactsPage.contacts.click();
    }

    @Then("verify the page title is {string}.")
    public void verify_the_page_title_is(String expectedTitle) {

       expectedTitle="Contacts - Hectorware - QA" ;


        Assert.assertTrue(expectedTitle.equals(Driver.getDriver().getTitle()));

    }

}
