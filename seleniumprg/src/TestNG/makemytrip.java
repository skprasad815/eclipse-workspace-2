package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class makemytrip {
	public WebDriver driver;

	@Test
	public void onewaytrip() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("(//p[text()='Hyderabad, India'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='To']")).click();
	}
}
