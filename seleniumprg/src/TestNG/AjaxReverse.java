package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AjaxReverse {
	public WebDriver driver;
	
	  @Test
	  public void Verifytext() {

	      //verify 'International Flights' text is there in the web page or not
		  String expText= " Flights";
		  String actText=driver.findElement(By.xpath("html/body/div[1]/div[1]/ul/li[1]/a/span")).getText();
		  if (actText.contains(expText)) {
			  System.out.println("1)expected text'"+expText+"' present in  the web page.");
			  }
			  else
				  
			  System.out.println("1)Expected text'"+expText+"' is not present in the webpage");
			
		
	  //second way to verify by using getpagesource method
	 
	  String str=driver.getPageSource();
	  if(str.contains(expText))
	  {
		  System.out.println("2) Expected text '"+expText+"' present in the web page.");
	  }else{
	      System.out.println("2) Expected text '"+expText+"' is not present in the web page.");
	    
	  }
	  
		 
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");	
			driver=new ChromeDriver();
		  driver.get("http://www.goibibo.com/");
		  driver.manage().window().maximize();
		  
	  }

	  @AfterTest
	  public void afterTest() {
	  }


}
