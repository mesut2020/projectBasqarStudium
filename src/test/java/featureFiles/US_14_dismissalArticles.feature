Feature: Create edit and Delete Functionality for Dismissal Articles

  Background:
    Given Navigate to basqar

    When User sending the keys in the dialog content class
      | username | richfield.edu  |
      | password | Richfield2020! |

    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |

    Then User should login successfully

  Scenario: Create Dismissal Articles

    When User click on the element in the dismissalArticlesPOM class
      | hummanResources   |
      | setupHR             |
      | dismissalArticles |

    And User click on the element in the dismissalArticlesPOM class
      | addButton |

    And User sending the keys in the dismissalArticlesPOM class
      | name        | Emily    |
      | description | job done |

    And User click on the element in the dismissalArticlesPOM class
      | saveButton |

    Then User should give a "successfully" message


  Scenario: Edit Dismissal Articles

    When User click on the element in the dismissalArticlesPOM class
      | hummanResources   |
      | setupHR             |
      | dismissalArticles |

    Then User edit in "Emily"

    And User sending the keys in the dismissalArticlesPOM class
      | name        | Maxim     |
      | description | dismissal |

    And User click on the element in the dismissalArticlesPOM class
      | saveButton |

    Then User should give a "successfully" message

  Scenario: Search and delete active

    When User click on the element in the dismissalArticlesPOM class
      | hummanResources   |
      | setupHR             |
      | dismissalArticles |

    Then User sending the keys in the dismissalArticlesPOM class
      | searchName | Maxim |

    And User click on the element in the dismissalArticlesPOM class
      | search |

    When User delete "Maxim"

    And User click on the element in the dismissalArticlesPOM class
      | yesButton |

    Then User should give a "successfully" message
