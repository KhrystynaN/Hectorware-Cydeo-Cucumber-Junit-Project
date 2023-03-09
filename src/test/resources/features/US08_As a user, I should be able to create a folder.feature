@regression
Feature: As a user, I should be able to add/create a folder.

  Background: User is already in the log in page
    Given user is on the home page

  @US08_MarkoIvanovic
    Scenario: Verify As a user, I should be able to add/create a folder.
      Given user is on Files module
      When user click on upload bar
      And user select New folder
      And user enter Java folder as name
      And user click on submit
      Then verify user should see Java folder created in Files module
