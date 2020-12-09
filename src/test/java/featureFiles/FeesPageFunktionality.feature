Feature: Fees Page Funktionality


  Scenario: Creat a Fee

    Given Navigate to basqar
    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |

    And User click on the element in the dialog content class
      | loginButton |
      | gotItBtn    |

    Then User should login successfullyfully


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

    Then "fee type successfully created" message should be displayed

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

    When user send the keys on the element in the FeesPage
      |searchName| OTV    |

    When user click on the element in the FeesPage
      |searchButton  |
      |deleteButton  |
      |yesButton     |

    Then "fee type successfully deleted" message should be displayed