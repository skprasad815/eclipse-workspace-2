package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class selectvalue {
	public WebDriver driver;
	  @Test
	  public void f() {
		  String id="ctl00_mainContent_ddl_Adult";
		  
	List<WebElement> s=new Select(driver.findElement(By.id(id))).getOptions();
			//new Select(driver.findElement(By.id(id))).getOptions();
		System.out.println(s.size());
		for (int i = 0; i < s.size(); i++) {
			if(s.get(i).getText().equalsIgnoreCase("5 Adults"))
			{		
	new Select(driver.findElement(By.id(id))).selectByVisibleText(s.get(i).getText());	
			}		
			if(!s.get(i).getText().equalsIgnoreCase("5 Adults"))
			{
			System.out.println(s.get(i).getText());		
			}
		}
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\svitikala\\Downloads\\library\\chrome\\chromedriver.exe");	
			driver=new ChromeDriver();
		  driver.get("http://spicejet.com");
		  driver.manage().window().maximize();
	  }

}
