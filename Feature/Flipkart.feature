@tag
Feature: To check the Flipkart page functionality

  @tag1
  Scenario Outline: Flipkart functionality
    Given User is on the Flipkart page and moves the cursor towards Tvs & Appliances
    When User moves the cursor towards <products> and clicks <products>
      | "<products>" |
    Then User closes the Flipkart page

    Examples: 
      | products           |
      | Washine Machine    |
      | Refrigerators      |
      | Kitchen Appliances |
