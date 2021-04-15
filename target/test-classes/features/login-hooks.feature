# Author
# Data
# Description
@smokeScenario
Feature: feature to test login functionality

  @smokeTest-hooks
  Scenario: check login is successful with valid credentials
    Given Hooks -user is on login page
    When Hooks -user enters username and 12345
    And Hooks -clicks on login button
    Then Hooks -user is navigated to the homw page
