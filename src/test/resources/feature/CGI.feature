@smoke
Feature: Searching CGI Functionality
  User Story:
  As a user, I should be able to search on the main page


  Scenario: User should be able to search the main page
    When user enters the main page
    And user scroll down
    And user clicks Kontakt button
    Then user should see the main page
