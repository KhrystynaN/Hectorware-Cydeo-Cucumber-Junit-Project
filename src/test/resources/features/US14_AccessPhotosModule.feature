Feature: As a user, I want to access to Photos module.

  Background: User is successfully logged in
    Given user is on the home page

  @photos
  Scenario:  verify user access to the photos module
    When user clicks on "Photos" module
    Then verify there are following sub-modules
      | Your photos   |
      | Favorites     |
      | Your albums   |
      | Shared albums |
      | Tagged photos |