package TestNGpkg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	@Test
	public void f() throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\santo\\Desktop\\latestJars\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/web-table-element.php#");

		// No of column
		List col = driver.findElements(By.xpath("//table[@class='dataTable']//tr//th"));
		System.out.println("No of colum ns are:" + col.size());
		
		// No of rows
		List rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr//td[1]"));
		System.out.println("No of rows ns are:"+ rows.size());
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[4]/td[1]/a[1]")).click();
		
		
	}
}
