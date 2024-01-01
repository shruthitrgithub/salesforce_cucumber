package com.automation.stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import com.automation.pages.AccountsPage;
import com.automation.pages.BasePage;
import com.automation.pages.HomePage;
import com.automation.pages.LeadsPage;
import com.automation.pages.LoginPage;
import com.automation.pages.MySettingsPage;
import com.automation.pages.OpportunitiesPage;
import com.automation.pages.ContactPage;
import com.automation.utility.PropertiesUtility;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class SFDCStepDefinitions  {
	
	LoginPage loginpage = new LoginPage();
	HomePage homepage = new HomePage();
	BasePage basePage= new BasePage();
	MySettingsPage mysettings = new MySettingsPage();		
	AccountsPage accountsPage = new AccountsPage();
	LeadsPage leadsPage = new LeadsPage();

	ContactPage ContactPage = new ContactPage();

	OpportunitiesPage opportunitiesPage = new OpportunitiesPage();
	PropertiesUtility pro=new PropertiesUtility();
	Properties appProp= pro.loadFile("applicationDataProperties");

	String validUserId=appProp.getProperty("login.valid.userid");
	String validPassword=appProp.getProperty("login.valid.password");	
	String invalidUserId=appProp.getProperty("login.invalid.userid");
	String invalidPassword=appProp.getProperty("login.invalid.password");	

	
	
	@Given("User launches Sales Force")
	public void user_launches_sales_force() {
		loginpage.launchSalesForce();
	}

	@When("User inputs valid username")
	public void user_inputs_valid_username() {
		loginpage.enterUsername(validUserId);
	}

	@And("User inputs empty password")
	public void user_inputs_empty_password() {
		loginpage.enterPassword("");
	}

	@And("User clicks on Log in")
	public void user_clicks_login() {
		loginpage.clickButton();
	}    

	@Then("Verify login error is displayed")
	public void verify_login_error() throws InterruptedException {
		loginpage.loginErrorDisplayed();
	}

	@And("User inputs valid password")
	public void user_inputs_valid_password()  {
		loginpage.enterPassword(validPassword);
	}

	@Then("Verify home page is displayed")
	public void verify_home_page_displayed()  {
		loginpage.verify_home_page();
	}

	@And("User checks Remember me")
	public void user_checks_remember_me()  {
		loginpage.select_Rememberme();
	}

	@When("User clicks log out")
	public void user_clicks_logout()  {
		homepage.click_logout();
	}

	@Then("Verify Username is retained")
	public void user_username_retained()  {
		loginpage.verify_username_retained();
	}

	@When("User click forgot password link")
	public void User_click_forgot_password_link()  {
		loginpage.click_forgot_password();
	}


	@Then("Forgot password page is displayed")
	public void forgot_password_page_displayed()  {

	}

	@And("User provides username on forgot password page")
	public void user_provides_username_on_forgotPasswordPage()  {
		loginpage.enter_forgotPassword_Username("shruthi@teckarch.com");

	}

	@And("User clicks on continue button on forgot password page")
	public void User_click_continue_button()  {
		loginpage.click_forgotPassword_continue();
	}

	@Then("Password reset message is diaplayed")
	public void Password_reset_message_is_diaplayed()  {
		loginpage.verify_forgotPassword_confirmation_message();
	}

	////////////////////////////////////////////////////	

	@When("User enters wrong UserName")
	public void user_enters_wrong_UserName() {
		loginpage.enterUsername("123");
	}

	@And("Enters Wrong PassWord")
	public void userInputsInvalidPassword()  {
		loginpage.enterPassword("22133");
	}

	@Then("Contact message should be displayed")
	public void contact_message_displayed()  {
		loginpage.verify_contact_admin_message();   
	}     

	@And("check for the user menu drop down")
	public void check_for_user_menu_dropDown()  {
		homepage.click_userMenuDropDown();
	}     

	@Then("Verify User menu drop down values")
	public void verify_userMenu_dropDown_values()  {
		homepage.verify_myProfile();
		homepage.verify_mySetting();
		homepage.verify_developerconsole();
		homepage.verify_switchtoLight();
		homepage.verify_logout();
	}     


	@When("User clicks My Profile dropdown")
	public void user_clicks_MyProfile_dropdown ()  {
		homepage.click_myProfile();
	}

	@And("User clicks Edit Profile")
	public void user_clicks_EditProfile ()  {
		homepage.click_Editprofile();
	}

	@And("User inputs last name")
	public void user_inputs_last_name () throws InterruptedException  {
		homepage.enter_LastName("Ramachandra");
	}

	@And("User clicks on Save All button")
	public void user_clicks_SaveAll_button()  {
		homepage.click_saveAll();
	}

	@When("User clicks on Post and enter text")
	public void user_clicks_Post_and_enter_text() throws InterruptedException  {
		Thread.sleep(3000);
		homepage.click_Post_link();
		homepage.input_Post_textBox("Test Comment");
	}

	@And("User clicks on Share button")
	public void user_clicks_on_Share_button()  {
		homepage.click_Share_post_button();
	}

	@When("User clicks on File link")
	public void user_clicks_on_File_link()  {
		homepage.click_File_link();
	}

	@And("User clicks on Upload a file from your computer")
	public void user_clicks_Upload_file_from_your_computer()  {
		homepage.click_upload_From_Computer();
	}

	@And("User clicks on Choose File")
	public void user_clicks_Choose_File()  {
		homepage.choose_File_button();
	}

	@When("User clicks My Settings dropdown")
	public void user_clicks_My_Settings_dropdown()  {
		homepage.click_mySetting();
	}

	@And("User clicks on personal link")
	public void user_clicks_on_personal_link()  {
		mysettings.click_PersonalInfo_tab();
	}

	@And("User clicks on Login History Link")
	public void user_clicks_Login_History_Link()  {
		mysettings.click_LoginHistory_tab();
	}

	@And("User clicks on Download login history link")
	public void user_clicks_Download_login_history_link()  {
		mysettings.click_Download_Login_History();
	}


	@And("User clicks on Display and Layout link")
	public void user_clicks_on_Display_and_Layout_link()  {
		mysettings.click_DisplayAndLayout_tab();
	}

	@And("User selects Customize My tabs link")
	public void user_selects_Customize_My_tabs_link()  {
		mysettings.click_CustomizeTabs_tab();
	}

	@And("User selects Salesforce Chatter")
	public void user_selects_Salesforce_Chatter()  {
		mysettings.select_customApp_dropDown_item("Salesforce Chatter");
	}

	@And("User selects Reports tab from available tabs")
	public void User_selects_Reports_tab_available_tabs()  {
		mysettings.select_AvailableTabs_item("Reports");
	}

	@And("User clisk on Add button")
	public void user_clisk_on_Add_button()  {
		mysettings.click_add_available_tabs();
		mysettings.click_save_button();	
	}

	@And("User clicks on Email Set up tab")
	public void user_clicks_Email_SetUp_tab()  {
		mysettings.click_EmailSetup_tab();
	}

	@And("User clicks on my email settings tab")
	public void user_clicks_myEmailSettings_tab()  {
		mysettings.click_My_Email_Settings_tab();
	}


	@And("User inputs email name")
	public void user_inputs_email_name()  {
		mysettings.input_Email_Name("Shruthi Dixit");
	}

	@And("User inputs email address")
	public void user_inputs_email_address()  {
		mysettings.input_Email_Address("shruthi.344@gmail.com");
	}

	@And("User select automatic bcc")
	public void user_select_automatic_bcc()  {
		mysettings.select_Automatic_Bcc();
	}

	@And("User clicks on save button")
	public void user_clicks_on_save_button()  {
		mysettings.click_save_button();
	}

	@And("User clicks on Calendar and Reminders tab")
	public void user_clicks_Calendar_and_Reminders_tab()  {
		mysettings.click_CalendarAndReminders_tab();
	}

	@And("User clicks on Activity Reminders tab")
	public void user_clicks_Activity_Reminders_tab()  {
		mysettings.click_Activity_Reminders_tab();
	}

	@And("User clicks on open test reminder button")		
	public void user_clicks_open_test_reminder_button()  {
		mysettings.click_open_Test_Reminder_button();
	}

	/*
	 * @And ("check for the user menu drop down") public void
	 * check_for_the_user_menu_drop_down() { HomePage.verify_developerconsole();
	 * 
	 * }
	 */

	@When (" user Clicks for the user menu drop down")
	public void clickson_DeveloperConsoleLink_dropdown() {
		homepage.click_developerconsole();

	}
	@Then ("Developer Console Window Should be Displayed")
	public void Developer_Console_Window_Should_be_Displayed() {


	}

	@And("user Clicks on Logout Option")
	public void user_Clicks_on_Logout_Option() {
		homepage.click_logout();	 
	}

	@Then("Account Page Should Be displayed")
	public void account_Page_Should_Be_displayed() {
		accountsPage.verify_Accounts_HomePage_displayed();
	}
	@And("User Clicks on new View Link")
	public void User_Clicks_on_new_View_Link() {
		accountsPage.click_createNewButton();
	}
	@Then ("Newly added Link should be displayed")
	public void Newly_added_Link_should_be_displayed() {
		accountsPage.verify_Accounts_NewPage_displayed();
	}
	@And ("Click Edit View")
	public void Click_Edit_View() {
		accountsPage.click_EditView();
	}
	@And ("user Cliks on AccountLink")
	public void user_Cliks_on_AccountLink() {
		accountsPage.click_Account_tab();
	}

	@Then("Edit View Page Should be Displayed")
	public void Edit_View_Page_Should_be_Displayed() {
		accountsPage.click_EditViewPage();
		System.out.println("Edit View Page Displayed");
	}
	@And("user Cliks on MergeAccount")
	public void user_Cliks_on_MergeAccount()
	{
		accountsPage.click_mergeaccount();
	}

	@And ("User clicks on textBox")
	public void User_clicks_on_textBox() {
		accountsPage.EnterAccName("Samanvita");

	}

	@And ("User Clicks FindAccount")
	public void User_Clicks_FindAccount() {
		accountsPage.click_findaccount();

	}
	@And ("User Selects Account Activity")
	public void User_Selects_Account_Activity() {
		accountsPage.Accountactivity();
	}
	@Then ("Clicks on Nextbutton")
	public void Clicks_on_Nextbutton() {
		accountsPage.click_Nextbutton();
	}
	@And ("User Selects Date field")
	public void User_Selects_Date_field() {
		accountsPage.select_Date_Field();
	}

	@And ("User Clicks on fromDate")
	public void User_Clicks_on_fromDate() throws InterruptedException {
		accountsPage.fromToday();
	}

	@And ("User Clicks on toToday")
	public void User_Clicks_on_toToday() throws InterruptedException {
		accountsPage.toToday();
	}
	@Then ("User Clicks on Save Unsaved Report")
	public void User_Clicks_on_Save_Unsaved_Report() {
		accountsPage.click_SaveUnsavedReport();
	}

	@And ("User Enters ReportName")
	public void User_Enters_ReportName() {
		accountsPage.input_Report_Name("December2023");
	}

	@And ("User Enters UniqueReportName")
	public void User_Enters_UniqueReportName(){
		accountsPage.input_Report_Unique_Name("ThisYear");

	}	 

	@Then ("User Clicks on Save Report")
	public void User_Clicks_on_Save_Report()
	{
		accountsPage.click_SaveButton_SaveReport(); 
	}
	@And ("User clicks oppurtunity Tab")
	public void User_clicks_oppurtunity_Tab() {
		opportunitiesPage.click_Opp_tab();
	}
	@Then ("Clicks on View DropDown")
	public void Clicks_on_View_DropDown() {
		opportunitiesPage.click_ViewDD();

	}
	@And ("User clicks on NewButton")
	public void User_clicks_on_NewButton() {
		opportunitiesPage.click_NewButton();

	}
	@Then ("Clicks on New button")
	public void Clicks_on_New_button(){
		opportunitiesPage.click_NewButton();
	}
	@And ("Clicks on Oppurtunity Pipeline")
	public void Clicks_on_Oppurtunity_Pipeline(){
		opportunitiesPage.click_oppPipeline();
	}
	@And("Clicks on Stuck Opportunities")  
	public void Clicks_on_Stuck_Opportunities(){
		opportunitiesPage.StuckOpp() ;
	}
	@And ("User clicks on Lead Tab")
	public void User_clicks_on_Lead_Tab() {
		leadsPage.click_Lead_tab();
	}
	@And ("Clicks on Lead Page DropDown")
	public void Clicks_on_Lead_Page_DropDown() {
		leadsPage.click_View_Dropdown();
	}
	@And ("Selects User Menu")
	public void Selects_User_Menu() {
		leadsPage.click_UserMenu();
	}

	@And ("User clicks on GO button")
	public void User_clicks_on_GO_button() {
		leadsPage.click_GOButton();
		System.out.println("Checked on Go Button");
	}
	@And ("Launches Sales Force")
	public void Launches_Sales_Force() {
		loginpage.launchSalesForce();
	}
	@And ("Clicks the View DropDown List")
	public void Clicks_the_View_DropDown_List() {
		leadsPage.click_View_DropdownList() ;
	}
	@Then ("Todays Lead Page Should Be Displayed")
	public void Todays_Lead_Page_Should_Be_Displayed() {
		leadsPage.click_TodaysLeadPage();
		System.out.println("Todays Lead Page Verified");
	}
	@And ("User Clicks on NewButton")
	public void User_Clicks_on_NewButton() {
		leadsPage.click_NewButton();
	}
	@Then ("Clicks on LastName")
	public void Clicks_on_LastName() {
		leadsPage.click_LastName();
	}
	@And ("Enters LastName")
	public void Enters_LastName() {
		leadsPage.input_LName("ABCD");
	}
	@And ("Clicks on CompanyName")
	public void Clicks_on_CompanyName() {
		leadsPage.click_CompanyName();	
	}
	@Then ("Enters CompanyName")
	public void Enters_CompanyName() {
		leadsPage.input_CName("ABCD");
	}
	@Then ("Clicks on LastElement")
	public void Clicks_on_LastElement(){
		ContactPage.click_lastElement();
	}
	@And ("Clicks AccountName")
	public void Clicks_AccountName() {
		ContactPage.click_AccountName();
	}
	@Then ("Then Enters LastName on that")
	public void Enters_LastName1() {
		ContactPage.input_LName("Dixit");
	}
	@And ("Enters AccountName")
	public void Enters_AccountName() {
		ContactPage.input_AName("samhita");
	}
	@Then ("Clicks on Save")
	public void Clicks_on_Save() {
		ContactPage.click_Save();
	}
	@When ("User clicks on contact tab")
	public void User_Clicks_on_Contact_Tab() {
		ContactPage.click_Contact_tab();
	}


	@And ("User Clicks on NewView") 
	public void User_Clicks_on_NewView() {
		ContactPage.click_newview();

	}
	@And ("User Enters on ViewName")
	public void User_Enters_on_ViewName() {
		ContactPage.input_ViewName("Anna");

	}

	@And ("User Clicks on ViewUniqueName")
	public void User_Clicks_on_ViewUniqueName() {
		ContactPage.click_ViewUniqueName();
	}
	@And ("Enters UniqueName")
	public void Enters_UniqueName() {
		ContactPage.input_UniqueName("Elsa");
	}
	@And("Clicks on SaveElement") 
	public void Clicks_Save() {
		ContactPage.click_Save1();
	}
	@And("Selects Recent Contact DropDown")	
	public void Selects_Recent_Contact_DropDown() {
		ContactPage.select_Recent_Contact_DropDown("Recently Created");
		System.out.println("Selected Recent Contact");
	}
	@Then ("Selects view DropDown")
	public void Selects_view_DropDown() {
		ContactPage. click_View_Dropdown1() ;
	}
	@And ("Selects Dropdown")
	public void Selects_Dropdown() {
		ContactPage.select_Dropdown1() ;
	}
	@And ("Clicks on Contact Name")
	public void Clicks_on_Contact_Name() {
		ContactPage.click_Name();  
	}

	@Then ("Enters LastName on New Contact")
	public void Enter_lastName_NewContact() {
		ContactPage.input_LastName("Dixit");  
	}
	 @And("User clicks on Name")
	 public void User_clicks_on_Name() {
		 ContactPage.click_Name(); 
	 }
	 @And ("Create New View hyperLink")
	 public void Create_New_View_hyperLink() {
		 ContactPage.click_newview();
	 }
	 @And("Clicks on Cancel")
	 public void Clicks_on_Cancel() {
			ContactPage.click_Cancel();
	 }
	 @Then("Clicks on saveandNew button")
	 public void Clicks_on_saveandNew_button() {
			ContactPage.click_SaveandNew();

	 }
	 @And("Clicks on HomeTab")
	 public void Clicks_on_HomeTab() {
		 homepage.click_Home_Tab();
	 }
     @And ("Clicks on First and LastName LInk")
	 public void Clicks_on_First_and_LastName_LInk() {
    	 homepage.Click_First_and_LName();
     }
	 
     @Then ("First and LastName Link Page is Displayed")
	 public void First_and_LastName_Link_Page_is_Displayed() {
    	 homepage.verify_Chatter();
     }
	 
		/*
		 * @Then ("clicks on Edit Profile") public void clicks_on_Edit_Profile() {
		 * 
		 * }
		 * 
		 * @And ("Clicks on about Tab") public void Clicks_on_about_Tab() {
		 * 
		 * }
		 * 
		 * @Then ("clicks on lastName") public void clicks_on_lastName() {
		 * 
		 * }
		 * 
		 * @And ("Edits LastName") public void Edits_LastName() {
		 * 
		 * }
		 * 
		 * @And ("Clicks on save") public void Clicks_on_save() {
		 * 
		 * }
		 */
}	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 


