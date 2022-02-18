package com.pom.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy(xpath = "(//i[@class='icon-chevron-right right'])[3]")
	private WebElement checkout;
	
	public Shipping(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCheckout() {
		return checkout;
	}

}
