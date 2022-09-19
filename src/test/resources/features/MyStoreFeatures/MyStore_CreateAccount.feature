Feature: My Store - Create Account

  Scenario: My Store - Create Account - Open sign in page via Sign in button
    Given go to the My store
    When click sign in button
    Then submit/create account button is displayed

  Scenario: My Store - Create Account - Create account with empty email address
    Given open My Store sign in page
    When create account error is not displayed
    And click create an account button
    Then create account error is displayed
    And error says that email is invalid

  Scenario: My Store - Create Account - Create account with empty incorrect email address
    Given open My Store sign in page
    When create account error is not displayed
    And enter email address "test"
    And click create an account button
    Then create account error is displayed
    And error says that email is invalid

  Scenario: My Store - Create Account - Create account with existed email address
    Given open My Store sign in page
    When create account error is not displayed
    And enter email address "test@test.test"
    And click create an account button
    Then create account error is displayed
    And error says that email exists