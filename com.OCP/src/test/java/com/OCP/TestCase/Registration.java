package com.OCP.TestCase;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;



public class Registration extends BaseTest {


	@Test(priority=1) // (invocationCount = 2, threadPoolSize=2)
		public void RegistrationWithValidCredentials() {
			
			driver.findElement(By.name("firstname")).sendKeys("sanjay kumar");
			driver.findElement(By.name("lastname")).sendKeys("prasad");
			driver.findElement(By.id("input-email")).sendKeys("ksanjay815@gmail.com");
			driver.findElement(By.id("input-telephone")).sendKeys("8121295214");
			driver.findElement(By.name("password")).sendKeys("ksanjay815");
			driver.findElement(By.name("confirm")).sendKeys("ksanjay815");
			driver.findElement(By.name("agree")).click();
			driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
	}
	
	@Test(priority=2)
	public void RegistrationWithValidCredentialsWithEnterKey() {
		
		driver.findElement(By.name("firstname")).sendKeys("sanjay kumar");
		driver.findElement(By.name("lastname")).sendKeys("prasad");
		driver.findElement(By.id("input-email")).sendKeys("ksanjay815@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("8121295214");
		driver.findElement(By.name("password")).sendKeys("ksanjay815");
		driver.findElement(By.name("confirm")).sendKeys("ksanjay815");
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).sendKeys(Keys.ENTER);
		
}
			@Test(priority=3)
			public void RegistrationSuccessfulWithMinOf1CharacterforFirstName() 
			{
				driver.findElement(By.name("firstname")).sendKeys("s");
				driver.findElement(By.name("lastname")).sendKeys("prasad");
				driver.findElement(By.id("input-email")).sendKeys("ksanjay815@gmail.com");
				driver.findElement(By.id("input-telephone")).sendKeys("8121295214");
				driver.findElement(By.name("password")).sendKeys("ksanjay815");
				driver.findElement(By.name("confirm")).sendKeys("ksanjay815");
				driver.findElement(By.name("agree")).click();
				driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();	
				
			}
			@Test(priority=4)
			public void RegistrationSuccessfulWithAlphaNumericAndSpecialCharacterforFirstName() 
			{
				driver.findElement(By.name("firstname")).sendKeys("San@123");
				driver.findElement(By.name("lastname")).sendKeys("prasad");
				driver.findElement(By.id("input-email")).sendKeys("ksanjay815@gmail.com");
				driver.findElement(By.id("input-telephone")).sendKeys("8121295214");
				driver.findElement(By.name("password")).sendKeys("ksanjay815");
				driver.findElement(By.name("confirm")).sendKeys("ksanjay815");
				driver.findElement(By.name("agree")).click();
				driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();	
				
			}
			@Test(priority=5)
			public void RegistrationSuccessfulWith32CharacterforFirstName() 
			{
				driver.findElement(By.name("firstname")).sendKeys("Sangjhejrkbndlhiebvbjgjdfjdhjdhd");
				driver.findElement(By.name("lastname")).sendKeys("prasad");
				driver.findElement(By.id("input-email")).sendKeys("ksanjay815@gmail.com");
				driver.findElement(By.id("input-telephone")).sendKeys("8121295214");
				driver.findElement(By.name("password")).sendKeys("ksanjay815");
				driver.findElement(By.name("confirm")).sendKeys("ksanjay815");
				driver.findElement(By.name("agree")).click();
				driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();	
				
			}
			@Test(priority=6)
			public void RegistrationFailedWith33CharacterforFirstName() throws InterruptedException 
			{
				driver.findElement(By.name("firstname")).sendKeys("IsabelleZgvbchvhjbdfdghjzxrfyhcgjhkjlkl:l.hkhbrhbfcgjhn");
				driver.findElement(By.name("lastname")).sendKeys("prasad");
				driver.findElement(By.id("input-email")).sendKeys("ksanjay815@gmail.com");
				driver.findElement(By.id("input-telephone")).sendKeys("8121295214");
				driver.findElement(By.name("password")).sendKeys("ksanjay815");
				driver.findElement(By.name("confirm")).sendKeys("ksanjay815");
				driver.findElement(By.name("agree")).click();
				driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();	
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
				// verifying error message
				
				// Step 1				
				String actualerror = driver.findElement(By.xpath("//div[@class='text-danger']")).getText();
				String expectederror =	"First Name must be between 1 and 32 characters!";
				Assert.assertEquals(actualerror, expectederror, "Test not passed");
				
				/*
				 * Step 2 String expectedTitle =
				 * "First Name must be between 1 and 32 characters!"; String actualTitle =
				 * driver.getTitle(); if (actualTitle.equals(expectedTitle)) { System.out.
				 * println("Test case 1 passed: Amazon India home page loads successfully"); }
				 * else { System.out.
				 * println("Test case 1 failed: Amazon India home page did not load successfully"
				 * ); }
				 */
				
			}
			@Test(priority=7)
			public void RegistrationWithSpacesinCharacterforFirstName() throws InterruptedException 
			{
				driver.findElement(By.name("firstname")).sendKeys("Sanjay kumar");
				driver.findElement(By.name("lastname")).sendKeys("prasad");
				driver.findElement(By.id("input-email")).sendKeys("ksanjay815@gmail.com");
				driver.findElement(By.id("input-telephone")).sendKeys("8121295214");
				driver.findElement(By.name("password")).sendKeys("ksanjay815");
				driver.findElement(By.name("confirm")).sendKeys("ksanjay815");
				driver.findElement(By.name("agree")).click();
				driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();	
				Thread.sleep(2000);
			
			
			}
			@Test(priority=8)
			public void RegistrationWithNOCharacterforFirstName() throws InterruptedException 
			{

				driver.findElement(By.name("lastname")).sendKeys("prasad");
				driver.findElement(By.id("input-email")).sendKeys("ksanjay815@gmail.com");
				driver.findElement(By.id("input-telephone")).sendKeys("8121295214");
				driver.findElement(By.name("password")).sendKeys("ksanjay815");
				driver.findElement(By.name("confirm")).sendKeys("ksanjay815");
				driver.findElement(By.name("agree")).click();
				driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();	
				Thread.sleep(2000);
			
				// verifying error message
				
				String actualerror = driver.findElement(By.xpath("//div[@class='text-danger']")).getText();
				String expectederror =	"First Name must be  1 and 32 characters!";
				Assert.assertEquals(actualerror, expectederror, "Test not passed");
				System.out.println("test passed");
				
		}

}