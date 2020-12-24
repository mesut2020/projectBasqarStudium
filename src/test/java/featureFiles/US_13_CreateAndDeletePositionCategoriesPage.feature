Feature: Create and Delete Position Categories Page functionality

Background:
Given Navigate to basqar

When User sending the keys in the dialog content class
| username | daulet2030@gmail.com |
| password | TechnoStudy123@      |

And User click on the element in the dialog content class
| loginButton |
| gotItButton |

Then User should login successfully

Scenario:  Create, Edit and Delete Position Salary

When User click on the element in the USNotifications class
| humanResources     |
| setupHR            |
| positionCategories |

And User click on the element in the USNotifications class
| addButton |

And User sending the keys in the USNotifications class
| name | technostudy |

And User click on the element in the USNotifications class
| saveButton |

Then User should see "successfully" message

And User edit "technostudy"

And User sending the keys in the USNotifications class
| name | technostudyEdit |

And User click on the element in the USNotifications class
| saveButton |

Then User should see "successfully" message

And User delete "technostudyEdit"

And User click on the element in the USNotifications class
| noButton |

And User delete "technostudyEdit"

And User click on the element in the USNotifications class
| yesButton |

Then User should see "successfully" message