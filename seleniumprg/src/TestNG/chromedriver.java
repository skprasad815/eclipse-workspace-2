package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class chromedriver {
	WebDriver driver ;
	  @Test
	  public void f() throws Exception {
		  driver.manage().window().maximize();
		  //driver.findElement(By.id(id))
		  driver.findElement(By.id("rdbCinema")).click();
			 driver.findElement(By.xpath(".//*[@id='cmbMovie']/div[1]/input")).click();
			 driver.findElement(By.xpath(".//*[@id='cmbMovie']/div[2]/div/ul[1]/li[2]")).click();
			
			 driver.findElement(By.xpath(".//*[@id='cmbMovieDate']/div[1]/input")).click();
			 
			 driver.findElement(By.xpath("html/body/div[1]/div/div/div[13]/div/div[2]/div/div[2]/div[2]/ul/li[2]/div/div[2]/div/ul/li[2]")).click();
			 Thread.sleep(20000);
			 driver.findElement(By.linkText("02:00 PM")).click();
			 new Select(driver.findElement(By.id("SLcmbQty"))).selectByVisibleText("1");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("html/body/div[3]/div[5]/div/div/div[4]/div[2]/div/table/tbody/tr[11]/td[2]/div[11]/img")).click();
	  } 
	  @BeforeTest
	  public void beforeTest() {
		 // driver=new FirefoxDriver();
		  //System.setProperty("webdriver.chrome.driver", value)
		 
			driver.get("http://in.bookmyshow.com/hyderabad");
			
	  }

	  @AfterTest
	  public void afterTest() {
	  }

}
