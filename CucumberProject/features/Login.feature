@FaceBook
Feature: Login Feature
  I want to test Login Feature of facebook application

  @Login
  Scenario: Login scenario
    Given I am user of a facebook application
    When I enter valid user name
    And I enter valid password
    And I click on login button
    Then user should be able to login successfully
    Then Close the driver
    
  @SignUp
  Scenario Outline: SignUp Scenario
    Given I am user of a facebook application
    When I enter valid <UserName>
    And I enter valid password

    Examples: 
      | LastName |
      
      | Krishna  |
