Feature: Search functionality

  Scenario Outline: Search a product
    Given I want to search a product on Amazon
    When Search for <Product>
    And Click on Search
    Then Take Screenshot of Productname and Productprice

    Examples: 
      | Product          |
      | iphone13 pro max |
      | samsung m32      |
      | oppo reno8       |
