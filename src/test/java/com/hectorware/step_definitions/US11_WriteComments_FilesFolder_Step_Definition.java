package com.hectorware.step_definitions;

import com.github.javafaker.Faker;
import com.github.javafaker.Lorem;
import com.hectorware.pages.BasePage;
import com.hectorware.pages.FilesPage;
import com.hectorware.utilities.BrowserUtils;
import com.hectorware.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US11_WriteComments_FilesFolder_Step_Definition extends BasePage {
    FilesPage filesPage = new FilesPage();
    Faker faker = new Faker();
    Lorem lorem = faker.lorem();
    String randomString150 = lorem.characters(150);
    String negativeString151 = lorem.characters(151);

    @When("the user clicks the Files module")
    public void the_user_clicks_the_module() {
        navigateTo("Files");

    }

    @When("user clicks action-icon from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        filesPage.btn_action_icon.click();
    }

    @When("user choose the Details option")
    public void user_choose_the_option() {
        filesPage.btn_details.click();
    }

    @When("user clicks comments option")
    public void user_click_comments_option() {
        filesPage.btn_comments.click();
    }

    @When("user write a comment inside the input box")
    public void user_write_a_comment_inside_the_input_box() {
        filesPage.input_comment.sendKeys(randomString150);
    }

    @When("user clicks the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        filesPage.btn_summit.click();
    }

    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {
        BrowserUtils.sleep(2);

        Assert.assertTrue(filesPage.comment_Display_box.isDisplayed());

        String actualMsg = filesPage.comment_Display_box.getText();
        String expectedMsg = randomString150;
        Assert.assertEquals(expectedMsg, actualMsg);
    }

    @And("user write a comment inside the input box and ENTER")
    public void userWriteACommentInsideTheInputBoxAndENTER() {
        filesPage.input_comment.sendKeys(randomString150, Keys.ENTER);

    }

    @Then("Verify the submit button is disable")
    public void verifyTheSubmitButtonIsDisable() {
        boolean actualResult = filesPage.btn_summit.isEnabled();
        boolean expectedResult = !(filesPage.btn_summit.isEnabled());
        Assert.assertEquals(expectedResult, actualResult);

    }

    @And("user write a comment inside the input box more than {int} characters")
    public void userWriteACommentInsideTheInputBoxMoreThanCharacters(int arg0) {
        filesPage.input_comment.sendKeys(negativeString151);
    }

    @Then("Validation pop-up error message is display {string}")
    public void validationErrorMessageDisplay(String arg0) {
        filesPage.msg_error.isDisplayed();

    }


    @Then("Validation user unable to post the comment")
    public void validationNoBlankMessageIsDisplayUserUnableToPostEmptyComment() {
        String expectedResult = filesPage.first_comment_msg.getText();
        filesPage.btn_summit.click();
        String actualResult = filesPage.first_comment_msg.getText();
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("actualResult = " + actualResult);
        System.out.println("expectedResult = " + expectedResult);


    }



    @And("user clicks the comment box")
    public void userClicksTheCommentBox() {
        filesPage.input_comment.click();
    }

    @And("user hit ENTER to post comment")
    public void userHitENTERToPostComment() {
        filesPage.input_comment.sendKeys("",Keys.ENTER);
    }


}
