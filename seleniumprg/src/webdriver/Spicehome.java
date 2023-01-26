package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Spicehome {
	WebDriver driver;
	
	  @Test
	  public void verifytextbox() {
		 // String str;
		 // List<WebElement> str=
		  List<WebElement> str=driver.findElements(By.tagName("select"));
		  System.out.println(str.size());
	  
	  for (int i = 0; i < str.size(); i++) {
		  System.out.println(str.get(i).getAttribute("class"));
		  System.out.println(str.get(i).getText());
		
	}}
	  @BeforeTest
	  public void beforeTest() {
		  driver=new FirefoxDriver();
		  driver.get("http://spicejet.com");
	  }

	  @AfterTest
	  public void afterTest() {
	  }

	}
