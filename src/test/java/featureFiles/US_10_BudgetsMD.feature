Feature: Budget page functionality

  Background:
    Given user goes to basqar "https://test.basqar.techno.study/"
    And user login to basqar with credentials
    Then user should see the page title as "Dashboard"

  Scenario: TC_01 User should be able to view Budgets page
    When user goes to Budgets page
    Then user should see the page title as "Budgets"

  Scenario: TC_02 User  should be able to add a Budget
  and view  successfully validating the message
    When user goes to Budgets page
    And user creates a Budget
    Then user should see the message "Budget successfully created" on the screen

  Scenario: TC_03 User should not be able to add without Year,Budget Group and School
    When user goes to Budgets page
    And user types a description
    But save button should not be clickable

  Scenario: TC_04 User should be able to delete  Budgets
  and view  successfully validating the message
    When user goes to Budgets page
    And user delete existing Budget
    Then user should see the message "Budget successfully deleted" on the screen