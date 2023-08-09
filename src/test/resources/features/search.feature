Feature: Search Functionality for E-commerce Website

  As a user of the website
  I want to be able to search for products
  so that I can add them to cart and purchase.

  Scenario: Successful search for text
    Given I am on the home page
    And I enter "phone" in the search field
    When I click on the search button
    Then I should see search results