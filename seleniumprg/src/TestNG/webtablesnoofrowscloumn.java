package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class webtablesnoofrowscloumn {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		 
		        driver.get("http://demo.guru99.com/test/web-table-element.php") ;   
		     
		        //No.of Column
		        List  col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		        System.out.println("No of cols are : " +col.size());
		        //No.of rows 
		        List  rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		        System.out.println("No of rows are : " + rows.size());
		        //move to 3rd row element
		        driver.findElement(By.xpath("//table[@class='dataTable']//tr[4]/td[1]")).click();
		        Thread.sleep(2000);
		        //driver.close();
  }
}
