package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class opennewtab {
  @Test
  public void f() {
	  DesiredCapabilities capability = DesiredCapabilities.firefox();
      WebDriver driver = new FirefoxDriver();
      driver.get("http://www.google.com");
      Actions act = new Actions(driver);
      WebElement link = driver.findElement(By.id("gb_70"));
      act.moveToElement(link).contextClick().sendKeys("T").perform();
      
  }
}
