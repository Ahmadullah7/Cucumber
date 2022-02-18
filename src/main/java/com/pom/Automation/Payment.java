package com.pom.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='cheque']")
	private WebElement cheque;
	
	@FindBy(xpath = "//span[text()='I confirm my order']")
	private WebElement confirm;
	
	public Payment(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheque() {
		return cheque;
	}

	public WebElement getConfirm() {
		return confirm;
	}

}
