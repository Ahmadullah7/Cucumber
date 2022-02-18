package com.pom_Addactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(id = "room_type")
	private WebElement type;
	
	@FindBy(id = "room_nos")
	private WebElement rooms;
	
	@FindBy(id = "datepick_in")
	private WebElement pickin;
	
	@FindBy(id = "datepick_out")
	private WebElement pickout;
	
	@FindBy(id = "adult_room")
	private WebElement adult;
	
	@FindBy(id = "child_room")
	private WebElement child;
	
	@FindBy(id = "Submit")
	private WebElement search;
	
	public Search_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getPickin() {
		return pickin;
	}

	public WebElement getPickout() {
		return pickout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
}
