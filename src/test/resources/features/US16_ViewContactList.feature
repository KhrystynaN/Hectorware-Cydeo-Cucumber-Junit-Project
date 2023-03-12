@contact
Feature: : As a user, I should be able to view the contact list.

  Background: User is successfully logged in
    Given user is on the home page
    And user clicks contacts module
    And user clicks on +New contact
    And user create 4 contacts name in Company input box
      | name1 | Gurhan |
      | name2 | Mike   |
      | name3 | Muhtar |
      | name4 | Test   |

  Scenario: verify users can see all the contact names on the contact list
    # Failed test
    Given user clicks contacts module
    Then verify the contact names below are in the list
      | Gurhan |
     | Mike   |
      | Muhtar |
      | Test   |



