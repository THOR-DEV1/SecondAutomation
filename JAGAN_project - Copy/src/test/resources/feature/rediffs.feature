Feature: I want to Validate to  reddif create account functionality

  Scenario: validate reddif create account functionality
    Given Open chrome and Navigate url
    When Click on Create Account
    And find Total link in Create account page
    When Click on Terms and Conditions
    And Get the title of the child window
    Then Close the Browser
