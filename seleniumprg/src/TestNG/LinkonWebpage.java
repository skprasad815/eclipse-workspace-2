package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkonWebpage {
	WebDriver driver;
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		List< WebElement> alllinks=(List<WebElement>) driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		for(int i=0;i<alllinks.size();i++)
		{
			//System.out.println(alllinks.get(i).getText());
			if(alllinks.get(i).getText()!=null)
			{
				System.out.println(alllinks.get(i).getText());
			}
				
		}
  }
}
