@tag
Feature: Login Functionality of Tricentis

  @tag1
  Scenario Outline: To Test the Login Functionality of Tricentis
    Given I am on the after login home page
    When I click on the login link
    And I will enter the "amulya@gmail.com" in Email tab
    And I will enter the "amulya" in Password tab
    And I will click on the Login button
    Then It should get login and show "success"