package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class gmailxpath {
	WebDriver driver;
  @Test
  public void f() {
	 /* System.setProperty("webdriver.chrome.driver", "F:\\chrome\\chromedriver.exe");
	  driver=new ChromeDriver();*/
	  driver=new FirefoxDriver();
	  driver.get("http://gmail.com");
	  //driver.findElement(By.xpath("//input[@id='Email' and @placeholder='Enter your email']")).sendKeys("hi");
	  XPath: //button[starts-with(@id, 'continue-')] 
	  driver.findElement(By.xpath("//*[starts-with(@id,'Em')]")).sendKeys("hello");
  }
}
