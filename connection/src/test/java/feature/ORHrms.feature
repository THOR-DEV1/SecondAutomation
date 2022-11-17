
Feature: Test Login Page - Orange HRMS
  Scenario Outline: Test Login Page - Orange HRMS
    Given Launch browser
    When Enter <username>
    And Enter <password>
    And click on login button
    Then verify the login <status>

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
