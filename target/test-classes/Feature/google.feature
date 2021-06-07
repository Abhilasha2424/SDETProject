Feature: Google feature

  @Regression
  Scenario: search JAVA on google
    Given User is on google homepage
    When User search with "java" keyword
    Then User should display with java results
  
