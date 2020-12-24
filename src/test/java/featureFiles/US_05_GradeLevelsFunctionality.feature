Feature: Grade Levels Functionality

  Background:
    Given Navigate to basqar

    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |

    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |

    Then User should login successfully

  Scenario:  Create a Grade Level

    When User click on the element Grade Levels
      | setup       |
      | parameters  |
      | gradeLevels |
      | addButton   |

    And User sending the keys Grade Levels
      | name      | Techno |
      | shortName | Study  |
      | order     | 1      |

    And User click on the element Grade Levels
      | saveButton |

    Then User should see "successfully" message Grade Levels


  Scenario:  Update a Grade Level

    When User click on the element Grade Levels
      | setup       |
      | parameters  |
      | gradeLevels |

    Then User "edit" "Techno"

    And User sending the keys Grade Levels
      | name | Techno1 |

    And User click on the element Grade Levels
      | saveButton |

    Then User should see "successfully" message Grade Levels

  Scenario:  Delete a Grade Level

    When User click on the element Grade Levels
      | setup       |
      | parameters  |
      | gradeLevels |

    Then User "delete" "Techno1"

    And User click on the element Grade Levels
      | yesButton |

    Then User should see "successfully" message Grade Levels

  Scenario:  Negative Test a Grade Level

    When User click on the element Grade Levels
      | setup       |
      | parameters  |
      | gradeLevels |
      | addButton   |

    And User sending the keys Grade Levels
      | shortName | Study  |
      | order     | 1      |

    Then Check if "saveButton" is not active