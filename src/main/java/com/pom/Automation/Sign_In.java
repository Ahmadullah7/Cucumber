package com.pom.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_In {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin;
	
	@FindBy(id = "email")
	private WebElement username;
	
	@FindBy(id = "passwd")
	private WebElement password;
	
	@FindBy(xpath = "//i[@class='icon-lock left']")
	private WebElement login;
	
	public Sign_In(WebDriver driver2){
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
