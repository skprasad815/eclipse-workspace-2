package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ebayselect {
	WebDriver driver;
  @Test
  public void selectdata() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://ebay.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("gh-cat")).click();
		//Thread.sleep(2000);
		 /*Select dropdown=new Select(driver.findElement(By.xpath("//select[@id='gh-cat']")));
		 dropdown.selectByVisibleText("Cell Phones & Accessories");*/
		 
		  new Select(driver.findElement(By.xpath("//select[@id='gh-cat']"))).selectByVisibleText("Baby");
		//driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		//Thread.sleep(2000);
		driver.findElement(By.id("gh-btn")).click();
		driver.findElement(By.xpath("//p[text()='Feeding']")).click();
		 driver.manage().window().maximize();
		 JavascriptExecutor jsx = (JavascriptExecutor)driver;
		 jsx.executeScript("window.scrollBy(0,1105)", ""); //scroll down
		 driver.findElement(By.xpath("//h3[contains(text(),'Sab Simplex Baby Drops')]")).click();
		
	  
  }
}
