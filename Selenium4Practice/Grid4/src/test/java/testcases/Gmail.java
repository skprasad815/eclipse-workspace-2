package testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Gmail {
	
	
	public WebDriver driver;
	public DesiredCapabilities cap = new DesiredCapabilities();
	
	
	@Parameters({"browser"})
	@Test
	public void launchBrowser(String browser) throws InterruptedException, MalformedURLException {
		
		
		
		if(browser.equals("chrome")) {
			
			
			cap.setPlatform(Platform.ANY);
			cap.setBrowserName("chrome");
			
			ChromeOptions options = new ChromeOptions();
			options.merge(cap);
			
			
			
		}else if(browser.equals("firefox")){
			
			cap.setBrowserName("firefox"); 
			cap.setPlatform(Platform.ANY);
		
			FirefoxOptions options = new FirefoxOptions();
			options.merge(cap);
		
		}else if(browser.equals("edge")){
			
			cap.setBrowserName(BrowserType.EDGE); 
			cap.setPlatform(Platform.ANY);
		
			EdgeOptions options = new EdgeOptions();
			options.merge(cap);
		}
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444/"),cap);
	
		
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("Title from the browser : "+browser+"   "+driver.getTitle());
		//driver.findElement(By.name("identifier")).sendKeys("java@way2automation.com");
		
		driver.quit();
	}

}
