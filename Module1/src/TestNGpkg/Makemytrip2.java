package TestNGpkg;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Makemytrip2 {
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
		driver.navigate().refresh();
		driver.findElement(By.xpath("//li[@class='selected']//span[@class='tabsCircle appendRight5']")).click();
		driver.findElement(By.xpath("(//p[@class='font14 appendBottom5 blackText'][normalize-space()='Bangkok, Thailand'])[1]")).click();
		driver.findElement(By.xpath("(//p[@class='font14 appendBottom5 blackText'][normalize-space()='Mumbai, India'])[1]")).click();
		driver.findElement(By.xpath("//div[@aria-label='Tue Feb 14 2023']//p[contains(text(),'14')]")).click();
		driver.findElement(By.xpath("//div[@aria-label='Fri Feb 24 2023']//div[@class='dateInnerCell']")).click();
		driver.findElement(By.cssSelector("li[data-cy='adults-2']")).click();
		driver.findElement(By.xpath("//li[@class='font12 blackText latoBold wrapFilter activeItem ']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();
	
	}
}
