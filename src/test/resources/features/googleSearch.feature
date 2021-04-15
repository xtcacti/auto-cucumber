@googleSearch
  Feature: googleSearch
    Scenario: googleSearch
      Given browser is open
      And user is on google search page
      When user enters a text in search box
      And hits enter
      Then user is navidated to the search results