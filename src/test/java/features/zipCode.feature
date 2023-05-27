Feature: Testing Zip Code feature

  Background: Checkout Your Information
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    When user in on homepage
    Then user click add to cart an item
    And user click the shopping cart icon
    And user click on checkout

  Scenario: Submit valid zipcode
    Given user is on checkout your information page
    And user input firstName with "Daffa Fawwaz"
    And user input lastName with "Maulana"
    And user input zipcode with "17090"
    And user click on continue
    Then user will be redirect to checkout overview page
    And user click on finish
    Then user in on success order page

  Scenario: Submit invalid zipcode
    Given user is on checkout your information page
    And user input firstName with "Daffa Fawwaz"
    And user input lastName with "Maulana"
    And user input zipcode with "170901"
    And user click on continue
    Then user get an error message "Invalid Zipcode"