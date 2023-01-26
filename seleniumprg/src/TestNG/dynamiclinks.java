package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dynamiclinks {
	WebDriver driver;
	  @Test
	  public void f() {
		   

		   

		  //Get all links of page 
		  List<WebElement> allLinks = driver.findElements(By.tagName("a")); 
		  for(int i =0; i<allLinks.size(); i++) 
		  { 
			  
			  
		  //make sure you get the text of only visible links and not hidden links 
		  if(allLinks.get(i).getText()!=null){ 
		 // System.out.println(allLinks.get(i).getAttribute("id")); 
			  
			  System.out.println(allLinks.get(i).getText());
		  }
		  System.out.println(allLinks.size());
		  }
			  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");	
			driver=new ChromeDriver();
		 
			
		  driver.get("http://google.com");
	  }

	  @AfterTest
	  public void afterTest() {
	  }

	}

