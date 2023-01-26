package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");	
		driver=new ChromeDriver();
	  driver.get("http://google.com");
	 driver.manage().window().maximize();
	 WebElement search=driver.findElement(By.name("q"));
	   search.sendKeys("selenium");
	   driver.findElement(By.xpath("//a[text()='Gmail']")).click();
	  
	}

}
