Feature: Search mobiles under 10000 in Amazon and verify

  Scenario: Search mobiles under 10000
    Given Open Browser and navigate URL
    When Search mobiles and select Under 15000
    And Verify Search result
    When In filter Select Select price range 10000
    And Select newest first
    When Display price and name for five mobiles
    And Validate price less than 30k
    Then Close the Browser
