package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Firstprg {
	public WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.id("lst-ib")).sendKeys("selenium");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  //driver=new firefoxdiriver();
	  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");	
		driver=new ChromeDriver();
	  driver.get("http://google.com");
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
