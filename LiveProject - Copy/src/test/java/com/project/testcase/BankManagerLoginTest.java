package com.project.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.project.base.TestBase;

public class BankManagerLoginTest extends TestBase {
@Test
	public void loginAsBankManager() throws InterruptedException {
	log.debug("Inside login test");
		driver.findElement(By.xpath(OR.getProperty("bml"))).click();
Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("addctr"))),"login not successful");
		
System.setProperty("org.uncommons.reportng.escape-output","false"); // for screenshot to show in html reportng
		log.debug("login successfully");
		Reporter.log("login successfully executed");
		Reporter.log("<a target=\"_blank\"href=\"C:\\Users\\santo\\Pictures\\Screenshots\\qqq.jpg\">Screenshot</a>");
	
}

	
	}

