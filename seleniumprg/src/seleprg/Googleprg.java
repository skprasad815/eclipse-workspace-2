package seleprg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googleprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver;
		 driver=new FirefoxDriver();
		 driver.get("http://asksearch.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//*[@id='srch_q']")).sendKeys("selenium");
		// driver.findElement(By.linkText("Selenium WebDriver")).click();
		 
		
		
	}

}
