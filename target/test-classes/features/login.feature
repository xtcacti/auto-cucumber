# Author
# Data
# Description
@smokeScenario
Feature: feature to test login functionality

  @smokeTest
  Scenario: check login is successflu with valid credentials
    Given browser is open pom
    Given user is on login page pom
    When pom: user enters username and password
    And clicks on login button pom
    Then user is navidated to the homw page pom

  Scenario Outline: check login is successflu with valid credentials
    Given user is on login page
    When user enters '<username>' and '<password>'
    And clicks on login button
    Then user is navidated to the homw page

    Examples:
      | usename | passowrd |
      | user1   | pass1    |
      | user2   | pass2    |
