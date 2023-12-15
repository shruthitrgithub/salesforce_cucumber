package com.automation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.factory.DriverFactory;

public class BasePage {	
	
	WebDriver driver = DriverFactory.getDriver();	
	
	public  void enterText (WebElement element,String data) {		
		if (element.isDisplayed()) {
			clearElement(element);
			element.sendKeys(data);
			System.out.println("pass:" +data+ " is entered");
		}
		else {
			System.out.println("Fail:"+data+" element is not displayed");
		}
	}


	public  void clearElement(WebElement element) {		
		if (element.isDisplayed()) {
			element.clear();
			System.out.println("pass: Element cleared ");
		}
		else {
			System.out.println("Fail: Element is not displayed");
		}
	}

	public  void clickElement(WebElement element, long timeOut) {	
		WebDriverWait wait = new WebDriverWait (driver, timeOut);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		if (element.isDisplayed()) {
			element.click();;
		}
		else {
			System.out.println("Fail: Element is not found");
		}
	}

	public  boolean isElementPresent(WebElement element) {
		boolean exists = false;
		try {
			element.isDisplayed();
			exists = true;
		} catch (NoSuchElementException e) {
			exists = false;
		}
		return exists;
	}

	public  String getTextOfElement(WebElement element) {
		return element.getText();
		
	}

	public void selectFromDropDown(WebElement dropdown, String value) {	

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		Select drpDn = new Select(dropdown);
		drpDn.selectByVisibleText(value);

	}

	public  String retrieveTitle() {
		return driver.getTitle();
	}
	
	public  void swtichWindow(String windowName) {
		driver.switchTo().window(windowName);
	}

	public  void swtichFrame(String windowName) {
		driver.switchTo().frame(windowName);
	}

}
