package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class maxmin  {
  @Test
  public void f() throws Exception {
	 
		 WebDriver driver;
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");
			driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 	
	 // driver.manage().window().maximinze();
	
	  driver.get("http://www.google.com/");
	  driver.manage().window().setSize(new Dimension(23, 23));
	  Thread.sleep(3000);//
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().setSize( new org.openqa.selenium.Dimension(343,5235));
	 // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //driver.manage().timeouts().implicitlyWait(-1, TimeUnit.SECONDS);new 
	 // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().setSize(new org.openqa.selenium.Dimension(34, 33));
	  //Thread.sleep(3000);
	 	 driver.manage().window().setSize(new org.openqa.selenium.Dimension(32, 24));
	 	//Thread.sleep(3000);
	  driver.manage().window().setSize(new org.openqa.selenium.Dimension(234, 452));
	  
//	  driver.manage().window().setSize(new org.openqa.selenium.Dimension(12, 212));
//			  driver.manage().window().setSize(new org.openqa.selenium.Dimension(123, 123));
//	  driver.manage().window().setSize(new org.openqa.selenium.Dimension(358, 234));
//	  //Thread.sleep(3000);
//	  driver.manage().window().setSize(new org.openqa.selenium.Dimension(588, 235));
//	  //Thread.sleep(3000);
	  driver.manage().window().setSize(new org.openqa.selenium.Dimension(50, 500)); 
	  //Thread.sleep(2000);
	  driver.manage().window().setPosition(new org.openqa.selenium.Point(350, 432));
	 // Thread.sleep(2000);
	  driver.manage().window().setPosition(new org.openqa.selenium.Point(543, 762));
	  //Thread.sleep(2000);
	  driver.manage().window().setPosition( new Point(233,324));
	  }
  
}

