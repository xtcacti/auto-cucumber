# Author
# Data
# Description
@smokeScenario
Feature: feature to test login functionality

  @smokeTest-pom
  Scenario: check login is successful with valid credentials
    Given POM - browser is open
    Given POM - user is on login page
    When POM - user enters username and 12345
    And POM - clicks on login button
    Then POM - user is navigated to the homw page