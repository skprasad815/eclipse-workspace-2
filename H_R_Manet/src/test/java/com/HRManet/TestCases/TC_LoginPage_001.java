package com.HRManet.TestCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.HRManet.PageObjects.LoginPage;

public class TC_LoginPage_001 extends BaseClass {

	@Test
	public void LoginTest () throws InterruptedException, IOException {
		
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		  // Initialize and wait till element(link) became clickable - timeout in 10 seconds
	  WebElement firstResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Username')]")));
		          
		  // Print the first result
		  System.out.println(firstResult.getText());
		  
		  LoginPage lp = new LoginPage(driver);
		  
	lp.setusername(user);
	logger.info("username entered");
	lp.setpassword(pass);
	logger.info("password entered");
	lp.ClickloginBtn();
	logger.info("login btn clicked");
	
	if(	driver.getTitle().equals("OrangeHRM")){
		Assert.assertTrue(true);
		logger.info("login test passed");
	}else 
	{
		captureScreenshot(driver, "LoginTest");
		Assert.assertTrue(false);
		logger.info("login test failed");
	}
	
		
	}	
	}
	

