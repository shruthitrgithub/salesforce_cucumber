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
    

}

