package com.automation.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty",
        		"html:target/cucumberreports.html",
        		"json:target/cucumberreports.json",
        		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",}, 
        glue = {"com.automation.stepDefinitions","com.automation.base"}, 
        features = "src/test/resources/features/", 
        tags=" @SFDCLogin and @TC34",
        dryRun=false
    )
public class TestRunner {

}