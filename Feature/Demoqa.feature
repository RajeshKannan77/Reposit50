@tag
Feature: To check the Demoqa page Registration functionality

  @tag1
  Scenario Outline: Demoqa Registration
    Given User is on the Demoqa page
    When User selects five countries <country>
      | "Albania"   |
      | "Algeria"   |
      | "Australia" |
      | "Brazil"    |
      | "India"     |
    Then User clicks submit button

    Examples: 
      | country     |
      | "Albania"   |
      | "Algeria"   |
      | "Australia" |
      | "Brazil"    |
      | "India"     |
