@B28G18-129
Feature: Default

	Background:
		#@B28G18-106
		Given user is on the home page
		#@B28G18-126
		 
		    And user clicks contacts module
		    And user clicks on +New contact
		    And user create 4 contacts name in Company input box
		      | name1 | Gurhan |
		      | name2 | Mike   |
		      | name3 | Muhtar |
		      | name4 | Test   |
		


	@B28G18-125
	Scenario: US16_AC01 verify users can see all the contact names on the contact list
		Given user clicks contacts module
		    Then verify the contact names below are in the list
		      | Gurhan |
		      | Mike   |
		      | Muhtar |
		      | Test   |