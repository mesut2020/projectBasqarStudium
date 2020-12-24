Feature: ınventory Item Category Create Edit and Delete Functionality

  Background:
    Given Navigate to basqar
    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |
    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |
    Then User should login successfully
  Scenario: Create, edit and delete a Positions

    And Click on the element in the left class
      | Inventory |
      |setup4   |
      | itemCategories   |

    And Click on the element in the content class
      | addButton |
      | userType  |
      | option1 |

    When User sending the keys in the form content class
      | nameInput | debt Documants|

    And Click on the element in the content class
      | saveButton |

    Then Success message should be displayed

    When Positions User edit the "debt Documants"

    When User sending the keys in the form content class
      | nameInput | allowance|

    And Click on the element in the content class
      | saveButton |
    Then Success message should be displayed

    When User delete the "allowance"

    And Click on the element in the content class
      | yesButton |

    Then Success message should be displayed
