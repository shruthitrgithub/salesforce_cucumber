package com.automation.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty","json:target/cucumberreports.json" }, 
        glue = {"com.automation.stepDefinitions","com.automation.base"}, 
        features = "src/test/resources/features/", 
        tags="@SFDCLogin",
        dryRun=false
    )
public class TestRunner {

}