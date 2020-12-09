Feature: Fees Page Funktionality


  Background:

    Given Navigate to basqar
    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |

    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton    |

    Then User should login successfullyfully

  Scenario: User should be able to create a new Fee Type

    When user click on the element in the FeesPage
    |setup     |
    |parameters|
    |fees      |
    |addFormButton|

    When user send the keys on the element in the FeesPage
    |formFeeName| KDV   |
    |formCode   | kdv123|
    |formPriority| 24   |


    When user click on the element in the FeesPage
    |formSave   |

    Then "Fee Type successfully created" message should be displayed


  Scenario: User should be able to update an existent Fee Type

    When user click on the element in the FeesPage
      |setup     |
      |parameters|
      |fees      |

    When user send the keys on the element in the FeesPage
      |searchName| KDV    |

    When user click on the element in the FeesPage
      |searchButton  |
      |formEditButton|

    When user send the keys on the element in the FeesPage
      |formFeeName | OTV   |
      |formCode    | otv123|
      |formPriority| 22    |

    When user click on the element in the FeesPage
      |formSave   |

    Then "fee type successfully updated" message should be displayed

  Scenario: User should be able to search a Fee Type

    When user click on the element in the FeesPage
      |setup     |
      |parameters|
      |fees      |

    When user send the keys on the element in the FeesPage
      |searchName| OTV    |

    When user click on the element in the FeesPage
      |searchButton  |

    Then "OTV" should be in the list


  Scenario: User should be able to delete an existent Fee Type

    When user click on the element in the FeesPage
      |setup     |
      |parameters|
      |fees      |

    When user send the keys on the element in the FeesPage
      |searchName| OTV    |

    When user click on the element in the FeesPage
      |searchButton  |

    When user click on the element in the FeesPage
      |deleteButton  |
      |yesButton     |

    Then "fee type successfully deleted" message should be displayed