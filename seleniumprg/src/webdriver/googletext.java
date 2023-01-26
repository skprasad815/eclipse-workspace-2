package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googletext {
 public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("lst-ib")).sendKeys("selenium webdriver");
		//driver.findElement(By.id("")).click();
		//driver.close();
		//driver.quit();

	}

}
