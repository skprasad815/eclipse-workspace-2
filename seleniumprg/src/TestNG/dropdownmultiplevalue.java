package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdownmultiplevalue {
  @Test
  void f() throws InterruptedException {
	 WebDriver driver; 
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");	
		driver=new ChromeDriver();
	  
		driver.get("http://ebay.com");
		driver.manage().window().maximize();
		 Select s = new Select(driver.findElement(By.id("gh-cat")));
		//Select dropdown =driver.findElement(By.id("gh-cat"));
		 
		 //select one element from the dropdown
			/*
			 * Select dropdown=new Select(driver.findElement(By.id("gh-cat")));
			 * dropdown.selectByVisibleText("Books");
			 */
		 
		 //select multiple elements from the dropdown
		 List <WebElement> op = s.getOptions();
	      int size = op.size();
	      for(int i =0; i<size ; i++){
	         String options = op.get(i).getText();
	         System.out.println(options);
	         System.out.println(size);
		
	      }
      // isMultiple() returns a boolean value
      boolean result = s.isMultiple();
      System.out.println(result);
      
	      
      driver.close();
  }
}
