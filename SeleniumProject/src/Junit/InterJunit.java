package Junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InterJunit {
	static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("browser");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santo\\Desktop\\latestJars\\chrome\\chromedriver.exe");
	 driver=new ChromeDriver();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	System.out.println("close");
	driver.close();
	
	}

	@Before
	public void setUp() throws Exception {
	System.out.println("before method");
	driver.get("https://www.ebay.com");
	}

	@After
	public void tearDown() throws Exception {
	System.out.println("after method");
	}

	@Test
	public void test() {
		System.out.println("mainly functionality");
		
		WebElement selectElement = driver.findElement(By.id("gh-cat"));
        Select select = new Select(selectElement);
		select.selectByVisibleText("Baby");
		//select.selectByValue("2984");
		//select.selectByIndex(4);
		driver.findElement(By.id("gh-ac")).sendKeys("toys");
		driver.findElement(By.id("gh-btn")).click();
		driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/div/span")).click();
	}
		@Test
		public void test1() {
			
			System.out.println("mainly functionality 1");	
	}

}
