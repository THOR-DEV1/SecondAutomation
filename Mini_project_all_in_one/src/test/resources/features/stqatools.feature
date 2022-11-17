Feature: Register the user to the website using JavaScript Executor

  Scenario Outline: Filling User Register form
    Given launch browser and Navigate to Url
    When Click on Basic Alert
    And Close Alert
    When Navigate to Url2
    And Fill the Name as <name>
    When Fill the Father Name as <father>
    And Fill the Postal Address as <postal>
    When Fill the Personal Address as <personal>
    And Select proper gender
    When Select any City
    And Select any Course
    When Select any District
    And Select any State
    When Fill the pin code as <pincode>
    And Fill the Email Id as <email>
    When Scroll to bottom
    And Click on reset
    And Verify if Data is reset or not
    Then close Browser

    Examples: 
      | name          || father        || postal        || personal      || pincode       || email         |
      | Amol          || Raj           || Mumbai        || Mumbai        ||        411009 || abc@gmail.com |
      
      
      
      
      
      
      
      
      
      
