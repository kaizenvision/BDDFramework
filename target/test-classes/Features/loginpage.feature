Feature: Login page

  Background: 
    Given i am on login page
    | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login |
    |  google |
    | amazone |

  Scenario Outline: 
    login with invalid credentials

    Given i am on login page
    When user enters "<username>" and "<password>" and <price>
    And click on login button
    Then user redirects to Home page

    Examples: 
      | username | password | phone |
      | user1    | pass1    | 12   |
      | user2    | pass2    | 25.5 |
      | user3    | pass4    |
      | user4    | pass4    |
