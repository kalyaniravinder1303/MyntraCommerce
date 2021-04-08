Feature: Checkout Process

  Scenario: Summary Process
    Given i am on the summary page
    When i provide Login credentials
    Then i should be directed to Address page
    And i should be directed to Shipping page
    And Payment process should be done

