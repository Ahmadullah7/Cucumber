package com.adactin.TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//Feature", glue = "com.adactin.StepDefinitions", monochrome = true, dryRun = false, strict = true, tags = ("~@A2"), plugin = {
		"html:Reports/Test Report", "pretty", "json:Reports/Json/Cucumber Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport/Report.html" })

public class Adactin_TestRunner {

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
