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
	@FindBy(xpath ="//*[text()='Create New View']") WebElement createNewView;
	@FindBy(xpath ="//*[@id='fname']") WebElement viewName;
	@FindBy(xpath ="//*[@id='devname']") WebElement viewUniqueName;	
	@FindBy(xpath ="//*[@value=' Save ']") WebElement saveButton;
	@FindBy(xpath ="//*[@id=\"filter_element\"]/div/span/span[2]/a[1]") WebElement Edit;
	@FindBy(xpath ="//*[@id=\"fname\"]") WebElement viewName1;
	@FindBy(xpath ="//*[@value=' Save ']") WebElement saveButton1;
	@FindBy(xpath ="//a[contains(text(),'Merge Accounts')]") WebElement mergeAccount;
	@FindBy(xpath="//*[@id=\"srch\"]") WebElement findaccounttext;//"//*[@id='srch']"
	@FindBy(name ="srchbutton") WebElement findaccount;
	@FindBy(name ="goNext") WebElement Nextbutton;
	@FindBy(xpath ="//a[text()='Accounts with last activity > 30 days']") WebElement Accountactivity;
	@FindBy(id ="ext-gen20") WebElement dateField;
	@FindBy(xpath ="//div[text()='Created Date']") WebElement createDate;	
	@FindBy(id ="ext-gen152") WebElement fromCalender;
	@FindBy(id ="ext-gen154") WebElement toCalender;
	@FindBy(id ="ext-gen281") WebElement fromTodayButton;	
	@FindBy(id ="ext-gen296") WebElement toTodayButton;
	@FindBy(id ="ext-gen49") WebElement saveButton_UnsavedReport;	
	@FindBy(id ="saveReportDlg_reportNameField") WebElement reportName;
	@FindBy(id ="saveReportDlg_DeveloperName") WebElement reportUniqueName;
	@FindBy(id ="ext-gen314") WebElement saveButton_SaveReport;
	@FindBy(xpath ="//h1[text()='Accounts']") WebElement accounts_HomePage;	
	
	
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

	public void click_createNewView() {
		basePage.clickElement(createNewView, timeOut);
	}

	public void input_ViewName(String viewNameValue) {
		basePage.enterText(viewName, viewNameValue);
	}

	public void input_ViewUniqueName(String viewUniqueNameValue) {
		basePage.enterText(viewUniqueName, viewUniqueNameValue);
	}

	public void click_SaveButton() {
		basePage.clickElement(saveButton, timeOut);
	}

	public void click_Edit() {
		basePage.clickElement(Edit, timeOut);
	}

	public void input_ViewName1(String Sugosh) {
		basePage.enterText(viewName,Sugosh);
	}
	

	public void click_SaveButton1() {
		basePage.clickElement(saveButton1, timeOut);
	}
	

	public void input_enterText(String accName) {
		basePage.enterText(findaccounttext, accName);
	}
	
	public void click_findaccount() {
		basePage.clickElement(findaccount, timeOut);
	}
	
	public void EnterAccName(String accName) {
		basePage.enterText(findaccounttext, accName);

	}
	
	public void click_mergeaccount() {
		basePage.clickElement(mergeAccount, timeOut);
	}
	
	public void click_Nextbutton()	{
		basePage.clickElement(Nextbutton, timeOut);
	}	
	
	public void Accountactivity() {
		basePage.clickElement(Accountactivity, timeOut);

	}
	
	public void select_Date_Field() {		
		basePage.clickElement(dateField, timeOut);
		basePage.clickElement(createDate, timeOut);		
	}
	
	public void fromToday () throws InterruptedException {
		basePage.clickElement(fromCalender, timeOut);
		Thread.sleep(2000);
		basePage.clickElement(fromTodayButton,timeOut);
	}
	
	public void toToday() throws InterruptedException {
		Thread.sleep(2000);
		basePage.clickElement(toCalender, timeOut);
		Thread.sleep(2000);
		basePage.clickElement(toTodayButton,timeOut);
	}
	
	public void click_SaveUnsavedReport()	{
		basePage.clickElement(saveButton_UnsavedReport, timeOut);
	}	
	
	public void input_Report_Name(String reportNameValue)	{
		basePage.enterText(reportName, reportNameValue);
	}	

	public void input_Report_Unique_Name(String reportUniqueNameValue)	{
		basePage.enterText(reportUniqueName, reportUniqueNameValue);
	}	

	public void click_SaveButton_SaveReport()	{
		basePage.clickElement(saveButton_SaveReport, timeOut);
	}
	
	public void verify_Accounts_HomePage_displayed()	{
		basePage.isElementPresent(accounts_HomePage);
	}	
}


	
	
	
	
	
	
	
	
	
	
	
	

