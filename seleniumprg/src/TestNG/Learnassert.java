package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Learnassert {

	WebDriver driver;

//		//Store current project workspace location in a string variable ‘path’
//		String path = System.getProperty("user.dir”);

	@BeforeTest
	public void SetDriver() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\svitikala\\Downloads\\library\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void verifyTitle() {
		driver.get("https://www.amazon.com");
		String ActualTitle = driver.getTitle();
		System.out.println("============" + ActualTitle);
		String ExpectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("Assert passed");
	}

	@AfterTest
	public void closedriver() {

		// closes the browser instance
		driver.close();

	}
}
