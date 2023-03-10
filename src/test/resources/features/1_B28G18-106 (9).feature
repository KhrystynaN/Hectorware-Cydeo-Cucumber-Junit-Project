@B28G18-116
Feature: Default

	Background:
		#@B28G18-106
		Given user is on the home page
		


	@B28G18-105 @B28G18-99
	Scenario: US11-AC01-TC01 Verify users able to write comments to files/folder

		
		    When the user clicks the Files module
		    And user clicks action-icon from any file on the page
		    And user choose the Details option
		    And user clicks comments option
		    And user write a comment inside the input box
		    And user clicks the submit button to post it
		    Then Verify the comment is displayed in the comment section.	


	@B28G18-107 @B28G18-99
	Scenario: US11-AC01-TC02 Verify users able to write comments to files/folder

		
		    When the user clicks the Files module
		    And user clicks action-icon from any file on the page
		    And user choose the Details option
		    And user clicks comments option
		    And user write a comment inside the input box and ENTER
		    Then Verify the comment is displayed in the comment section.	


	@B28G18-108 @B28G18-99
	Scenario: US11-AC01-TC03 Verify users  write comments to files/folder

		    When the user clicks the Files module
		    And user clicks action-icon from any file on the page
		    And user choose the Details option
		    And user clicks comments option
		    And user write a comment inside the input box more than 150 characters
		    Then Validation pop-up error message is display "Allowed characters  of 150"
		    Then Verify the submit button is disable	


	@B28G18-109 @B28G18-99
	Scenario: US11-AC01-TC04 Verify users  write comments to files/folder

		      
		    When the user clicks the Files module
		    And user clicks action-icon from any file on the page
		    And user choose the Details option
		    And user clicks comments option
		    And user write a comment inside the input box more than 150 characters
		    Then Validation pop-up error message is display "Allowed characters  of 150"
		    Then Validation user unable to post the comment	


	@B28G18-113 @B28G18-99
	Scenario: US11-AC01-TC05 Verify users  write comments to files/folder
		When the user clicks the Files module
		    And user clicks action-icon from any file on the page
		    And user choose the Details option
		    And user clicks comments option
		    Then user clicks the submit button to post it
		    Then Validation user unable to post the comment	


	@B28G18-115 @B28G18-99
	Scenario: US11-AC01-TC06 Verify users  write comments to files/folder
		When the user clicks the Files module
		    And user clicks action-icon from any file on the page
		    And user choose the Details option
		    And user clicks comments option
		    And user clicks the comment box
		    And user hit ENTER to post comment
		    Then Validation user unable to post the comment