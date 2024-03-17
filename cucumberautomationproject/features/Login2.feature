#Author: your.email@your.domain.com
@tag
Feature: Test case of Login Feature

  Background: 
    Given user opens the browser
    When navigate to DemoBalze application

  @tag1
  Scenario: Test valid login of DemoBlaze application
    And login with user 'bharathedu1' and password '123456'
    Then verify home page is displayed
    And close the browser

  @tag1
  Scenario: To verify that the user redirects to the sign up page
    And clicks on Sign Up link
    Then Sign up popup should be displayed
    And close the browser
