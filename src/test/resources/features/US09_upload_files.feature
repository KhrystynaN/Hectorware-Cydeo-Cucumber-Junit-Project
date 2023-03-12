Feature:  As a user, I should be able to upload files to existing folders on the Files page.


  Background: User is already in the log in page
    Given user is on the login page

  @Wip28
  Scenario:  Verify users can upload a file to an existing folder.

    When the user enters valid credentials
    When the user clicks the "Files" module
    And user choose a folder from the page
    And user clicks the add icon on the top
    When the user uploads a file with the upload file option
    Then Verify the file is displayed on the page
