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
		Then Account Page Should Be displayed
		And User Clicks on new View Link
		Then Newly added Link should be displayed
		
		 @SFDCLogin @TC12
		 Scenario: Edit View 12
    Given User launches Sales Force
    When User inputs valid username
    And User inputs valid password 
    And User clicks on Log in  
    And user Cliks on AccountLink
  	Then Account Page Should Be displayed
		And Click Edit View
		Then Edit View Page Should be Displayed
		
		 @SFDCLogin @TC13
		 Scenario: Merge Accounts 13
		  Given User launches Sales Force
    When User inputs valid username
    And User inputs valid password 
    And User clicks on Log in  
    And user Cliks on AccountLink
  	Then Account Page Should Be displayed
  	And user Cliks on MergeAccount 
  	And User clicks on textBox
  	And User Clicks FindAccount
  	Then Clicks on Nextbutton
  	
  	
		 @SFDCLogin @TC14
		 Scenario: Create Account Report 14
		 Given User launches Sales Force
    When User inputs valid username
    And User inputs valid password 
    And User clicks on Log in  
    And user Cliks on AccountLink
  	Then Account Page Should Be displayed
  	And User Selects Account Activity
		 And User Selects Date field
		 And User Clicks on fromDate
		 And User Clicks on toToday
		 Then User Clicks on Save Unsaved Report
		 And User Enters ReportName
		 And User Enters UniqueReportName 
		 Then User Clicks on Save Report
		 
		  @SFDCLogin @TC15
		 Scenario: opportunities drop down 15
	  Given User launches Sales Force
    When User inputs valid username
    And User inputs valid password 
    And User clicks on Log in  
    And User clicks oppurtunity Tab
    Then Clicks on View DropDown
    And User clicks on NewButton
		 
		  @SFDCLogin @TC16
		 Scenario: Create a new Opty 16
	  Given User launches Sales Force
    When User inputs valid username
    And User inputs valid password 
    And User clicks on Log in  
    And User clicks oppurtunity Tab
		Then Clicks on New button
	
		 
		  @SFDCLogin @TC17
		 Scenario: Opportunity Pipeline Report 17
		 Given User launches Sales Force
    When User inputs valid username
    And User inputs valid password 
    And User clicks on Log in  
    And User clicks oppurtunity Tab
		Then Clicks on New button
		And Clicks on Oppurtunity Pipeline
		
		 @SFDCLogin @TC18
		 Scenario: TestTest Stuck Opportunities Report 18
		 Given User launches Sales Force
    When User inputs valid username
    And User inputs valid password 
    And User clicks on Log in  
    And User clicks oppurtunity Tab
		Then Clicks on New button
		And Clicks on Oppurtunity Pipeline
		And Clicks on Stuck Opportunities 
		  
		 @SFDCLogin @TC20
		 Scenario: Leads Select View 20
	 	 Given User launches Sales Force
     When User inputs valid username
     And User inputs valid password 
     And User clicks on Log in  
     And User clicks on Lead Tab
		 
		  @SFDCLogin @TC21
		  Scenario: leadsSelectView 21
		 Given User launches Sales Force 
     When User inputs valid username
     And User inputs valid password 
     And User clicks on Log in  
     And User clicks on Lead Tab
		 And Clicks on Lead Page DropDown
		 
		  @SFDCLogin @TC22
		 Scenario: defaultView 22
		 Given User launches Sales Force 
     When User inputs valid username
     And User inputs valid password 
     And User clicks on Log in  
     And User clicks on Lead Tab
     And Clicks on Lead Page DropDown
     And Clicks the View DropDown List
     And Selects User Menu
     When User clicks log out
     And Launches Sales Force
     When User inputs valid username
     And User inputs valid password 
     And User clicks on Log in  
     And User clicks on Lead Tab
     And User clicks on GO button
     
       @SFDCLogin @TC23
      Scenario: List item Todays Leads work 23
     Given User launches Sales Force 
     When User inputs valid username
     And User inputs valid password 
     And User clicks on Log in  
     And User clicks on Lead Tab
     Then Todays Lead Page Should Be Displayed
     
        @SFDCLogin @TC24
     Scenario: Check New button on Leads Home 24
     Given User launches Sales Force 
     When User inputs valid username
     And User inputs valid password 
     And User clicks on Log in  
     And User clicks on Lead Tab
     And User Clicks on NewButton
     Then Clicks on LastName
     And Enters LastName
     And Clicks on CompanyName
     Then Enters CompanyName
     
        @SFDCLogin @TC25
     Scenario: Create new contact 25
     Given User launches Sales Force 
     When User inputs valid username
     And User inputs valid password 
     And User clicks on Log in  
     When User clicks on contact tab
     And User Clicks on NewButton
     And Enters LastName on New Contact
     And Enters AccountName
     Then Clicks on Save
		 
		  @SFDCLogin @TC26
		 Scenario: Create new view in the Contact Page
		 Given User launches Sales Force 
     When User inputs valid username
     And User inputs valid password 
     And User clicks on Log in 
     When User clicks on contact tab
     And User Clicks on NewView 
     And User Enters on ViewName
     And User Clicks on ViewUniqueName
     And Enters UniqueName
     And Clicks on SaveElement
		 
		  
		  @SFDCLogin @TC27
		 Scenario: Create new view in the Contact Page
		 Given User launches Sales Force 
     When User inputs valid username
     And User inputs valid password 
     And User clicks on Log in 
    When User clicks on contact tab
     And Selects Recent Contact DropDown
		 
		  @SFDCLogin @TC28
		 Scenario: Check Mycontacts view in the Contact Page
	  Given User launches Sales Force 
    When User inputs valid username
    And User inputs valid password 
    And User clicks on Log in 
	  When User clicks on contact tab
	  Then Selects view DropDown
	  And Selects Dropdown
	  
	   @SFDCLogin @TC29
	   Scenario: View a contact in the contact Page
		 Given User launches Sales Force 
     When User inputs valid username
     And User inputs valid password 
     And User clicks on Log in 
	   When User clicks on contact tab
	   
	   @SFDCLogin @TC30
	   Scenario: Error Message Check
	    Given User launches Sales Force 
     When User inputs valid username
     And User inputs valid password 
     And User clicks on Log in 
     When User clicks on contact tab
     And Create New View hyperLink
     And User Clicks on ViewUniqueName
     And Enters UniqueName
     And Clicks on SaveElement
		 
  @SFDCLogin @TC31
		  Scenario: Error Message Check
	    Given User launches Sales Force 
     When User inputs valid username
     And User inputs valid password 
     And User clicks on Log in 
     When User clicks on contact tab
     And Create New View hyperLink
     And User Clicks on ViewUniqueName
     And Enters UniqueName
     And Clicks on Cancel
		  
		   @SFDCLogin @TC32
		  Scenario: Check Save and new button
	    Given User launches Sales Force 
     When User inputs valid username
     And User inputs valid password 
     And User clicks on Log in 
     When User clicks on contact tab 
		  And User Clicks on NewButton
		  And Enters LastName on New Contact
		   And Enters AccountName
		 Then Clicks on saveandNew button
		 
		 	   @SFDCLogin @TC33
	 Scenario: Verify if the firstname and lastname of the loggedin user is displayed
	    Given User launches Sales Force 
	   When User inputs valid username
     And User inputs valid password 
     And User clicks on Log in 
     And Clicks on HomeTab
     And Clicks on First and LastName LInk
     Then First and LastName Link Page is Displayed
		 
		    @SFDCLogin @TC34
	 Scenario: Verify the edited lastname is updated at various places 
		  Given User launches Sales Force 
	   When User inputs valid username
     And User inputs valid password 
     And User clicks on Log in 
		 And Clicks on First and LastName LInk
		 Then clicks on Edit Profile
		 And Clicks on about Tab
		And User inputs last name
		And Edits LastName
	  And Clicks on save
		
		 
		 
