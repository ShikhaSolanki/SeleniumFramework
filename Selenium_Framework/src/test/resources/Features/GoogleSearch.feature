Feature: MMT Flights Page
  I want to use this template for my feature file

  Scenario: Open flights page of MMT
    Given Open Google Home Page
    When Search bombay to Delhi Flight
    And Click on MMT Flights Link
    Then Verify page tittle is MMT Flights

    
    
    Scenario: Open flights page of ClearTrip Page
    Given Open Google Home Page
    When Search bombay to Delhi Flight
    And Click on Clear Trip Flights Link
    Then Verify page tittle is Clear Trip Flights
    