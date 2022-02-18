 package com.helper_Addactin;

import org.openqa.selenium.WebDriver;

import com.pom_Addactin.Book_Hotel;
import com.pom_Addactin.Login_Page;
import com.pom_Addactin.Logout_Page;
import com.pom_Addactin.My_Itinerary;
import com.pom_Addactin.Search_Hotel;
import com.pom_Addactin.Select;

public class Page_Object_Manager {
	
	public WebDriver driver;
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}
	
	private Login_Page li;
	public Login_Page getInstanceli() {
		if(li == null) {
			li = new Login_Page(driver);
		}
		return li;
	}
	
	private Search_Hotel sh;
	public Search_Hotel getInstancesh() {
		if(sh == null) {
			sh = new Search_Hotel(driver);
		}
		return sh;
	}
	
	private Select s;
	public Select getInstances() {
		if(s == null) {
			s = new Select(driver);
		}
		return s;
	}
	
	private Book_Hotel bh;
	public Book_Hotel getInstancebh() {
		if(bh == null) {
			bh = new Book_Hotel(driver);
		}
		return bh;
	}
	
	private My_Itinerary mi;
	public My_Itinerary getInstancemi() {
		if(mi == null) {
			mi = new My_Itinerary(driver);
		}
		return mi;
	}
	
	private Logout_Page lo;
	public Logout_Page getInstancelo() {
		if(lo == null) {
			lo = new Logout_Page(driver);
		}
		return lo;
	}

}
