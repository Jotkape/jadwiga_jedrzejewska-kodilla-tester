Feature: Cash Withdrawal
  Scenario: Successfull withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario: Withdrawal of the exact amount of wallet balance
    Given I have deposited $50 in my wallet
    When I request $50
    Then $50 should be dispensed
    And the balance of my wallet should be $0

  Scenario: Withdrawal more than available balance
    Given I have deposited $50 in my wallet
    When I request $100
    Then $0 should be dispensed
    And the balance of my wallet should be $50

  Scenario: Withdrawal of zero dollars
    Given I have deposited $100 in my wallet
    When I request $0
    Then $0 should be dispensed
    And the balance of my wallet should be $100

  Scenario: Negative withdrawal request
    Given I have deposited $100 in my wallet
    When I request $-30
    Then $0 should be dispensed
    And the balance of my wallet should be $100

  Scenario: Multiple withdrawals
    Given I have deposited $300 in my wallet
    When I request $100
    And I request $50
    Then $50 should be dispensed
    And the balance of my wallet should be $150