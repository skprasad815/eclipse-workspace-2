package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Explicitywaitprg {
	static WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");
	   driver = new ChromeDriver();
	  driver.get("https://google.com/ncr");
	  driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
	  
	  WebDriverWait wait=new WebDriverWait(driver, 10);
	  // Initialize and wait till element(link) became clickable - timeout in 10 seconds
	  WebElement firstResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
	          
	  // Print the first result
	  System.out.println(firstResult.getText());
	    
  }
}
