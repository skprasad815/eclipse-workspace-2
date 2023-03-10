package com.inetBanking.testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	
	@Test 
	public void LoginTest() {
	
	driver.get(url);
	logger.info("URL is opened");
	
	LoginPage lp= new LoginPage(driver);	
		lp.setusername(user);
		logger.info("enter username");
		lp.setpassword(pass);
		logger.info("enter password");
		lp.clickLoginbtn();
		logger.info("login button clicked");
		if(	driver.getTitle().equals("GTPL Bank Manager HomePage")){
			Assert.assertTrue(true);
			logger.info("login test passed");
		}else 
		{
			Assert.assertTrue(false);
			logger.info("login test failed");
		}
		
		}
		
	}
	
		

