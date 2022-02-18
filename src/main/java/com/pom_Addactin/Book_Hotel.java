package com.pom_Addactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Adactin.com']")
	private WebElement scrolldown;
	
	@FindBy(id = "first_name")
	private WebElement firstname;
	
	@FindBy(id = "last_name")
	private WebElement lastname;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement cc;
	
	@FindBy(id = "cc_type")
	private WebElement cctype;
	
	@FindBy(id = "cc_exp_month")
	private WebElement expmonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expyear;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(id = "book_now")
	private WebElement booknow;
	
	public Book_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getScrolldown() {
		return scrolldown;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc() {
		return cc;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}
		
}
