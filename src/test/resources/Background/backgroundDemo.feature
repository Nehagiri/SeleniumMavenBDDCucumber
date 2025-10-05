Feature: This is background demo

  Background: User is logged in to saucedemo app
    Given User login the saucedemo app
    When User enters valid usrnm and pwd
    Then User should be able to navigate to home page


  Scenario: Test Menu items
    And Click on breadcrumb icon
    Then User should be able to see the menu items

  Scenario: Verify add to cart functionality
    And Click on Add to cart button
    Then Item shouldbe added to the cart



