package com.project.testcase;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.project.base.TestBase;

public class AddCustomerTest extends TestBase {

	@Test(dataProvider="getData")
	public void addCustomer(String firstName, String lastName, String postCode, String alerttext) {
		log.debug("entering the details of customer");
		driver.findElement(By.xpath(OR.getProperty("addctr"))).click();
		driver.findElement(By.xpath(OR.getProperty("firstname"))).sendKeys(firstName);
		driver.findElement(By.xpath(OR.getProperty("lastname"))).sendKeys(lastName);
		driver.findElement(By.xpath(OR.getProperty("postcode"))).sendKeys(postCode);
		driver.findElement(By.xpath(OR.getProperty("add"))).click();
		log.debug(" customer added successfully");
	}
	
	@DataProvider
	public Object[][] getData() {
		String sheetName="AddCustomerTest";
		
		int rows =excel.getRowCount(sheetName);
		int cols =excel.getColumnCount(sheetName);
		Object[][] data =new Object[rows-1][cols];
		
		
		for(int rowNum=2;rowNum<=rows;rowNum++) {   //2
			for(int colNum=0;colNum<cols;colNum++)	{
				
			//data[0][0]	
			data[rowNum-2][colNum]=excel.getCellData(sheetName,colNum, rowNum);
		}
		
		
	}
	return data;
	
	}
}
