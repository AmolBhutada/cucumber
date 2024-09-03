Feature: Login Functionality

  Scenario: User logs in with valid credentials
    Given the user is on the login page
    When the user enters valid username "john_doe" and password "password123"
    And the user clicks the login button
    Then the user should be logged in successfully

  Scenario: User logs in with invalid credentials
    Given the user is on the login page
    When the user enters invalid username "invalid_user" and password "wrong_password"
    And the user clicks the login button
    Then the user should see an error message

  Scenario Outline: User logs in with multiple sets of credentials
    Given the user is on the login page
    When the user enters valid username "<username>" and password "<password>"
    And the user clicks the login button
    Then the user should be logged in successfully

    Examples:
      | username      | password     |
      | user1         | pass123      |
      | user2         | pass456      |
      | another_user  | secret_pass  |

     
   
