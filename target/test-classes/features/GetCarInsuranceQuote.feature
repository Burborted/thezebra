@Get-Car-Insurance-Quote
Feature: Acceptance to validate Get Car Insurance Quote process.
  In order to validate that all pages are working correct we
  will do the acceptance testing

  @Get-Car-Insurance-Quote-Positive
  Scenario: Open thezebra page
    Given I am on the Home Page of The Zebra website
    When I click on Car Insurance button
    And I should see a ZIP code request page
    And I fill in the Start Page form
    And I fill in the Vehicle form
    And I fill in the Vehicle Two form
    And I fill in th Drivers Page One form
    And I fill the Drivers Page two form
    And I choose the basic insurance quote
    Then I wait for all quotes to be present