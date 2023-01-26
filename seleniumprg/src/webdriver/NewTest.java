package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  WebDriver driver=new FirefoxDriver();
		 driver.get("http://ebay.com");
		 driver.manage().window().maximize();
		 
		 List<WebElement> tr=new Select(driver.findElement(By.id("gh-cat"))).getOptions();
		  
		 // java.util.List<WebElement>tr= new Select(driver.findElement(By.id("gh-cat"))).getOptions();
		  System.out.println(tr.size());
		    WebElement str=(WebElement) new Select( driver.findElement(By.xpath("//*[@id='gh-cat']/option[4]")));
		    str.click();
  }
}
