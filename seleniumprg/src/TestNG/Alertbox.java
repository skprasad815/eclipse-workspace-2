package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Alertbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://jsbin.com/usidix/1");

		String alertMessage = "";
		driver.findElement(By.xpath("/html/body/input")).click();
		 alertMessage =driver.switchTo().alert().getText();
		 System.out.println("Alert box message ="+alertMessage);
		 driver.switchTo().alert().accept();
		
		driver.quit();

	}
}
