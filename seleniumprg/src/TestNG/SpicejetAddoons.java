package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SpicejetAddoons {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {

		  System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://spicejet.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver); 
		 WebElement asson=driver.findElement(By.xpath("//div[text()='Add-ons']"));
		 act.moveToElement(asson).build().perform();
		 
		 driver.findElement(By.xpath("//div[text()='Taxi Services']")).click();
		 WebElement down=driver.findElement(By.xpath("//a[text()='Track Your Bag']"));
		act.sendKeys(Keys.PAGE_DOWN);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		//down.click();
		
		
		
		
		
	}
}
