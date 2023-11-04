Feature: 

  Background: 
    Given I am on registration page

  Scenario: Add different users
    Given I am on registration page
    When i click on signup
    When I entered user details
      | firstname | lastname | phone     | city     | email            |
      | abc       | xyz      |     15345 | pune     | abc@mail.com     |
      | ghg       | gh       | 15345 546 | Kolhapur | gdf@mail.com     |
      | yui       | xyz      |  15345678 | Mumbai   | abc123@mail.com  |
      | jkh       | xyz      |  15345789 | pune     | abc6897@mail.com |
    Then i got the message
