@mainModules
Feature: As a user, I should be accessing all the main modules of the app.

  Background: User is successfully logged in
    Given user is on the home page

  Scenario:  Verify users accessing all the main modules of the app.

    Then Verify the user see the following modules:


      | Files     |
      | Photos    |
      | Activity  |
      | Talk      |
      | Mail      |
      | Contacts  |
      | Calendar  |
      | Notes      |
