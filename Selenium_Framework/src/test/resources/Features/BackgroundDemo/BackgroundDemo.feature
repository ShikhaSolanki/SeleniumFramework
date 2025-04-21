Feature: Verify the login popup

  Background: user able to see the Login Popup
    Given Open the Web browser
    And Navigate to MMT Web Page
    When Login Popup is Present

  Scenario: Verify that on Login popup Mobile No. input Box is present
    Then Verify Mobile Number Input box is Present
    #And Close the Browser

  Scenario: Verify that on Login popup ContinueButton  is present
    Then Verify Continue button is Present
    #And Close the Browser
