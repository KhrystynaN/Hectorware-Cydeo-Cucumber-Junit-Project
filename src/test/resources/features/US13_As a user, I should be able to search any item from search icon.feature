@US13_MarkoIvanovic
Feature: As a user, I should be able to search any item/ users from the search icon.

  Background: User is already in the log in page
    Given user is on the home page

  Scenario: Verify As a user, I should be able to search any item/ users from the search icon.
    Given user is on Files module
    When user click on search icon
    And user type selenium in search
    Then verify, the app is displaying related result