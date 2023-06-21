#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: SFDC Login
  This feature file contains scenarios for SFDC Login

  @SFDCLogin @TC01
  Scenario: TC 01 Login Error Message 1
    Given User launches Sales Force
    When User inputs valid username
    And User inputs empty password 
    And User clicks on Log in 
    Then Verify login error is displayed

  @SFDCLogin @TC02
  Scenario: Login to SalesForce 2
    Given User launches Sales Force
    When User inputs valid username
    And User inputs valid password 
    And User clicks on Log in 
    Then Verify home page is displayed

  @SFDCLogin @TC03
  Scenario: Check RemeberMe 3
    Given User launches Sales Force
    When User inputs valid username
    And User inputs valid password 
    And User checks Remember me
    And User clicks on Log in 
    Then Verify home page is displayed    
    When User clicks log out
    Then Verify Username is retained