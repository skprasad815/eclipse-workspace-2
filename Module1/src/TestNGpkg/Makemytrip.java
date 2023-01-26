package TestNGpkg;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Makemytrip {
	static WebDriver driver;

	@Test
	public void roundtrip() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\santo\\Desktop\\latestJars\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		/*
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[1]")).click();
		 * driver.findElement(By.xpath("//span[text()='From']")).sendKeys("Bengaluru",
		 * Keys.ENTER);
		 * driver.findElement(By.xpath("//p[text()='Hyderabad, India']")).click();
		 * driver.findElement(By.xpath("//span[text()='To']")).click();
		 * driver.findElement(By.xpath("//p[text()='Bengaluru, India, India']")).click()
		 * ;
		 */
		// Enter source city
		// driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Pune",Keys.ENTER);

		// Enter destination city

		// driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("Mumbai",Keys.ENTER);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//input[@id='fromCity']"))).build().perform();
driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Pune",Keys.ENTER);
		driver.close();
	}
}
