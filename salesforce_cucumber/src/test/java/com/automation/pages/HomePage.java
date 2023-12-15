package com.automation.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	@FindBy(xpath ="//a[@title='Home Tab']") WebElement Home_Tab;	
	@FindBy(xpath ="//h1/a[@href='/_ui/core/userprofile/UserProfilePage']") WebElement currentUserName;	
	@FindBy(xpath ="//h2[@id='contactInfoTitle']") WebElement editProfileTitle;
	@FindBy(id ="contactTab") WebElement editProfile_ContactTab;
	@FindBy(xpath ="//span[@id='tailBreadcrumbNode']") WebElement editProfile_ProfileName;
	//@FindBy(id ="aboutTab") WebElement editProfile_AboutTab;
	//@FindBy(id ="lastName") WebElement editProfile_LastName;
	//@FindBy(xpath ="//input[@type='button' and @value='Save All']") WebElement editProfile_SaveAll;	

	@FindBy(xpath ="//a[@href='/home/showAllTabs.jsp']") WebElement showAllTabs;
	@FindBy(xpath ="//input[@value='Customize My Tabs']") WebElement customizeMyTabs;	
	@FindBy(id ="duel_select_0") WebElement available_Tabs;
	@FindBy(id ="duel_select_1") WebElement selected_Tabs;
	@FindBy(id ="duel_select_0_right") WebElement add_Selected_Tabs;	
	@FindBy(id ="duel_select_0_left") WebElement remove_Selected_Tabs;
	@FindBy(xpath ="//input[@name='save']") WebElement save_Button;
	@FindBy(xpath ="//*[@id=\"ptBody\"]/div/div[2]/span[2]/a") WebElement CurrentDate;
	@FindBy(xpath ="//*[@id=\"p:f:j_id25:j_id61:28:j_id64\"]/a") WebElement EightPM;
	@FindBy(className="comboboxIcon") WebElement SubjectCombo;
	@FindBy(xpath ="//a[text()='Other']") WebElement comboBox_Other;
	@FindBy(xpath ="//*[@id=\"p:f:j_id25:j_id61:20:j_id64\"]/a") WebElement FourPM;
	@FindBy(id ="EndDateTime_time") WebElement endDateTime_Time;
	@FindBy(id ="timePickerItem_42") WebElement StartDateTime_Time_9pm;
	@FindBy(id ="StartDateTime_time") WebElement StartDateTime_time;
	@FindBy(className="btn") WebElement SaveButton;
	@FindBy(id ="timePickerItem_46") WebElement endDateTime_Time_11pm;
	@FindBy(xpath ="//*[@id=\"timePickerItem_38\"]") WebElement endDateTime_Time_7pm;
	@FindBy(id ="IsRecurrence") WebElement CheckBox;
	@FindBy(id ="rectypeftw") WebElement WeekelyRadioButton;
	@FindBy(id ="RecurrenceEndDateOnly") WebElement RecurrenceEndDate;
	@FindBy(id ="datePicker") WebElement Calender;
	@FindBy(xpath ="//*[@id=\"bottomButtonRow\"]/input[1]") WebElement Save;
	
	@FindBy(xpath ="//span[text()='Post']") WebElement Post_link;
	@FindBy(xpath ="//body[contains(text(),'Share an update')]") WebElement Post_textBox;	
	@FindBy(xpath ="//span[text()='File']") WebElement File_link;	
	@FindBy(id ="chatterUploadFileAction") WebElement upload_From_Computer;
	@FindBy(id ="chatterFile") WebElement choose_File_button;
	@FindBy(id ="publishersharebutton") WebElement share_post_button;
	
	

	public HomePage() {		
		PageFactory.initElements(DriverFactory.getDriver(), this);
	}
	
	BasePage basePage = new BasePage();

	public void click_userMenuDropDown() {
		basePage.clickElement(userMenuDropDown, timeOut);
	}
	
	
	public void verify_myProfile() {
		basePage.isElementPresent(myProfile);
		System.out.println("My Profile drop down value verified");
	}
	
	public void verify_mySetting() {
		basePage.isElementPresent(mySetting);
		System.out.println("My Setting drop down value verified");

	}

	public void verify_developerconsole() {
		basePage.isElementPresent(developerconsole);
		System.out.println("Developer Console drop down value verified");
	}

	public void verify_switchtoLight() {
		basePage.isElementPresent(switchtoLight);
	}
	
	public void verify_logout() {
		 basePage.isElementPresent(logout);
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
	
	public void enter_LastName(String data) throws InterruptedException {
		Thread.sleep(3000);
		basePage.swtichFrame("contactInfoContentId");
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

	public void click_Home_Tab() {
		basePage.clickElement(Home_Tab, timeOut);
	}

	public String get_Current_UserName() {		
		String user_Name = currentUserName.getText();
		System.out.println("user_Name = " +user_Name);
		return user_Name;
	}

	public String get_Current_UserName_EditProfile() {	
		System.out.println("Inside get_Current_UserName_EditProfile");
		basePage.isElementPresent(editProfile_ProfileName);
		String user_Name = editProfile_ProfileName.getText();
		System.out.println("user Name on Edit profile page= " +user_Name);
		return user_Name;
	}


	public void click_Current_UserName() {		
		basePage.clickElement(currentUserName, timeOut);
	}

	public void verify_EditProfile_PopUp_displayed() {	
		System.out.println("Verifying Edit Profile Pop up displayed");
		basePage.isElementPresent(editProfileTitle);
	}

	public void verify_EditProfile_ContactTab_displayed() {
		System.out.println("Verifying Contact Tab on Edit Profile Pop up is displayed");
		basePage.isElementPresent(editProfile_ContactTab);
	}


	public void click_showAllTabs() {		
		basePage.clickElement(showAllTabs, timeOut);
	}

	public void click_customizeMyTabs() {		
		basePage.clickElement(customizeMyTabs, timeOut);
	}

	public void click_available_Tabs() {		
		basePage.clickElement(available_Tabs, timeOut);
	}

	public void select_item_from_selected_Tabs() {	
		Select selectedTab = new Select(selected_Tabs);
		selectedTab.selectByIndex(1);		
	}

	public void click_add_Selected_Tabs() {		
		basePage.clickElement(selected_Tabs, timeOut);
	}

	public void click_remove_Selected_Tabs() {		
		basePage.clickElement(remove_Selected_Tabs, timeOut);
	}

	public void click_save_Button() {		
		basePage.clickElement(save_Button, timeOut);
	}
	public void click_CurrentDate() {
		basePage.clickElement(CurrentDate, timeOut);
	}

	public void click_Post_link() {
		basePage.clickElement(Post_link, timeOut);
	}

	public void input_Post_textBox(String postText) {
		basePage.enterText(Post_textBox, postText);
	}

	public void click_File_link() {
		basePage.clickElement(File_link, timeOut);
	}

	public void click_upload_From_Computer() {
		basePage.clickElement(upload_From_Computer, timeOut);
	}

	public void choose_File_button() {
		basePage.clickElement(choose_File_button, timeOut);
	}

	public void click_Share_post_button() {
		basePage.clickElement(share_post_button, timeOut);
	}
	
}
