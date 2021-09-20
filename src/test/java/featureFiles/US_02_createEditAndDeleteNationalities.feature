Feature: Create and delete functionality for Nationalities

  Background:

    Given Navigate to basqar

    When User sending the keys in the dialog content class
      | username | richfield.edu  |
      | password | Richfield2020! |

    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |

    Then User should login successfully


  Scenario: Create und Edit  Nationality

    When User click on the element in the nationalitiesPOM class
      | setup         |
      | parameters    |
      | nationalities |

    And User click on the element in the nationalitiesPOM class
      | addButton |

    And User sending the keys in the nationalitiesPOM class
      | name | Turkei |

    And User click on the element in the nationalitiesPOM class
      | saveButton |

    Then User should give a  "successfully" message

    Then User edit in "Turkei"

    And User sending the keys in the nationalitiesPOM class
      | name | Deutsch |


    And User click on the element in the nationalitiesPOM class
      | saveButton |

    Then User should give a  "successfully" message


  Scenario: Create und Delete Nationality
    When User click on the element in the nationalitiesPOM class
      | setup         |
      | parameters    |
      | nationalities |

    When User click on the element in the nationalitiesPOM class
      | addButton |

    Then User sending the keys in the nationalitiesPOM class
      | name | Deutsch |

    And User click on the element in the nationalitiesPOM class
      | saveButton |

    Then User should give a  "error" message
    And User click on the element in the nationalitiesPOM class
      | closeButton |

    And User sending the keys in the nationalitiesPOM class
      | searchName | Deutsch |

    And User click on the element in the nationalitiesPOM class
      | search |

    When User delete in "Deutsch"


    Then User should give a  "successfully" message


