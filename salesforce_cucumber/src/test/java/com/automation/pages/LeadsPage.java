package com.automation.pages;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.automation.factory.DriverFactory;


//import com.automation.pages.base.BasePage;

public class LeadsPage {


	public static long timeOut = 30;

	@FindBy(xpath ="//*[@id='Lead_Tab']/a") WebElement leadTab;
	@FindBy(id ="fcf") WebElement viewSelect;
	@FindBy(id="userNavLabel") WebElement UserMenu;
	@FindBy(xpath ="//*[@id=\"userNav-menuItems\"]/a[5]") WebElement Logout;
	@FindBy(name="go") WebElement GOButton;
	@FindBy(name="new") WebElement NewButton;
	@FindBy(id="name_lastlea2") WebElement lastName;
	@FindBy(id="name_lastlea2") WebElement input_LName;
	@FindBy(xpath="	//*[@id=\"lea3\"]") WebElement CompanyName;
	@FindBy(xpath="	//*[@id=\"lea3\"]") WebElement CName;
	@FindBy(name="save") WebElement Save;
	@FindBy(xpath="//img[@class='pageTitleIcon']") WebElement TodaysLeadPage;
	
	public LeadsPage() {		
		PageFactory.initElements(DriverFactory.getDriver(), this);
	}
	
	BasePage basePage = new BasePage();

	public void click_Lead_tab() {
		basePage.clickElement(leadTab, timeOut);
	}

	public void click_View_Dropdown() {
		Select viewDropDown = new Select(viewSelect);
		
		List<WebElement> options = viewDropDown.getOptions();  
		for(WebElement we:options)  
		{  
		 System.out.println(we.getText());
		}  
	}
	public void click_View_DropdownList() {
		Select viewDropDown = new Select(viewSelect);	
		viewDropDown.selectByIndex(1);
	}
	public void click_UserMenu() {
		basePage.clickElement(UserMenu, timeOut);
	}
	public void click_Logout() {
		basePage.clickElement(Logout, timeOut);
}
	public void click_GOButton() {
		basePage.clickElement(GOButton, timeOut);
	}
	
	public void click_View_DropdownList1() {
		Select viewDropDown = new Select(viewSelect);	
		viewDropDown.selectByIndex(3);
}
	public void click_NewButton() {
		basePage.clickElement(NewButton, timeOut);
	
	}
	public void click_LastName() {
		basePage.clickElement(lastName, timeOut);
	}
	public void input_LName(String abcd) {
		basePage.enterText(lastName,"ABCD");
	}
	
	public void click_CompanyName() {
		basePage.clickElement(CompanyName, timeOut);
	}
	public void input_CName(String abcd) {
		basePage.enterText(CName,"ABCD");
	}
	public void click_TodaysLeadPage() {
		basePage.isElementPresent(TodaysLeadPage);
}

}













