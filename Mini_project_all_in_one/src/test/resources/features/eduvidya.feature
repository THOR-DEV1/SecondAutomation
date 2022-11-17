Feature: Search For Colleges

  Scenario: Find college details in Eduvidya application
    Given open browser and navigate to url
    When Click on college
    And Select course
    When Select city
    And click on search
    And Verify search result is displayed
    Then Close Browser
