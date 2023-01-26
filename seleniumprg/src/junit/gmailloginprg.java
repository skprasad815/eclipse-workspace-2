package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmailloginprg {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver=new FirefoxDriver();
		 
		 driver.get("http://gmail.com");
		 driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void gmaillogin() throws Exception {
		driver.findElement(By.id("Email")).sendKeys("saritha03.chary");
		 driver.findElement(By.id("next")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("Passwd")).sendKeys("saritha123");
		Thread.sleep(20000);
		
		 driver.findElement(By.linkText("vitikala.saritha@gmail.com")).click();
		 driver.findElement(By.linkText("Sign out")).click();
	}

}
