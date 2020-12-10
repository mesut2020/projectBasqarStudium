Feature: User should be able to delete an existant Discount

  Background:
    Given Navigate to basqar
    #username ve passwordu gir ve login butonuna tıklat
    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |
    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton    |
    #Login olduğunu doğrula
    Then User should login successfully

  Scenario: Name
    And click on Setup
      |setup|
    And click on  Parameters
      |parameters|
    And click  on Discounts
      |discounts|
    Then click on the delete button that belongs to discount that we update before
    And click on yes button
    |yesButton|