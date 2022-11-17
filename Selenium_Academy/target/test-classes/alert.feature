Feature: To verify selenium academy page

  Scenario: To handle and click different alerts
    Given open web application
    When click on alert box
    And validate message and click ok
    When click on first tryit button
    And validate message and click cancel
    Then close the browser
