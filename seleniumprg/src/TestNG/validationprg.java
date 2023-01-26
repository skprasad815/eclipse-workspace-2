package TestNG;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class validationprg {
	public WebDriver driver;
	public static String selenium;
  @Test(enabled=false)
  public void f() {
	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	  if(driver.findElement(By.id("ctl00_mainContent_txt_Todate")).isDisplayed())
	  {
		  System.out.println("Available");
	  }else{
		  System.out.println("Not available");
	  }
  }
  @Test
  public void verifyUsername(){
		/*
		 * if(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isDisplayed())
		 * { System.out.println("Available"); }else{
		 * System.out.println("Not available"); }
		 * 
		 * if(driver.isElementPresent("f_idppp")) { System.out.println("Available");
		 * }else{ System.out.println("Not available"); }
		 */
	  
	  Assert.assertEquals(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isDisplayed(), false);	 
	  Assert.assertEquals("2", "2");
	  //Assert.
	  //
	 //Assert.assertEquals(selenium.isElementPresent("ctl00_mainContent_rbtnl_Trip_1"), true);
  }
  @BeforeTest
  public void beforeTest() {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\svitikala\\Downloads\\library\\chrome\\chromedriver.exe");	
		driver=new ChromeDriver();
	 // selenium=new WebDriverBackedSelenium(driver, "http://spicejet.com");
	  driver.get("http://spicejet.com");
	  driver.manage().window().maximize();
  }

}
