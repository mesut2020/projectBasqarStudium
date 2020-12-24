Feature: User should be able to use Budget Projects Page functionality.(Budget-Setup)

  Background:
    Given Navigate to basqar
    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |
    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |
    Then User should login successfully

  Scenario: US_09 TC_01 User should be able to view Position Budget Projects page

    When User click on the element at Budget Project
      | budget         |
      | setupBudget    |
      | budgetProjects |
    Then User should see Budget Projects page correctly

  Scenario: US_09 TC_02 User should be able to add Budget Project and view  successfully validating the message

    When User click on the element at Budget Project
      | budget         |
      | setupBudget    |
      | budgetProjects |
      | addButton |
    Then Send value to element's inputbox
      | name        | grp333 |
      | accountCode | 3.3    |
    When User click on the element at Budget Project
      | saveButton         |
    Then User should see "successfully" message at Budget Project

  Scenario: US_09 TC_03 User should not be able to add without Code

    When User click on the element at Budget Project
      | budget         |
      | setupBudget    |
      | budgetProjects |
      | addButton |
    Then Send value to element's inputbox
      | name        | grp333deneme |
      | accountCode |  |
    Then check the button as name of "saveButton", should be inactive

  Scenario: US_05 TC_04 delete element
    When User click on the element at Budget Project
      | budget         |
      | setupBudget    |
      | budgetProjects |

    And User delete element name of "grp333"

    And User click on the element at Budget Project
      | yesButton |

    Then User should see "successfully" message at Budget Project