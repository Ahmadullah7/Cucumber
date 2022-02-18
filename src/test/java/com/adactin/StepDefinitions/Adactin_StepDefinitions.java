package com.adactin.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.adactin.TestRunner.Adactin_TestRunner;
import com.cucumber.Base_Class;
import com.helper_Addactin.File_Reader_Manager;
import com.helper_Addactin.Page_Object_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adactin_StepDefinitions extends Base_Class{
	
	public static WebDriver driver = Adactin_TestRunner.driver;
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@Given("^user Navigates To The Adactin Website$")
	public void user_Navigates_To_The_Adactin_Website() throws Throwable {
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturl();
		geturl(url);
		
	}

	@When("^user Enters Username As \"([^\"]*)\" And Password As \"([^\"]*)\"$")
	public void user_Enters_Username_As_And_Password_As(String username, String password) throws Throwable {
		
		sendkeys(pom.getInstanceli().getUsername(), username);
		
		sendkeys(pom.getInstanceli().getPassword(), password);
	
	}

	@Then("^user Clicks Login Button And Navigates To Search Hotel Page$")
	public void user_Clicks_Login_Button_And_Navigates_To_Search_Hotel_Page() throws Throwable {
		
		clickonelement(pom.getInstanceli().getLogin());
	    
	}

	@When("^user Select The Hotel Location$")
	public void user_Select_The_Hotel_Location() throws Throwable {
		
		dropdowntext(pom.getInstancesh().getLocation(), "Melbourne");
		
	}

	@When("^user Select Hotel$")
	public void user_Select_Hotel() throws Throwable {
		
		dropdowntext(pom.getInstancesh().getHotels(), "Hotel Sunshine");
	    
	}

	@When("^user Select Room Type$")
	public void user_Select_Room_Type() throws Throwable {
		
		dropdowntext(pom.getInstancesh().getType(), "Super Deluxe");
	    
	}

	@When("^user Select Number Of Rooms$")
	public void user_Select_Number_Of_Rooms() throws Throwable {
		
		dropdownindex(pom.getInstancesh().getRooms(), 1);
	    
	}

	@When("^user Select The Check In And Check Out Date$")
	public void user_Select_The_Check_In_And_Check_Out_Date() throws Throwable {
		
		clear(pom.getInstancesh().getPickin());
		sendkeys(pom.getInstancesh().getPickin(), "14/03/2022");
		
		clear(pom.getInstancesh().getPickout());
		sendkeys(pom.getInstancesh().getPickout(), "16/03/2022");
	    
	}

	@When("^user Select The Adults Per Room And The Childrens Per Room$")
	public void user_Select_The_Adults_Per_Room_And_The_Childrens_Per_Room() throws Throwable {
	    
		dropdownvalue(pom.getInstancesh().getAdult(), "2");
		
		dropdownvalue(pom.getInstancesh().getChild(), "1");
		
	}

	@Then("^user Clicks Search Button And Navigates To Select Hotel Page$")
	public void user_Clicks_Search_Button_And_Navigates_To_Select_Hotel_Page() throws Throwable {
		
		clickonelement(pom.getInstancesh().getSearch());
	    
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		
		radiobutton(pom.getInstances().getSelect());
	    
	}

	@Then("^user Clicks Continue And Navigates To Book A Hotel Page$")
	public void user_Clicks_Continue_And_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		
		clickonelement(pom.getInstances().getNext());
	    
	}

	@When("^user Enters First Name And Last Name$")
	public void user_Enters_First_Name_And_Last_Name() throws Throwable {
		
		scrollintoview(pom.getInstancebh().getScrolldown());
		
		sendkeys(pom.getInstancebh().getFirstname(), "Ahmadullah");
		
		sendkeys(pom.getInstancebh().getLastname(), "A");
	    
	}

	@When("^user Enters Billing Address$")
	public void user_Enters_Billing_Address() throws Throwable {
		
		sendkeys(pom.getInstancebh().getAddress(), "i-TechArt, 47 SE. wall street, Brooklyn, New York.");
	    
	}

	@When("^user Enters Credit Card Number$")
	public void user_Enters_Credit_Card_Number() throws Throwable {
		
		sendkeys(pom.getInstancebh().getCc(), "1234567890123456");
	    
	}

	@When("^user Enters Credit Card Type$")
	public void user_Enters_Credit_Card_Type() throws Throwable {
		
		dropdownindex(pom.getInstancebh().getCctype(), 3);
	   
	}

	@When("^user Enters Expiry Date$")
	public void user_Enters_Expiry_Date() throws Throwable {
		
		dropdownvalue(pom.getInstancebh().getExpmonth(), "7");
		
		dropdowntext(pom.getInstancebh().getExpyear(), "2022");
	    
	}

	@When("^user Enters CVV Number$")
	public void user_Enters_CVV_Number() throws Throwable {
		
		sendkeys(pom.getInstancebh().getCvv(), "176");
	    
	}

	@Then("^user Clicks Book Now Button And Navigates To Booking Confirmation Page$")
	public void user_Clicks_Book_Now_Button_And_Navigates_To_Booking_Confirmation_Page() throws Throwable {
		
		clickonelement(pom.getInstancebh().getBooknow());
		staticwait();
	    
	}

	@When("^user Click On Booked Itinerary And Navigates To Booked Itinerary Page$")
	public void user_Click_On_Booked_Itinerary_And_Navigates_To_Booked_Itinerary_Page() throws Throwable {
		
		staticwait();
		clickonelement(pom.getInstancemi().getItinerary());
	    
	}

	@Then("^user Clicks Logout Button And Webpage Redirects To Logged Out Successfully\\.$")
	public void user_Clicks_Logout_Button_And_Webpage_Redirects_To_Logged_Out_Successfully() throws Throwable {
		
		clickonelement(pom.getInstancelo().getLogout());
	    
	}

}
