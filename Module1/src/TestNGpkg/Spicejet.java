package TestNGpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Spicejet {
	@Test
	public void onewaytrip() throws Exception {
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\santo\\Desktop\\latestJars\\chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.spicejet.com");
			/*
			 * driver.findElement(By.xpath("//div[text()='one way']")).click();
			 * driver.findElement(By.xpath("//div[text()='From']")).click();
			 * driver.findElement(By.xpath("//div[text()='From']")).sendKeys("Hyd",Keys.
			 * ENTER); driver.findElement(By.xpath("//div[text()='To']")).click();
			 * driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
			 */

			driver.findElement(By.xpath("//div[text()='one way']")).click();
			driver.findElement(By.xpath("//div[text()='From']")).click();
			driver.findElement(By.xpath("//div[text()='From']")).sendKeys("Hyd", Keys.ENTER);
			driver.findElement(By.xpath("//div[text()='To']")).click();
			driver.findElement(By.xpath("//div[text()='Chennai']")).click();
			driver.findElement(By.xpath("(//div[text()='18'])[1]")).click();
			// driver.findElement(By.xpath("//div[text()='Passengers']")).click();

			driver.findElement(By.xpath("//div[text()='Currency']")).click();
			driver.findElement(By.xpath("//div[text()='USD']")).click();
			driver.findElement(By.xpath("//*[text()='Armed Forces']")).click();
			
		//	driver.findElement(By.xpath("//div[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")).click();
		Set<String> originalwindow=driver.getWindowHandles();
		driver.get("https://www.spicejet.com");
	}
}
