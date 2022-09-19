Feature: My Store - Create Account

  Scenario: My Store - Create Account - Open sign in page via Sign in button
    Given go to the My store
    When click sign in button
    Then submit/create account button is displayed

  Scenario: My Store - Create Account - Create account with empty email address
    Given open My Store sign in page
    When click create an account button
    Then create account error is displayed

  Scenario: My Store - Create Account - Create account with empty incorrect email address
    Given open My Store sign in page
    When enter email address "test"
    And click create an account button
    Then create account error is displayed