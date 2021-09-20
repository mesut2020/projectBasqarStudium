Feature: Create and Delete Functionality for Notifications

  Background:
    Given Navigate to basqar

    When User sending the keys in the dialog content class
      | username | richfield.edu  |
      | password | Richfield2020! |

    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |

    Then User should login successfully

  Scenario: Create and Delete Notification

    When User click on the element in the USNotifications class
      | messaging     |
      | notifications |

    And User click on the element in the USNotifications class
      | addButton |

    And User sending the keys in the USNotifications class
      | name | technostudy |

    And User click on the element in the USNotifications class
      | type           |
      | studentPayment |

    And User click on the element in the USNotifications class
      | saveButton |

    Then User should see "successfully" message

    When User go to previous page

    And User edit "technostudy"

    And User sending the keys in the USNotifications class
      | name | technostudyEdit |

    And User click on the element in the USNotifications class
      | type           |
      | studentPayment |

    And User click on the element in the USNotifications class
      | saveButton |

    Then User should see "successfully" message

    When User go to previous page

    And User delete "technostudyEdit"

    And User click on the element in the USNotifications class
      | noButton |

    And User delete "technostudyEdit"

    And User click on the element in the USNotifications class
      | yesButton |

    Then User should see "successfully" message


