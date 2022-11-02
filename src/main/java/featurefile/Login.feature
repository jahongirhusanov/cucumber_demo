Feature: User Login Feature

  Scenario: User Login Scenario
    Given User is at the login page of the application
    When User login with the following username and password
      | usernameOne   | passwordOne   |
      | usernameTwo   | passwordTwo   |
      | usernameThree | passwordThree |
      | usernameFour  | passwordFour  |
    Then User should be logged with correct username and password
