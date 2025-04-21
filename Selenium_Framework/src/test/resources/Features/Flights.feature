Feature: Validate the Flights Page

  Scenario: Select Air India Check Box 
    Given Open Chrome browser
    When Navigate to MMTFlights Web Page
    Then Select AirIndia Filter
    And Close the Browser