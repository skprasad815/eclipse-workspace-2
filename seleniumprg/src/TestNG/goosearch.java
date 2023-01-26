package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class goosearch {
	WebDriver driver;
  @Test
  public void googlesearch() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\svitikala\\Downloads\\library\\geckodriver.exe");	
		driver=new FirefoxDriver();
	  driver.get("http://google.com");
	  driver.findElement(By.name("q")).sendKeys("selenum");
	
	  
  }
}
