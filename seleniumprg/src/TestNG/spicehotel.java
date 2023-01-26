package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class spicehotel {
	public  WebDriver     driver;
	  @Test
	  public void f() throws Exception {
		  driver.findElement(By.xpath(".//*[@id='mainContents']/div[4]/div[2]/ul/li[2]/a")).click();

		 driver.findElement(By.id("PnrExamplePopUp")).click();
		
		 driver.findElement(By.linkText("Close ")).click();
		 driver.findElement(By.id("ControlGroupRetrieveBookingView_BookingRetrieveInputRetrieveBookingView_ConfirmationNumber")).sendKeys("p2derrd");
		 driver.findElement(By.id("ControlGroupRetrieveBookingView_BookingRetrieveInputRetrieveBookingView_CONTACTEMAIL1")).sendKeys("vitikala.saritha@gmail.com");
		  
		/*  //java.util.List<WebElement > str= new Select(driver.findElement(By.xpath(".//*[@id='destination']")));
		driver.findElement(By.xpath(".//*[@id='destination']")).sendKeys("ramada");
		Thread.sleep(2000);
		 String str= driver.findElement(By.xpath(".//*[@id='b2indexPage']/ul")).getText();
		 System.out.println(str);
		 
		String s[]=str.split("\n");
		System.out.println(s.length);
		
		
		  
		 for (int i = 0; i < s.length; i++) {
			 
				 driver.findElement(By.xpath(".//*[@id='destination']")).clear();
				 driver.findElement(By.xpath(".//*[@id='destination']")).sendKeys(s[0]);
				 
				 //System.out.println(i+ driver.findElement(By.xpath(".//*[@id='destination']")).getText());
			
		}
		 
		  new Select(driver.findElement(By.className("b-selectbox__element"))).selectByVisibleText("13");
		  new Select(driver.findElement(By.className("b-selectbox__element"))).selectByVisibleText("13");
		 
		 driver.findElement(By.className("b-date-selector__control b-date-selector__control-datepicker b-datepicker")).click();
	  }*/
	  }
	  @BeforeTest
	  public void beforeTest() {
		  driver=new FirefoxDriver();
		  driver.get("http://spicejet.com");
		  driver.manage().window().maximize();
	  }

	  @AfterTest
	  public void afterTest() {
	  }

	
}
