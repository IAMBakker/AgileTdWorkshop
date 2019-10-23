Feature: As a user I want to login to MyAccount

  Scenario: The user logs into his MyAccount
    Given   The user is on the homepage
    When    The user logs into his MyAccount
    Then    The user should be taken to his Account page

  Scenario: The user logs into his MyAccount with credentials
    Given   The user is on the homepage
    When    The user logs into his MyAccount with "test@tester.com" and "1qazxsw2" as credentials
    Then    The user should be taken to his Account page