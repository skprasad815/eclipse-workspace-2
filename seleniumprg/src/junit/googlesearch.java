/**
 * 
 */
package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author SARITHA
 *
 */
public class googlesearch {

	public WebDriver driver;
	@Before
	public void setUp() throws Exception {
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}

	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void googlesearch() {
		driver.findElement(By.id("lst-ib")).sendKeys("selenium webdriver");
	}

}
