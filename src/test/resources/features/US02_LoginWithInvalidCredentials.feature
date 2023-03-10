@regression
Feature: As a user, I should not be able to login with invalid credentials.

  Background: User is already in the log in page
    Given user is on the login page
  @invalidLogin
  Scenario Outline: Verify user login fail with invalid credentials

    When user enter invalid "<username>" and "<password>"

    And user click the login button

    Then verify "<message>" message should be displayed

    Examples:

      | username | password    | message                     |

      | User9    | Wrong       | Wrong username or password. |

      | Wrong    | Userpass123 | Wrong username or password. |

      | Wrong    | Wrong       | Wrong username or password. |
