package seleprg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googlesearch {
	public WebDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		driver.findElement(By.name("btnG")).click();
		//driver.close();
		//driver.quit();
		
		
	}

}
