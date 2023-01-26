package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Validation {
	public WebDriver driver;
	  @Test
	  public void f() {
	List<WebElement> str=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).getOptions();
			//new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).getOptions();
	System.out.println(str.size());
	for (int i = 0; i < str.size(); i++) {
		if(str.get(i).getText().equalsIgnoreCase("5 Adults"))
		{
		System.out.println(str.get(i).getText());
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText(str.get(i).getText());
		}
	}
	  }
	  @BeforeTest
	  public void beforeTest() {
		  driver=new FirefoxDriver();
		  driver.get("http://spicejet.com");
		  driver.manage().window().maximize();
	  }
	}
