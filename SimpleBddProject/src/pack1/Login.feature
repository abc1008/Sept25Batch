Feature: Login feature

  Scenario: Perform login with valid credentials
    Given I have launched the browser
    And hit the url
    When I enter valid credentials
    And hit login button
    Then I should be logged in successfully