@TEST
Feature: As a user, I should be able to write comments to files/folders.
  Background: User is successfully logged in
    Given user is on the home page

# POSITIVE  >>150 characters maximum limit.
  Scenario: Verify users to write comments to files/folder
        #>>TC01: Verify users able to submit comment by summit button

    When the user clicks the Files module
    And user clicks action-icon from any file on the page
    And user choose the Details option
    And user clicks comments option
    And user write a comment inside the input box
    And user clicks the submit button to post it
    Then Verify the comment is displayed in the comment section.

  Scenario: Verify users to write comments to files/folder
   #>>TC02: Verify users able to submit comment by HIT ENTER

    When the user clicks the Files module
    And user clicks action-icon from any file on the page
    And user choose the Details option
    And user clicks comments option
    And user write a comment inside the input box and ENTER
    Then Verify the comment is displayed in the comment section.

#NEGATIVE    >> more than 150 characters
  Scenario: Verify users to write comments to files/folder
        #>>TC03: Verify users unable to submit comment by summit button
    When the user clicks the Files module
    And user clicks action-icon from any file on the page
    And user choose the Details option
    And user clicks comments option
    And user write a comment inside the input box more than 150 characters
    Then Validation pop-up error message is display "Allowed characters  of 150"
    Then Verify the submit button is disable


  Scenario: Verify users to write comments to files/folder
        #>>TC04: Verify users unable to submit comment by summit button
    When the user clicks the Files module
    And user clicks action-icon from any file on the page
    And user choose the Details option
    And user clicks comments option
    And user write a comment inside the input box more than 150 characters
    Then Validation pop-up error message is display "Allowed characters  of 150"
    Then Validation user unable to post the comment


    #    0 character  >> empty comment

  Scenario: Verify users to write comments to files/folder
        #>>TC05: Verify users unable to submit comment by summit button
    When the user clicks the Files module
    And user clicks action-icon from any file on the page
    And user choose the Details option
    And user clicks comments option
    Then user clicks the submit button to post it
    Then Validation user unable to post the comment


  Scenario: Verify users to write comments to files/folder
        #>>TC06: Verify users unable to submit comment by hit Enter
    When the user clicks the Files module
    And user clicks action-icon from any file on the page
    And user choose the Details option
    And user clicks comments option
    And user clicks the comment box
    And user hit ENTER to post comment
    Then Validation user unable to post the comment



