@Verify-Homepage
Feature: Acceptance to validate all relevant
  and important elements of thezebra Homepage are present.
  In order to validate that all pages are working correct we
  will do the acceptance testing

  @Verify-Homepage-Positive
  Scenario: Open thezebra Homepage
    Given I am on the Home Page of The Zebra website
    When I scrolldown the Home Page
    Then All important elements are present