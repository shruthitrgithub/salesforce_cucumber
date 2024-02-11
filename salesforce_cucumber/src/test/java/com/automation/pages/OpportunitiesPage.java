package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.factory.DriverFactory;

public class OpportunitiesPage{

	public static long timeOut = 30;

	@FindBy(xpath ="//*[@id=\"Opportunity_Tab\"]/a") WebElement Opp_tab;
	@FindBy(name ="name") WebElement ViewDD;
	@FindBy(className="btn")WebElement NewButton;
	@FindBy(xpath ="//a[text()='Opportunity Pipeline']") WebElement oppPipeline  ;
	@FindBy(xpath ="//a[text()='Stuck Opportunities']") WebElement stuckOpportunities;
	//@FindBy(xpath ="//a[text()='Stuck Opportunities']") WebElement QuarterlyLink;
	public OpportunitiesPage() {		
		PageFactory.initElements(DriverFactory.getDriver(), this);
	}
	
	BasePage basePage = new BasePage();

	
	
	public void click_Opp_tab() {
		basePage.clickElement(Opp_tab, timeOut);
	}
	public void click_ViewDD() {
		basePage.clickElement(ViewDD, timeOut);
	}
	public void click_NewButton() {
		basePage.clickElement(NewButton, timeOut);	
	}
	public void click_oppPipeline() {
		basePage.clickElement(oppPipeline, timeOut);	

	}
	public void StuckOpp() {
		basePage.clickElement( stuckOpportunities, timeOut);	

	}	
}






