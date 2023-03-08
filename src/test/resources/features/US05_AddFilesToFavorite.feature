
Feature: As a user, I should be able to access to Files module - Favorites button

  Story: As a user, I should be able to add file to favorites.

  Background: User is successfully logged in
    Given user is on the home page
    Given user sees  the last added file or folder "Selenium" without favorite icon

  @favorite
  Scenario: verify user can add files to favorites
    When user clicks on "Files" module
    And user clicks action-icon from any file on the page
    And user choose Add to favorites option
    And user clicks the "Favorites" sub-module on the left side
    Then verify the chosen file is listed on the table