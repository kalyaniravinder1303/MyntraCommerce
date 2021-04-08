Feature: HomePage Feature

  Scenario Outline:Search products on homepage
    Given i am on the Homepage
    Then search for "<searchValue>" in the searchbox
    Then i should get the products related to "<searchValue>"
    Examples:
    |searchValue|
    |Summer Dresses|
