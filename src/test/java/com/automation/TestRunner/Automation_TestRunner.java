package com.automation.TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//automation//Feature", glue = "com.automation.StepDefinitions", monochrome = true, dryRun = false, strict = true, plugin = {
		"html:Automation Reports/Test Report", "pretty", "json:Automation Reports/Json/Cucumber Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Automation Reports/Extent Report/Report.html" })

public class Automation_TestRunner {
	
	
		public static WebDriver driver;

		@BeforeClass
		public static void set_Up() {
			
			driver = Base_Class.openbrowser("chrome");
		}

		@AfterClass
		public static void tear_Down() {
			driver.quit();
		}

}
