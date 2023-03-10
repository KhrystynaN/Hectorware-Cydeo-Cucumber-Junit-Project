package com.hectorware.step_definitions;

import com.hectorware.pages.BasePage;
import com.hectorware.pages.ContactsPage;
import com.hectorware.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class US16_ViewContactList_Step_Definition extends BasePage {
    ContactsPage contactsPage = new ContactsPage();

    @When("user clicks contacts module")
    public void user_clicks_contacts_module() {

        navigateTo("Contacts");
    }

    @And("user clicks on +New contact")
    public void userClicksOnNewContact() {

    }

    @And("user create 4 contacts name in Company input box")
    public void userInputContactNameInCompanyInputBox(Map<String, String> contactName) {
        //  BrowserUtils.sleep(5);
        // contactsPage.input_companyName.sendKeys(contactName.get("name1"), Keys.ENTER);
        int num = 1;
        for (int i = 0; i < 4; i++) {
            contactsPage.btn_new_contact_button.click();
            contactsPage.input_companyName.sendKeys(contactName.get("name" + num), Keys.ENTER);
            num++;
            BrowserUtils.sleep(2);
        }
        BrowserUtils.sleep(10);
    }

    @Then("verify the contact names below are in the list")
    public void verify_the_contact_names_are_in_the_list(List<String> expectedContactName) {

    int num = expectedContactName.size();
        System.out.println(num);
        List<String> actualContactName = new ArrayList<>();
        int contactNum = 1;
        for (int i = 0; i < num; i++) {
            actualContactName.add(contactsPage.getContactsName(contactNum));
            contactNum++;
        }
        Assert.assertEquals(expectedContactName, actualContactName);
  }


    }
