package com.pom.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//a[text()='T-shirts'])[2]")
	private WebElement tshirt;
	
	@FindBy(xpath = "//div[@class='product-image-container']")
	private WebElement outerframe;
	
	@FindBy(xpath = "//span[text()='Quick view']")
	private WebElement quickview;
	
	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	private WebElement iframe;
	
	@FindBy(xpath = "(//span[text()='Add to cart'])[1]")
	private WebElement cart;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement checkout;
	
	public Home_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getTshirt() {
		return tshirt;
	}

	public WebElement getOuterframe() {
		return outerframe;
	}

	public WebElement getQuickview() {
		return quickview;
	}

	public WebElement getIframe() {
		return iframe;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getCheckout() {
		return checkout;
	}

}
