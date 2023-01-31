package com.HRManet.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;

	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement LoginBtn;
	
	public void setusername(String uname) {
		username.sendKeys(uname); }
		
		public void setpassword(String pwd) {
			password.sendKeys(pwd);}
			
			public void ClickloginBtn() {
				LoginBtn.click();
	}
	
}
