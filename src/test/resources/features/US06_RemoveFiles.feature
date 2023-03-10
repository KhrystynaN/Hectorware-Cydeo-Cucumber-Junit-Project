
Feature: Remove files or folders from favorites
  Agile story:As a user, I should be able to remove files from favorites

  Background: User is successfully logged in
    Given user is on the home page
    When  user click action-icon from any file on the page to remove
    When user should click to "Add To Favorite" option


  @rem00002
  Scenario: verify users to remove files to Favorites
    When  user clicks to the Files module
    When  user click action-icon from any file on the page to remove
    And   user choose the "Remove from favorites" option
    And   user click the "Favorites" sub-module

    Then  Verify that the file is not listed in the Favorites table

