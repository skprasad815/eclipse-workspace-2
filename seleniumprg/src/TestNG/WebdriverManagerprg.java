package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManagerprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//version 4
		
		/*
		 * ChromeOptions chromeOptions = new ChromeOptions();
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver(chromeOptions);
		 * 
		 * // Navigate to the demoqa website driver.get("https://www.demoqa.com");
		 */
		//verion 5
		
		ChromeOptions chromeOptions1 = new ChromeOptions();
		  WebDriver driver1= WebDriverManager.chromedriver().create();
		// webWebDriver driver = new ChromeDriver(chromeOptions);
		
		// Navigate to the demoqa website
		driver1.get("https://www.google.com");
	}

}
