package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.opera.core.systems.scope.protos.ExecProtos.ActionList.Action;

public class mouseoveract {
	WebDriver driver;
	  @Test
	  public void f() throws Exception {
		  
		Actions a=new Actions(driver);
			//mouse action
			WebElement str=driver.findElement(By.xpath("//div[text()='Add-ons']"));
			
			a.moveToElement(str).perform();
			Thread.sleep(5000);
			//driver.findElement(By.xpath("//div[text()='Friends and Family']")).click();
			driver.findElement(By.xpath("(//div[text()='Visa Services'])[1]")).click();
						Thread.sleep(2000);
						//a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
						//a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
			a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
			Thread.sleep(3000);
			//a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
			driver.findElement(By.linkText("Airports")).click();

	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Documents\\jarsIntern\\chromedriver.exe");
			driver = new ChromeDriver();
		  driver.get("http://spicejet.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }

	  @AfterTest
	  public void afterTest() {
	  }

}
