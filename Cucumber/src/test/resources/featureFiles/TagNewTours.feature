Feature: Tag functionality

Background: To test New Tours Login functionality
Given Open the chrome browser
When enter username and password
And click on the sign on button
Then user loged in successfully


@Register
Scenario: User registration
When user click on Register 
And fill all the information
Then user close the browser

@Flight
Scenario: user flight details
When user click on Flights
And fill all details 
Then user close the browser


 
