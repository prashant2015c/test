@Amazone1
Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given go to the amzone link

  Scenario Outline: Title of your scenario
    When click on login button
    Then login page get displayed
    When submitting "<loginid>" and "<password>"
    Then main page get displayed
    And go to department
    When click on Amazone video
    Then open video page
    And check more outcomes

    @Logid
    Examples: 
      | loginid                   | password |
      | prashant2015ccc@gmail.com |   pppp |
