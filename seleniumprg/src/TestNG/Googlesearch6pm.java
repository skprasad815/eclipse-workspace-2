package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Googlesearch6pm {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
	}
  @Test
  public void googlesearch() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium webdriver",Keys.ENTER);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//h3[contains(text(),'Selenium Webdriver Tutorial ')]")).click();
	  
	  
	  
	  
  }
}
