package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickactions {
	WebDriver driver;
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Documents\\jarsIntern\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("http://google.com");
		
		 WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
		 Actions act=new Actions(driver);
		 //act.co
		 act.contextClick(gmail).perform();
  }
}
