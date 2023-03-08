package com.hectorware.step_definitions;

import com.hectorware.pages.FilesPage;
import com.hectorware.pages.LoginPage;
import com.hectorware.utilities.BrowserUtils;
import com.hectorware.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US12_Update_Settings_Step_Definitions {


    FilesPage filesPage = new FilesPage();


    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string)  {
        filesPage.filesModule.click();

    }

    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner()  {
       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.visibilityOf(filesPage.settingsButton));
        filesPage.settingsButton.click();
        BrowserUtils.sleep(2);


    }
    @Then("the user should be able to click any checkbox")
    public void the_user_should_be_able_to_click_any_checkbox() {
    /*    List<WebElement> list = new ArrayList<>();
        list.add(filesPage.settingCheckbox1_richWorkspaces);
        list.add(filesPage.settingCheckbox2_recommendations);
        list.add(filesPage.settingCheckbox3_hiddenFiles);

        for (WebElement each : list) {
            each.click();
            Assert.assertTrue(each.isSelected());
        }
*/

    /*    filesPage.settingCheckbox1_richWorkspaces.click();
        filesPage.settingCheckbox1_richWorkspaces.isSelected();
        filesPage.settingCheckbox1_richWorkspaces.click();
        BrowserUtils.sleep(1);

        filesPage.settingCheckbox2_recommendations.click();
        Assert.assertTrue(filesPage.settingCheckbox2_recommendations.isSelected());
        filesPage.settingCheckbox2_recommendations.click();
        BrowserUtils.sleep(1);

        filesPage.settingCheckbox3_hiddenFiles.click();
        Assert.assertTrue(filesPage.settingCheckbox3_hiddenFiles.isSelected());
        filesPage.settingCheckbox3_hiddenFiles.click();
        BrowserUtils.sleep(1);
     */
       Assert.assertTrue(filesPage.settingCheckbox1_richWorkspaces.isEnabled());
       Assert.assertTrue(filesPage.settingCheckbox2_recommendations.isEnabled());
       Assert.assertTrue(filesPage.settingCheckbox3_hiddenFiles.isEnabled());

    }

}
