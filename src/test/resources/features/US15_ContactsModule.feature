@regression
Feature: As a user, I should be able to access to Contacts module.


  Background: User is successfully logged in
    Given user is on the home page
  @noor
  Scenario:  verify user access to the contacts module.

    Given user on the dashboard page.

    When the user clicks the "string" module.

    Then verify the page title is "string".

