Feature: Login Functionality

  Scenario: Login with valid username and password

    #siteyi aç - basgara a git
    Given Navigate to basqar
    #username ve passwordu gir ve login butonuna tıklat
    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |
    And User click on the element in the dialog content class
      | loginButton |
      | gotItBtn    |
    #Login olduğunu doğrula
    Then User should login successfullyfully