package com.automation.stepDefinitions;

import java.util.Properties;
import io.cucumber.java.en.*;

import com.automation.pages.AccountsPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.MySettingsPage;
import com.automation.utility.PropertiesUtility;

public class SFDCStepDefinitions  {

	LoginPage loginpage = new LoginPage();
	HomePage homepage = new HomePage();
	MySettingsPage mysettings = new MySettingsPage();		
	AccountsPage accountsPage = new AccountsPage();

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
	
	
	
}
