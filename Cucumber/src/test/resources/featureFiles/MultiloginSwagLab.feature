Feature: 
         Validate the multiple user input for login of swaglab website
         
         Scenario: 
         Validate the multiple dataset login functionality for swaglab website
         
         Given Open the chrome browser
         When Open the swaglab website with valid url "https://www.saucedemo.com/"
         And enter the username <uname> enter the password <pass>
         And click on the login button for validation
         Then user close the swaglab browser
         
         Examples:

         |uname|            |pass|
         |standard_user|  |secret_sauce|
         |problem_user|   |secret_sauce|
         |error_user|     |secret_sauce|