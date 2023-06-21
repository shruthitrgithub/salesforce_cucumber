package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.factory.DriverFactory;

public class HomePage {
	
	public static long timeOut = 30;
	@FindBy(id ="userNavLabel") WebElement userMenuDropDown;
	@FindBy(xpath = "//a[@title='My Profile']") WebElement myProfile;
	@FindBy(xpath = "//a[@title='My Settings']") WebElement mySetting;
	@FindBy(xpath = "//a[@title='Developer Console (New Window)']") WebElement developerconsole;
	@FindBy(xpath = "//a[@title='Switch to Lightning Experience']") WebElement switchtoLight;
	@FindBy(xpath = "//a[@title='Logout']") WebElement logout;
	@FindBy(xpath = "//a[@class='contactInfoLaunch editLink']/img") WebElement Editprofile;
	@FindBy(xpath = "//a[contains(text(),'About')]") WebElement About;
	@FindBy(id = "lastName") WebElement lastName;
	@FindBy(xpath = "//input[@value='Save All']") WebElement saveAll;
	@FindBy(id ="Account_Tab") WebElement Account_Tab;	

	public HomePage() {		
		PageFactory.initElements(DriverFactory.getDriver(), this);
	}
	
	BasePage basePage = new BasePage();

	public void click_userMenuDropDown() {
		basePage.clickElement(userMenuDropDown, timeOut);
	}
	
	
	public boolean verify_myProfile() {
		return basePage.isElementPresent(myProfile);
	}
	
	public boolean verify_mySetting() {
		return basePage.isElementPresent(mySetting);
	}

	public boolean verify_developerconsole() {
		return basePage.isElementPresent(developerconsole);
	}

	public boolean verify_switchtoLight() {
		return basePage.isElementPresent(switchtoLight);
	}
	
	public boolean verify_logout() {
		return basePage.isElementPresent(logout);
	}
		
	public void click_myProfile() {
		basePage.clickElement(myProfile, timeOut);
	}
	
	public void click_mySetting() {
		basePage.clickElement(mySetting,timeOut);
	}

	public void click_developerconsole() {
		basePage.clickElement(developerconsole, timeOut);
	}

	public void click_switchtoLight() {
		basePage.clickElement(switchtoLight, timeOut);
	}
	
	public void click_logout() {
		basePage.clickElement(logout, timeOut);
	}
	
	public void click_Editprofile() {
		basePage.clickElement(Editprofile, timeOut);
	}
	
	public void enter_LastName(String data) {
		basePage.swtichWindow("contactInfoContentId");
		basePage.clickElement(About, timeOut);
		basePage.clearElement(lastName);
		basePage.enterText(lastName, data);
	}
	
	public void click_saveAll() {
		basePage.clickElement(saveAll, timeOut);
	}

	public void click_Account_Tab() {
		basePage.clickElement(Account_Tab, timeOut);
	}

	
}
