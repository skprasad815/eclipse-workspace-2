package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googlesearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
	      driver.manage().window().maximize();
	      //driver.findElement(By.xpath("//div[@id='gs_lc0']/input")).sendKeys("selenium");
	      driver.findElement(By.id("lst-ib")).sendKeys("selenium");
	      
	      driver.close();
		
	}

}
