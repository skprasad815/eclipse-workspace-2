package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");	
			driver=new ChromeDriver();
			driver.get("http://google.com");
			
			driver.findElement(By.xpath("//")).sendKeys("selenium");
			//input[@id='lst-ib']
	}

}
