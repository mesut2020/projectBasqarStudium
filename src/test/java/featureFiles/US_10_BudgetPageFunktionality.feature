Feature: Budget Page Funktionality


  Background:

    Given Navigate to basqar
    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |

    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |

    Then User should login successfully

  Scenario:  User should be able to view  Budgets page Type

    When user click on the element in the Budget Page
      | budget  |
      | budgets |


    Then Page title   should be "Budgets"


  Scenario: User  should be able to create  Budgets and view  successfully validating the message

    When user click on the element in the Budget Page
      | budget          |
      | budgets         |
      | addFormButton   |
      | formBudgetGroup |

    And user select "Бюджетная группа на 2020"


    When user click on the element in the Budget Page
      | formBudgetType |

    And user select "Current"

    When user click on the element in the Budget Page
      | formSchool |

    And user select "ErzincanCCCC High School"



    When user send the keys on the element in the Budget Page
      | formdescription | 2021 Butcesi |
      | formYear        | 2021         |


    When user click on the element in the Budget Page

      | formSave |


    Then "Budget successfully created" message should be displayed


  Scenario: User should not be able to add without Year,Budget Group and School


    When user click on the element in the Budget Page
      | budget        |
      | budgets       |
      | addFormButton |

    When user send the keys on the element in the Budget Page
      | formdescription | 2021 Butcesi |


    But Save button should not be clickable


  Scenario: User should be able to delete  Budgets and view  successfully validating the message

    When user click on the element in the Budget Page
      | budget      |
      | budgets     |
      | budgetGroup |

    And user select "Бюджетная группа на 2020"

And user delete Budget


    When user click on the element in the Budget Page

      | yesButton    |


    Then "Budget successfully deleted" message should be displayed