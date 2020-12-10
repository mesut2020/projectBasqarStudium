Feature: User should be able to create a new Discount

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

    Scenario: Scenario1
      And click on Setup
      |Setup|
      And click on  Parameters
      |parameters|
      And click  on Discounts
      |discounts|
      When click on Add Discount
      |addDiscount|
      Then type description on Description Box
      |description| New Year Discount |
      And type numbers on Integraiton Code Box
      |integrationCode| 45329023 |
      And type number on Priority Box
      |priority|0|
      Then click on Save button
      |saveButton|

  Scenario: Scenario2
    And click on Setup
      |Setup|
    And click on  Parameters
      |parameters|
    And click  on Discounts
      |discounts|
    When click on the edit button that belongs to discount that we create before
    Then type description on Description Box
      |description|My Discount|
    And type numbers on Integraiton Code Box
      |integrationCode| 39083 |
    And type number on Priority Box
      |priority| 1|
    Then click on Save button
      |saveButton|

  Scenario: Scenario3
    And click on Setup
      |Setup|
    And click on  Parameters
      |parameters|
    And click  on Discounts
      |discounts|
    Then click on the delete button that belongs to discount that we update before
    And click on yes button
      |yesButton|
