@Login
Feature: Login feature

  @LoginHappyPath
  Scenario: Login with valid credentials
    Given I open application url
    And I navigate to login page
    When I enter 'Test1sdjnsw001@test.com' and 'test1234'
    And I click on login button
    Then Login should be successful

  @LoginUnHappyPath
  Scenario Outline: Login with invalid credentials
    Given I open application url
    And I navigate to login page
    When I enter '<email>' and '<password>'
    Then I should get '<error-message>'
    Examples:
      | email | password | error-message |
      |       |          |               |
      |       |          |               |