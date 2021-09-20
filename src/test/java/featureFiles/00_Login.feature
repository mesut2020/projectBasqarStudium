Feature: Login Functionality

  @SmokeTest
  Scenario: Login with valid username and password

    Given Navigate to basqar
    When User sending the keys in the dialog content class
      | username | richfield.edu  |
      | password | Richfield2020! |
    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |
    Then User should login successfully