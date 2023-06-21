package com.automation.base;

import org.openqa.selenium.WebDriver;

import com.automation.factory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	public WebDriver driver;
	private DriverFactory driverFactory;
	
	@Before(order = 0 )
	public void launchBrowser () {
		driverFactory=new DriverFactory();
		driver=driverFactory.init_driver();			
	}
	
	@After (order = 1)
	public void quitBrowser () {
		driver.close();
	}

}
