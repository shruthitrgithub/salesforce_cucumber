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
    
    
  @SFDCLogin @TC04a
  Scenario: Forgot Password 4
    Given User launches Sales Force
    When User click forgot password link
    Then Forgot password page is displayed
    And User provides username on forgot password page
    And User clicks on continue button on forgot password page
    Then Password reset message is diaplayed 
    
     @SFDCLogin @TC04b
  	Scenario: Forgot PAssword 4
    Given User launches Sales Force
    When User enters wrong UserName
    And Enters Wrong PassWord
    And User clicks on Log in
    Then Contact message should be displayed
   
    @SFDCLogin @TC05
  	Scenario: Login to SalesForce 5
    Given User launches Sales Force
    When User inputs valid username
    And User inputs valid password 
    And User clicks on Log in    
    And check for the user menu drop down
    Then Verify User menu drop down values
  	
    @SFDCLogin @TC06
  	Scenario: Login to SalesForce 6
    Given User launches Sales Force
    When User inputs valid username
    And User inputs valid password 
    And User clicks on Log in    
    And check for the user menu drop down
    When User clicks My Profile dropdown
    And User clicks Edit Profile
    And User inputs last name 
    And User clicks on Save All button
    When User clicks on Post and enter text
    And User clicks on Share button
    When User clicks on File link
    And User clicks on Upload a file from your computer
    And User clicks on Choose File
        
    @SFDCLogin @TC07
  	Scenario: Login to SalesForce 6
    Given User launches Sales Force
    When User inputs valid username
    And User inputs valid password 
    And User clicks on Log in    
    And check for the user menu drop down
    When User clicks My Settings dropdown
		And User clicks on personal link
		And User clicks on Login History Link
		And User clicks on Download login history link
		And User clicks on Display and Layout link
		And User selects Customize My tabs link
		And User selects Salesforce Chatter
		And User selects Reports tab from available tabs
		And User clisk on Add button
		And User clicks on Email Set up tab
		And User clicks on my email settings tab
		And User inputs email name
		And User inputs email address
		And User select automatic bcc
		And User clicks on save button 
		And User clicks on Calendar and Reminders tab
		And User clicks on Activity Reminders tab
		And User clicks on open test reminder button		
		
		 @SFDCLogin @TC08
		 Scenario: Login to SalesForce 8
    Given User launches Sales Force
    When User inputs valid username
    And User inputs valid password 
    And User clicks on Log in  
    And user Clicks for the user menu drop down
    When User clicks on DeveloperConsoleLink dropdown

    @SFDCLogin @TC09
		  Scenario: Login to SalesForce 9
    Given User launches Sales Force
    When User inputs valid username
    And User inputs valid password 
    And User clicks on Log in  
    And user Clicks for the user menu drop down
    And user Clicks on Logout Option
    
      @SFDCLogin @TC10
		  Scenario: Create Account 10
    Given User launches Sales Force
    When User inputs valid username
    And User inputs valid password 
    And User clicks on Log in  
    And user Cliks on AccountLink
    Then Account Page Should Be displayed
    And User Cliks On New Account
    Then New Account Page Should Be displayed
		 
		 
      @SFDCLogin @TC11
	  Scenario: Create New View 11
    Given User launches Sales Force
    When User inputs valid username
    And User inputs valid password 
    And User clicks on Log in  
    And user Cliks on AccountLink
		And Create New View
