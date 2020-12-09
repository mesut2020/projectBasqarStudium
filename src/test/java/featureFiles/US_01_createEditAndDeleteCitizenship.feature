Feature: User should be able to use Citizenship Page functionality

  Background: Navigate and login to basqar

    Given Navigate to basqar
    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |
    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |
    Then User should login successfully

  Scenario: User should be able to create new citizenship with required information
    When user clicks on the element on the citizenshipPOM
      | setup        |
      | parameters   |
      | citizenships |
      | addButton    |

    Then "saveButton" should be not clickable

    And user enters data on page citizenshipPOM
      | shortName | FYROM |

    Then "saveButton" should be not clickable

    And user enters data on page citizenshipPOM
      | name | !@#$%^&*123 |

    And user clicks on the element on the citizenshipPOM
      | saveButton |

    Then user should see the message "error"

    And user enters data on page citizenshipPOM
      | name | FYR of Macedonia |

    And user clicks on the element on the citizenshipPOM
      | saveButton |

    Then user should see the message "Citizenship successfully created"

  Scenario: User should be able to update an existing citizenship
    When user clicks on the element on the citizenshipPOM
      | setup        |
      | parameters   |
      | citizenships |

    And user edits "FYR of Macedonia"

    And user enters data on page citizenshipPOM
      | name      | MNG Mongolia |
      | shortName | MNG          |

    And user clicks on the element on the citizenshipPOM
      | saveButton |

    Then user should see the message "Citizenship successfully updated"

  Scenario: User should be able to delete an existing citizenship
    When user clicks on the element on the citizenshipPOM
      | setup        |
      | parameters   |
      | citizenships |

    And user deletes "MNG Mongolia"

    And user clicks on the element on the citizenshipPOM
      | noButton |

    Then "MNG Mongolia" shouldn't be deleted

    And user deletes "MNG Mongolia"

    And user clicks on the element on the citizenshipPOM
      | yesButton |

    Then user should see the message "Citizenship successfully deleted"

  Scenario: User should not be able to create a new citizenship with a name that contains special characters and numbers

    When user clicks on the element on the citizenshipPOM
      | setup        |
      | parameters   |
      | citizenships |
      | addButton    |

    And user enters data on page citizenshipPOM
      | shortName | FYROM |

    And user enters data on page citizenshipPOM
      | name | !@#$%^&*123 |

    And user clicks on the element on the citizenshipPOM
      | saveButton |

    Then user should see the message "Error! Name is invalid, please enter only letters"






