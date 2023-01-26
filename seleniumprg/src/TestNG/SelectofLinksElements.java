package TestNG;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectofLinksElements {
	public static WebDriver driver;

	public static void main(String[] args) {
		  //Create WebDriver instance and open the website.
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\svitikala\\Downloads\\library\\geckodriver.exe");	
			driver=new FirefoxDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demoqa.com/links");
	      Actions act=new Actions(driver);
	      //act.
	      
	      String url="";
	      List<WebElement> allURLs = driver.findElements(By.tagName("a"));
	      System.out.println("Total links on the Wb Page: " + allURLs.size());
	 
	      //We will iterate through the list and will check the elements in the list.
	      Iterator<WebElement> iterator = allURLs.iterator();
	      while (iterator.hasNext()) {
	       url = iterator.next().getText();
	       System.out.println(url);
	      }
	      
	     //Close the browser session
	      driver.quit();
	    

	}

}
