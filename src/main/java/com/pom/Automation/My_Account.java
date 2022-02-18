package com.pom.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Account {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@title='View my customer account']")
	private WebElement account;
	
	@FindBy(xpath = "//span[text()='Order history and details']")
	private WebElement order;
	
	public My_Account(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAccount() {
		return account;
	}

	public WebElement getOrder() {
		return order;
	}

}
