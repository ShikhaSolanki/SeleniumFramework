Feature: Validate the Home Page

  Scenario: Get the Class of each menu Item
    Given Open Chrome browser
    When Navigate to MMT Web Page
    And Check the login Popup
    And Close Login PopUp and look for Flights
    Then Get Class of Menu Items
    And Close the Browser

  Scenario: Select Trip Radio button
    Given Open Chrome browser
    When Navigate to MMT Web Page
    And Check the login Popup
    And Close Login PopUp and look for Flights
    Then Select round trip
    And Select Multi City Trip
    And Close the Browser
