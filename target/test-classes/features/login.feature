Feature: Application login
  Scenario: Home Page Default login
    Given user is on netbanking landing page
    When user login into application with "jini" and password "1233456"
    Then homepage is populated
    And cards displayed "true"
    
  Scenario: Home Page Default login
    Given user is on netbanking landing page
    When user login into application with "Gowtham" and password "xxxxx"
    Then homepage is populated
    And cards displayed "false"