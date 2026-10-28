Feature: 
      validate the login of swaglab website

  Scenario: validate the login functionality
  
    Given user should be open browser
    When open the swaglab website "https://www.saucedemo.com/"
    And enter the username "standard_user" enter the password "secret_sauce"
    And click on the login button
    Then verify the title of swaglab website 
    And close the browser