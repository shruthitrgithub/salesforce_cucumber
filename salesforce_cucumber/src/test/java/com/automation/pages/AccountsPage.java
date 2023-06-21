package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.factory.DriverFactory;

public class AccountsPage {

	public static long timeOut = 30;
	@FindBy(id ="createNewButton") WebElement createNewButton;
	@FindBy(xpath ="//a[@class='accountMru menuButtonMenuLink']") WebElement Account_tab;
	@FindBy(xpath ="//input[@id='acc2']") WebElement AccountName;
	@FindBy(xpath ="//select[@id='acc6']") WebElement Type_dropDown;
	@FindBy(xpath ="//select[@id='00N5i00000Ow2Y0']") WebElement CustomerPriority_dropDown;
	@FindBy(xpath ="//a[@id='tryLexDialogX']") WebElement popUp_close;
	
	public AccountsPage() {		
		PageFactory.initElements(DriverFactory.getDriver(), this);
	}
	
	BasePage basePage = new BasePage();


	public void click_createNewButton() {
		basePage.clickElement(createNewButton, timeOut);
	}

	public void click_Account_tab() {
		basePage.clickElement(Account_tab, timeOut);
	}

	public void input_AccountName(String acctName) {
		basePage.enterText(AccountName, acctName);
	}

	public void select_Type_dropDown_item(String item) {
		basePage.selectFromDropDown(Type_dropDown, item);
	}

	public void select_CustomerPriority_dropDown_item(String priority) {
		basePage.selectFromDropDown(CustomerPriority_dropDown, priority);
	}

	public void click_popUp_close() {

		basePage.clickElement(popUp_close, timeOut);		

	}

}
