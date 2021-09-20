Feature: Attestations Functionality

  Background:
    Given Navigate to basqar

    When User sending the keys in the dialog content class
      | username | richfield.edu  |
      | password | Richfield2020! |

    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |

    Then User should login successfully

  Scenario:  Navigate to Attestations Page

    When User click on the element Attestations
      | humanResources |
      | setupHR        |
      | attestations   |

    Then User should see "Attestations" Page

  Scenario:  Create a Attestations

    When User click on the element Attestations
      | humanResources |
      | setupHR        |
      | attestations   |
      | addButton      |

    And User sending the keys Attestations
      | name      | Techno |

    And User click on the element Attestations
      | saveButton |

    Then User should see "successfully" message Attestations


  Scenario:  Update a Attestations

    When User click on the element Attestations
      | humanResources |
      | setupHR        |
      | attestations   |

    Then User "edit" "Techno" Attestations

    And User sending the keys Attestations
      | name | Techno1 |

    And User click on the element Attestations
      | saveButton |

    Then User should see "successfully" message Attestations

  Scenario: Search List a Attestations

    When User click on the element Attestations
      | humanResources |
      | setupHR        |
      | attestations   |

    And User sending the keys Attestations
      | searchName | Techno1 |

    And User click on the element Attestations
      | search |

    Then User should see search List "Techno1" Attestations


  Scenario:  Delete a Attestations

    When User click on the element Attestations
      | humanResources |
      | setupHR        |
      | attestations   |

    Then User "delete" "Techno1" Attestations

    And User click on the element Attestations
      | yesButton |

    Then User should see "successfully" message Attestations

