package com.pom_Addactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select {
	
	public WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement select;
	
	@FindBy(id = "continue")
	private WebElement next;
	
	public Select(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getNext() {
		return next;
	}
	
	
}
