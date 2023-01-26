package TestNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class windowhandle {
	 static WebDriver driver;
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\santo\\Desktop\\latestJars\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();

	driver.get("http://ebay.com");
	driver.manage().window().maximize();
			String handle=driver.getWindowHandle();     
		      driver.findElement(By.linkText("Motors")).click();
		      Set <String> handles=driver.getWindowHandles();
		      for (String Newwindow : handles) {
		          if(!Newwindow.equals(handle))
		          {
		              driver.switchTo().window(Newwindow);
		          }
		          System.out.println(driver.getTitle());
		          
		      }
}
}
