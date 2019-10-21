Feature: Free Facebook login feature
@test
  Scenario: Free facebook login test scenario
    Given user is already on login page
    When title of login page is facebook
    Then user enters username and password
    Then user clicks on login button