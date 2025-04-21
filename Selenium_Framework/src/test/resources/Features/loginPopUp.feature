Feature: Test For MMT Flights

  #Scenario: Open MMT web Page and Check for Login Pop-Up
   # Given Open Chrome browser
    #When Navigate to MMT Web Page
    #And Check the login Popup
    #Then Close Login PopUp and look for Flights

  Scenario: Get the Class of each menu Item
    Given Open Chrome browser
    When Navigate to MMT Web Page
    And Check the login Popup
    And Close Login PopUp and look for Flights
		Then Get Class of Menu Items 
		
		
		
		
  #Scenario Outline: Enter Phone no. to login
   # Given Open Chrome browser
    #When Navigate to MMT Web Page
    #And Check the login Popup
    #Then Enter the <PhoneNum>

    #Examples: 
     # | PhoneNum   |
      #|      12345 |
      #| 9123456789 |
