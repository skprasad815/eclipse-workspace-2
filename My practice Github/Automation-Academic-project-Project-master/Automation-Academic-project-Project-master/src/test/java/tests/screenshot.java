// intentionally failing test to show screenshot

package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.Base;

public class screenshot extends Base {
	
	public WebDriver driver ;
	
	@Test
	public void screensht() throws IOException, InterruptedException {
		
		System.out.println("screenshot");
		driver = initializeBrowser();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		Thread.sleep(3000);
		
		Assert.assertTrue(false);
		
		
	}
	
	public void closingBrowser() {
		driver.close();
	}

}
