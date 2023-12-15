package com.automation.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automation.factory.DriverFactory;
import com.automation.utility.PropertiesUtility;

public class LoginPage  {

	public static long timeOut = 30;


	@FindBy(id ="username") WebElement userNameElement;
	@FindBy(id = "password") WebElement password;
	@FindBy(id = "Login") WebElement loginButton;
	@FindBy(id = "error") WebElement loginErrorElement;
	@FindBy(id = "rememberUn") WebElement rememberMe_CheckBox;
	@FindBy(id = "idcard-identity") WebElement savedUserName;
	@FindBy(id = "forgot_password_link") WebElement forgotPassword;
	@FindBy(id = "un") WebElement forgotPassword_userName;
	@FindBy(id = "continue") WebElement forgotPassword_continue;
	@FindBy(name = "cancel") WebElement forgotPassword_cancel;
	@FindBy(xpath = "//p[contains(text(),'We’ve sent you an email')]") WebElement forgotPassword_confirmation_message;
	@FindBy(id="error") WebElement contact_Message;
	
	
	

	PropertiesUtility pro=new PropertiesUtility();
	Properties appProp= pro.loadFile("applicationDataProperties");
	String validUserId=appProp.getProperty("login.valid.userid");

	public LoginPage() {		
		PageFactory.initElements(DriverFactory.getDriver(), this);
	}


	public void launchSalesForce() {
		PropertiesUtility pro=new PropertiesUtility();
		Properties appProp= pro.loadFile("applicationDataProperties");
		String url = appProp.getProperty("url");
		System.out.println("browser opened");
		DriverFactory.getDriver().get(url);
	}

	BasePage basePage = new BasePage();


	public void enterUsername(String usernamedata) {
		basePage.enterText(userNameElement, usernamedata);
	}

	public void enterPassword(String passworddata) {
		basePage.enterText(password, passworddata);
	}

	public void loginErrorDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(loginErrorElement.isDisplayed());
	}

	public void clickButton() {
		basePage.clickElement(loginButton, timeOut);
	}

	public String getTitleOfThePAge() {
		String title = basePage.retrieveTitle();
		return title;
	}

	public void select_Rememberme() {
		basePage.clickElement(rememberMe_CheckBox,timeOut);
	}

	public String getSavedUsername () {
		return basePage.getTextOfElement (savedUserName);		
	}

	public void click_forgot_password() {
		basePage.clickElement(forgotPassword,timeOut);
	}

	public void enter_forgotPassword_Username(String forgotUname) {
		basePage.enterText(forgotPassword_userName, forgotUname);
	}

	public void click_forgotPassword_continue() {
		basePage.clickElement(forgotPassword_continue,timeOut);
	}

	public void click_forgotPassword_cancel() {
		basePage.clickElement(forgotPassword_cancel,timeOut);
	}
	
	public void verify_home_page() {
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		String actualTitle= basePage.retrieveTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}	
	
	public void verify_username_retained() {
		String actualUserId= getSavedUsername();
		Assert.assertEquals(validUserId, actualUserId);
	}	
	
	public void verify_forgotPassword_confirmation_message () {
		basePage.isElementPresent(forgotPassword_confirmation_message);
	}
	
	public void verify_contact_admin_message () {
		basePage.isElementPresent(contact_Message);
	}
	
	
}


