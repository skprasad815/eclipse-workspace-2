package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class iframework {
  @Test
  public void f() throws IOException {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
	 
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.251933833.1053954207.1607355307-1478689280.1606927522");
		driver.switchTo().frame("login_page");
		driver.findElement(By.name("fldLoginUserId")).sendKeys("333");
		//Assert.assertEquals(2, 3);
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	      //FileUtils.cop
	      
	      //Copy the file to a location and use try catch blootck to handle exception
	     //FileUtils.cop
	          FileUtils.copyFile(screenshot, new File("C:\\\\Users\\\\LENOVO\\\\Desktop\\\\Classppts\\\\Screenshot\\hdfc.png"));
		System.out.println("hello");
		driver.switchTo().defaultContent();
//		driver.switchTo().frame("footer");
//		driver.findElement(By.xpath("//a[text()='Terms and Conditions']")).click();
		
  }
}
