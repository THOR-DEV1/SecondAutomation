Feature: Test login page of demo website

  Scenario Outline: Test login functionality
    Given open browser and navigate the url
    When enter <username> and <password>
    And Click on Login button
    Then user should login and close browser

    Examples: 
      | username |  | password |
      | test     |  | test     |
