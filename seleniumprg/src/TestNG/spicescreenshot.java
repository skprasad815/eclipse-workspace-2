package TestNG;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class spicescreenshot {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");	
		driver=new ChromeDriver();
	  driver.get("http://www.google.com/");
	  
	//Take the screenshot
	  //File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType<X>)
	 File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)
	  FileUtils.copyFile(screenshot, screenshot)
      File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      //FileUtils.cop
      
      //Copy the file to a location and use try catch blootck to handle exception
     //FileUtils.cop
          FileUtils.copyFile(screenshot, new File("C:\\\\Users\\\\LENOVO\\\\Desktop\\\\Classppts\\\\Screenshot\\homePageScreenshotq112.png"));
          
      
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
