package com.automation.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.factory.DriverFactory;
//import com.automation.pages.base.BasePage;

public class ContactPage {

	public static long timeOut = 30;
	@FindBy(xpath ="//a[text()='Contacts']") WebElement Contact_tab;
	@FindBy(xpath="//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input") WebElement NewButton;
	@FindBy(id="name_lastcon2") WebElement LastName;
	@FindBy(id="name_lastcon2") WebElement LName;
	@FindBy(id="con4") WebElement AccountName ;
	@FindBy(id="con4") WebElement AName;
	@FindBy(xpath="//*[@id=\"bottomButtonRow\"]/input[1]") WebElement Save;
	@FindBy(xpath="//*[text()='Create New View']") WebElement createnewview;
	@FindBy(id="fname") WebElement ViewName;
	@FindBy(id="fname") WebElement ViewName1;
	@FindBy(id="devname") WebElement ViewUniqueName;
	@FindBy(id="devname") WebElement ViewUniqueName1;
	@FindBy(xpath="//input[@name='save']") WebElement save1;
	@FindBy(id="fcf") WebElement dDown;
	@FindBy(name="title") WebElement DD;
	@FindBy(id="hotlist_mode") WebElement recentDropDownElement;
	@FindBy(xpath="*[@class='dataRow even first']")
	WebElement ContactName;
	@FindBy(xpath="//*[text()='Create New View']") WebElement CreateNewView;
	@FindBy(id="fname") WebElement input_ViewNameAlphabet;
	@FindBy(name="cancel") WebElement Cancel;
	@FindBy(xpath="//*[@id='con4']") WebElement AccountNameBox;
	@FindBy(name="save_new") WebElement SaveandNew;

	public ContactPage() {		
		PageFactory.initElements(DriverFactory.getDriver(), this);
	}

	BasePage basePage = new BasePage();

	public void click_Contact_tab() {//save_new
		basePage.clickElement(Contact_tab, timeOut);
	}
	public void click_New_tab() {
		basePage.clickElement(NewButton, timeOut);	
	}
	public void click_lastElement() {
		basePage.clickElement(LastName, timeOut);	////*[@id='con4']
	}
	public void click_AccountName() {
		basePage.clickElement(AccountName, timeOut);	

	}
	public void input_LName(String Lname) {
		basePage.enterText(LName,"Dixit");
	}
	public void input_AName(String accname) {
		basePage.enterText(LName, accname);
	}

	public void click_Save() {
		basePage.clickElement(Save, timeOut);	
	}
	public void click_newview() {
		basePage.clickElement(createnewview, timeOut);	

	}

	public void click_ViewName() {
		basePage.clickElement(ViewName, timeOut);
	}

	public void click_ViewUniqueName() {
		basePage.clickElement(ViewUniqueName, timeOut);
	}	

	public void input_ViewName(String name) {
		basePage.enterText(ViewName1,"Anna");
	}
	public void input_UniqueName(String name) {
		basePage.enterText(ViewUniqueName1,"John");
	}

	public void click_Save1() {
		basePage.clickElement(save1, timeOut);
	}

	public void click_View_Dropdown() {
		Select viewDropDown = new Select(DD);
	}

	public void select_Dropdown() {
		Select viewDropDown = new Select(DD);
		viewDropDown.selectByIndex(0);
	}
	public void click_View_Dropdown1() {
		Select viewDropDown = new Select(dDown);
	}

	public void select_Dropdown1() {
		Select viewDropDown = new Select(dDown);
		viewDropDown.selectByIndex(3);
	}

	public void select_Recent_Contact_DropDown (String value) {
		Select recentDropDown = new Select(recentDropDownElement);

		recentDropDown.selectByVisibleText(value);

	}
	public void click_Name() {
		basePage.clickElement(ContactName, timeOut);
	}


	public void CreateNewView() {
		basePage.clickElement(CreateNewView, timeOut);
	}
	public void input_UniqueNameAlphabet(String name) {
		basePage.enterText(ViewUniqueName,"EFGH");
	}
	public void input_ViewNameAlphabet(String name) {
		basePage.enterText(input_ViewNameAlphabet,"ABCD");

	}	
	public void click_Cancel() {
		basePage.clickElement(Cancel, timeOut);
	}

	public void input_LastName(String Lname) {
		basePage.enterText(LName,"Indian");
	}
	public void click_AccountNameBOX() {
		basePage.clickElement(AccountNameBox, timeOut);
	}
	public void input_AccNameBox(String accname) {
		basePage.enterText(AccountNameBox,"Global");
	}
	public void click_SaveandNew() {
		basePage.clickElement(SaveandNew, timeOut);
	}
}
