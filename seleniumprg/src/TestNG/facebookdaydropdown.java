package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class facebookdaydropdown {
	WebDriver driver; 
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.get("http://facebook.com");
		//group of elements
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		//Thread.sleep(2000);
		//ctrl+shift+0 to load all imports file
		//single based on condition
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='birthday_day']")));
	    
	    Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)							
				.withTimeout(30, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);
	    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='birthday_day']")));
		Select s = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		s.selectByValue("18");
		
  }
}
