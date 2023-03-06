@login
Feature: As a user, I should be able to log in

  Background: User is already in the log in page
    Given user is on the login page


  Scenario Outline: Verify login with valid credentials

    When user use username "<username>" and passcode "<password>"

    And user click the login button

    Then verify the user should be at the dashboard page

    Examples:

      | username | password    |

      | user99   | Userpass123 |

      | user7    | Userpass123 |

      | user34   | Userpass123 |

