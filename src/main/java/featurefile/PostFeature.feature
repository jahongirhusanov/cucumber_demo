@tagtest
Feature: Post feature of Facebook

  Background: Common steps
    Given User should be logged in
    And should be present at its own wall

  Scenario: Post a text on user wall
    When I type the text as "a sample test" in the test box
    And Click on Post button
    Then The message should be get posted

  Scenario: Post a video on user wall
    When User supply the Youtube link as "" in the text box
    And Click on Post button
    Then Video should be get posted on the user wall
    And the video should be proper Thumnail




