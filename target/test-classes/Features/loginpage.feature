Feature: Login page

  Background: 
    Given i am on login page
   

  Scenario Outline: 
    login with invalid credentials

    Given i am on login page
    When user enters "<username>" and "<password>"
    And click on login button
    Then user redirects to Home page

    Examples: 
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass4    |
      | user4    | pass4    |
