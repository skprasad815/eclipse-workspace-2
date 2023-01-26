package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class opera {
	public  WebDriver driver;
  @Test
  public void f() {
	 

  }
  @BeforeTest
  public void beforeTest() {
	  DesiredCapabilities capabilities = DesiredCapabilities.opera();  
//    capabilities.setCapability("opera.binary", " Absolute Path of Opera browser ");  
    capabilities.setCapability("opera.binary", "F:\\operadriver_win64.zip");   
    WebDriver driver = new OperaDriver(capabilities);
    driver.get("https://google.com");
    
  }
  

  @AfterTest
  public void afterTest() {
  }

}
