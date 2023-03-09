@regression
Feature: As a user, I should be able to update settings.

  Background: User is successfully logged in
    Given user is on the home page
   @B28G18-89
  Scenario: Verify the users can check any checkbox on the Files page.
    When user clicks the "Files" module
    And user clicks Settings on the left bottom corner
    Then the user should be able to click any checkbox
