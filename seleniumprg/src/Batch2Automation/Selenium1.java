package Batch2Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\LatestJar\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("selenium webdriver",Keys.ENTER);
		driver.findElement(By.xpath("(//div[contains(@class,'yuRUbf')]/a)[1]")).click();
		System.out.println("Successfully");
		driver.close();
		
		
		
	}

}
