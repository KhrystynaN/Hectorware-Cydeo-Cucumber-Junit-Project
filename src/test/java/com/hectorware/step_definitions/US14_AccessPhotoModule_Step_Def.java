package com.hectorware.step_definitions;

import com.hectorware.pages.PhotosPage;
import com.hectorware.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.List;

public class US14_AccessPhotoModule_Step_Def {

    PhotosPage photosPage = new PhotosPage();

    @When("user clicks on {string} module")
    public void user_clicks_on_module(String module) {
       photosPage.navigateTo(module);
    }
    @Then("verify there are following sub-modules")
    public void verify_there_are_following_sub_modules(List<String> expectedSubModules) {

        List<String> actualSubModules = BrowserUtils.getElementsText(photosPage.photosSubMenu());
        System.out.println("actualSubModules = " + actualSubModules);
        Assert.assertEquals(expectedSubModules,actualSubModules);
    }
}
