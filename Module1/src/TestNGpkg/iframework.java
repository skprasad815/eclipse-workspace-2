package TestNGpkg;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class iframework {
  @Test
  public void f() throws InterruptedException, IOException {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\santo\\Desktop\\latestJars\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
	  driver.get("https://netbanking.hdfcbank.com/netbanking/");
	  driver.switchTo().frame("login_page");
	  driver.findElement(By.name("fldLoginUserId")).sendKeys("ksanjay815");
	  
	  //assertion 12-12-22 45.0min
	  Assert.assertEquals(2, 2);	  
	  System.out.println("hello");
	  driver.switchTo().defaultContent();
	  ;

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
