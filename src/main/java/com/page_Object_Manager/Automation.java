package com.page_Object_Manager;

import org.openqa.selenium.WebDriver;

import com.pom.Automation.Address;
import com.pom.Automation.Home_Page;
import com.pom.Automation.My_Account;
import com.pom.Automation.Payment;
import com.pom.Automation.Shipping;
import com.pom.Automation.Sign_In;
import com.pom.Automation.Sign_Out;
import com.pom.Automation.Summary;

public class Automation {
	
public WebDriver driver;
	
	public Automation(WebDriver driver2) {
		this.driver = driver2;
	}
	
	private Sign_In si;
	public Sign_In getInstancesi() {
		if(si == null) {
			si = new Sign_In(driver);
		}
		return si;
	}
	
	private Home_Page hp;
	public Home_Page getInstancehp() {
		if(hp == null) {
			hp = new Home_Page(driver);
		}
		return hp;
	}
	
	private Summary s;
	public Summary getInstances() {
		if(s == null) {
			s = new Summary(driver);
		}
		return s;
	}
	
	private Address a;
	public Address getInstancea() {
		if (a == null) {
			a= new Address(driver);
		}
		return a;
	}
	
	private Shipping sh;
	public Shipping getInstancesh() {
		if(sh == null) {
			sh = new Shipping(driver);
		}
		return sh;
	}
	
	private Payment p;
	public Payment getInstancep() {
		if(p == null) {
			p = new Payment(driver);
		}
		return p;
	}
	
	private My_Account ma;
	public My_Account getInstancema() {
		if(ma == null) {
			ma = new My_Account(driver);
		}
		return ma;
	}
	
	private Sign_Out so;
	public Sign_Out getInstanceso(){
		if(so == null) {
			so = new Sign_Out(driver);
		}
		return so;
		
	}
}
