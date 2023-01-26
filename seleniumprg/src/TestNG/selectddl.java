package TestNG;

import java.util.List;

import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class selectddl {
	public WebDriver driver;
	
	  @Test
	  public void f() throws Exception {
		  driver.findElement(By.xpath("//[@id='gh-cat']")).click();
		  Thread.sleep(5000);
		  //java.util.List<WebElement> all = driver.findElements(By.xpath("//select[@id='gh-cat']//option"));
		 // System.out.println(all.size());
		  
		  /*System.out.println(all.get(0).getText());
		  
		  List<WebElement> str=driver.findElements(By.tagName("select"));
		  System.out.println(str.size());*/
		  
		 List<WebElement> str1= new Select(driver.findElement(By.id("gh-cat"))).getOptions();
		  System.out.println(str1.size());
		}

	  
	  @BeforeTest
	  public void beforeTest() {
		  driver=new FirefoxDriver();
		  driver.get("http://ebay.in");
	  }

	  @AfterTest
	  public void afterTest() {
	  }

	}



		
	


