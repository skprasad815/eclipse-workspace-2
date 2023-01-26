package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ebayprg {
	static WebDriver driver;

	@Test
	public void ebayproduct() {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");	
			driver=new ChromeDriver();

		String url = "https://www.ebay.com/";

		// To maximise the browser
		driver.manage().window().maximize();
		driver.get(url);

		// search for single product and display name
		ebayprg.searchProduct("Apple watches", "Cell Phones & Accessories");
		
		System.out.println("*************************");
		// searching all product
		ebayprg.searchAllProduct();

	}
@Test
	public static void searchProduct(String product, String category) {

		driver.findElement(By.id("gh-ac")).sendKeys(product);

		WebElement dropElement = driver.findElement(By.id("gh-cat"));

		Select dropdown = new Select(dropElement);

		dropdown.selectByVisibleText("Cell Phones & Accessories");

		driver.findElement(By.id("gh-btn")).click();

		String result = driver.findElement(By.className("s-item__title")).getText();

		System.out.println("Result is : " + result);

	}
@Test

	public static void searchAllProduct() {
		List<WebElement> allProduct = driver.findElements(By.xpath("//ul[@class='srp-results srp-list clearfix']/li"));

		for (WebElement product : allProduct) {

			System.out.println(product.getText());

			System.out.println("*********************************************************************");
		}
	}
}
