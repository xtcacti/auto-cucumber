# Author
# Data
# Description
@smokeScenario
Feature: feature to test login functionality

  @smokeTest-pf
  Scenario: check login is successful with valid credentials
    Given PF - browser is open
    Given PF - user is on login page
    When PF - user enters username and 12345
    And PF - clicks on login button
    Then PF - user is navigated to the homw page
