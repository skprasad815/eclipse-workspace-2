package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bookmyshow {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver=new FirefoxDriver();
		 
		 driver.get("http://bookmyshow.com");
		 driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		driver.findElement(By.linkText("Plays")).click();
		Thread.sleep(20000);
		
	//		driver.findElement(By.xpath("html/body/div[1]/div/div/header/div/div/div/div[3]/div[1]/ul/li[3]/div/div[1]/div[2]/div[1]/div[1]/div[1]/a/img")).click();
		driver.findElement(By.linkText("Tattoo Workshop by Sameer Patange ")).click();
		
	}

}
