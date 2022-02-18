package com.automation.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.automation.TestRunner.Automation_TestRunner;
import com.cucumber.Base_Class;
import com.page_Object_Manager.Automation;
import com.page_Object_Manager.File_Reader_Manager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Automation_StepDefinitions extends Base_Class {
	
	public static WebDriver driver = Automation_TestRunner.driver;
	public static Automation au = new Automation(driver);
	
	@Before
	public void beforeHooks(Scenario s) {
		String name = s.getName();
		System.out.println("Name: " + name);

	}
	
	@After
	public void afterHooks(Scenario s) throws Throwable {
		String status = s.getStatus();
		System.out.println("Status: " + status);
		if(s.isFailed()) {
			screenshot("C:\\Users\\Ahmadullah~A\\eclipse-workspace\\Cucumber\\Screenshot");
		}
	}
	
	@Given("^user Navigates To Automation Website$")
	public void user_Navigates_To_Automation_Website() throws Throwable {
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceACR().geturl();
		geturl(url);
		
		implicitwait();
	    
	}

	@When("^user Clicks Signin Button And Navigates To Login Page$")
	public void user_Clicks_Signin_Button_And_Naavigates_To_Login_Page() throws Throwable {
		
		clickonelement(au.getInstancesi().getSignin());
	    
	}

	@When("^user Enters Username As \"([^\"]*)\" And Password As \"([^\"]*)\"$")
	public void user_Enters_Username_As_And_Password_As(String username, String password) throws Throwable {
		
		sendkeys(au.getInstancesi().getUsername(), username);
		
		sendkeys(au.getInstancesi().getPassword(), password);
	    
	}

	@Then("^user Clicks Login Button And Navigates To Home Page$")
	public void user_Clicks_Login_Button_And_Navigates_To_Home_Page() throws Throwable {
		
		clickonelement(au.getInstancesi().getLogin());
	    
	}

	@When("^user Clicks T-Shirts Session And Navigates To T-Shirts Webpage$")
	public void user_Clicks_T_Shirts_Session_And_Navigates_To_T_Shirts_Webpage() throws Throwable {
		
		clickonelement(au.getInstancehp().getTshirt());
	    
	}

	@When("^user Clicks Quick View To Preview$")
	public void user_Clicks_Quick_View_To_Preview() throws Throwable {
	   
		mousehover(au.getInstancehp().getOuterframe());
		
		clickonelement(au.getInstancehp().getQuickview());
		
	}

	@When("^user Click On Add To Cart$")
	public void user_Click_On_Add_To_Cart() throws Throwable {
		
		staticwait();
		framewebelement(au.getInstancehp().getIframe());
		
		clickon(au.getInstancehp().getCart());
		
	}

	@Then("^user Click On Proceed To Checkout And Navigates To Shopping Cart - Summary Page$")
	public void user_Click_On_Proceed_To_Checkout_And_Navigates_To_Shopping_Cart_Summary_Page() throws Throwable {
	    
		staticwait();
		frametomainpage();
		
		clickonelement(au.getInstancehp().getCheckout());
		
	}

	@Then("^user Clicks Proceed To Checkout And Navigates to Addresses Page$")
	public void user_Clicks_Proceed_To_Checkout_And_Navigates_to_Addresses_Page() throws Throwable {
		
		clickonelement(au.getInstances().getSummary_checkout());
	    
	}

	@Then("^user Clicks Proceed To Checkout And Navigates to Shipping Page$")
	public void user_Clicks_Proceed_To_Checkout_And_Navigates_to_Shipping_Page() throws Throwable {
		
		clickonelement(au.getInstancea().getAddress());
	    
	}

	@When("^user Click On Term Of Service Checkbox$")
	public void user_Click_On_Term_Of_Service_Checkbox() throws Throwable {
		
		clickonelement(au.getInstancesh().getCheckbox());
		
	}

	@Then("^user Clicks Proceed To Checkout And Navigates to Payment Page$")
	public void user_Clicks_Proceed_To_Checkout_And_Navigates_to_Payment_Page() throws Throwable {
		
		clickonelement(au.getInstancesh().getCheckout());
	    
	}

	@When("^user Selects Payment Method By Clicking On It And Navigates To Order Summary$")
	public void user_Selects_Payment_Method_By_Clicking_On_It_And_Navigates_To_Order_Summary() throws Throwable {
		
		clickonelement(au.getInstancep().getCheque());
	    
	}

	@Then("^user Click On I Confirm My Order And Webpage Redirect To Order Complete Page$")
	public void user_Click_On_I_Confirm_My_Order_And_Webpage_Redirect_To_Order_Complete_Page() throws Throwable {
		
		clickonelement(au.getInstancep().getConfirm());
	    
	}

	@When("^user Click On Username And Webpage Navigates To My Account Page$")
	public void user_Click_On_Username_And_Webpage_Navigates_To_My_Account_Page() throws Throwable {
		
		clickonelement(au.getInstancema().getAccount());
	    
	}

	@When("^user Click On Order History And Details And Webpage Navigates To The Order History$")
	public void user_Click_On_Order_History_And_Details_And_Webpage_Navigates_To_The_Order_History() throws Throwable {
		
		clickonelement(au.getInstancema().getOrder());
	    
	}

	@Then("^user Clicks Signout And Webpage Redirects To Logged Out Successfully\\.$")
	public void user_Clicks_Signout_And_Webpage_Redirects_To_Logged_Out_Successfully() throws Throwable {
		
		clickonelement(au.getInstanceso().getLogout());
	    
	}

}
