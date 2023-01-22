@Registration
Feature: Registration

  @RegistrationHappyPath
  Scenario: Register new user
    Given I open application url
    And I navigate to register page
    When I fill registration form
      | FirstName | LastName | Email                   | Password | ConfirmPassword |
      | Test      | Test     | Test1sdjnsw007@test.com | test1234 | test1234        |
    And I click on register button
    Then The Message "Your registration completed 1" should be displayed

  @RegistrationHappyPath
  Scenario: Register new user
    Given I open application url
    And I navigate to register page
    When I fill registration form
      | FirstName | LastName | Email                   | Password | ConfirmPassword |
      | Test      | Test     | Test1sdjnsw0089@test.com | test1234 | test1234        |
    And I click on register button
    Then The Message "Your registration completed" should be displayed


#      When I fill registration form
#      | FirstName |  |
#      | LastName  |  |
#      | Email     |  |
#      | Password  |  |