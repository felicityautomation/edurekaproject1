#Author: your.email@your.domain.com
@tag
Feature: Test case of Login Feature

  @tag2
  Scenario Outline: Test valid login of DemoBlaze application
    Given user opens the browser
    When navigate to DemoBalze application
    And login with user '<username>' and password '<password>'
    Then verify home page is displayed
    And close the browser

    Examples: 
      | username    | password |
      | bharathedu1 |   123456 |
      | user2       | Welcome123 |
