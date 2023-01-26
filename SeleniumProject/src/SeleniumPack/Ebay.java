package SeleniumPack;


import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebay {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		Logger logger=Logger.getLogger("Ebay");
		PropertyConfigurator.configure("Log4j.properties");
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santo\\Desktop\\latestJars\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		logger.info("navigated to url");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//option[text()='Baby']")).click();
		WebElement selectElement = driver.findElement(By.id("gh-cat"));
		logger.info("search item");
		Select select = new Select(selectElement);
		select.selectByVisibleText("Baby");
		//select.selectByValue("2984");
		//select.selectByIndex(4);
		driver.findElement(By.id("gh-ac")).sendKeys("toys");
		logger.info("search toys");
		driver.findElement(By.id("gh-btn")).click();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		logger.info("forward page");
		driver.quit();
		logger.info("quit browser");
	}

}
