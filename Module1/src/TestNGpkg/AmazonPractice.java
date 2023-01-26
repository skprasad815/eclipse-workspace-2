package TestNGpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonPractice {
	WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("open browser");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\santo\\Desktop\\latestJars\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(2000);

		driver.get("https://www.amazon.in");
		
		
		/*
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/header[1]/div[1]/div[3]/div[13]/div[2]/a[1]/span[1]"
		 * )) .click(); driver.findElement(By.id("ap_email")).sendKeys("8121295214",
		 * Keys.ENTER);
		 * 
		 * driver.findElement(By.id("ap_password")).sendKeys("ksanjay815");
		 * 
		 * driver.findElement(By.id("signInSubmit")).click(); Actions act = new
		 * Actions(driver); act.moveToElement(driver.findElement(By.xpath(
		 * "//span[@id='nav-link-accountList-nav-line-1']"))).build() .perform();
		 * driver.findElement( By.xpath(
		 * "/html[1]/body[1]/div[1]/header[1]/div[1]/div[3]/div[3]/div[2]/div[1]/div[2]/a[2]/span[1]"
		 * )) .click();
		 * 
		 * // for scrolling JavascriptExecutor jsx = (JavascriptExecutor) driver;
		 * jsx.executeScript("window.scrollBy(0,2588)", " "); // scroll down
		 * jsx.executeScript("window.scrollBy(0,0)", " ");
		 * driver.findElement(By.linkText("Gift Ideas")).click();
		 * jsx.executeScript("window.scrollBy(0,500)", " ");
		 * driver.findElement(By.xpath(
		 * "//body/div[@id='a-page']/div[@id='reactApp']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[6]/figure[1]/div[1]/a[1]/div[1]/div[1]/img[1]"
		 * )) .click(); driver.findElement(By.id("gc-buy-box-atc")).click();
		 * 
		 * act.moveToElement(driver.findElement(By.xpath(
		 * "//span[@id='nav-link-accountList-nav-line-1']"))).build() .perform();
		 * driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]")).click();
		 * driver.close();
		 */
		
		driver.findElement(By.xpath("//a[contains(text(),\"Today's Deals\")]")).click();
		
		JavascriptExecutor jsx = (JavascriptExecutor) driver;
		jsx.executeScript("window.scrollBy(0,1000)", " ");
		driver.findElement(By.xpath("//body/div[@id='a-page']/div[@id='slot-15']/div[@id='slot-15']/div[1]/div[1]/div[2]/div[2]/span[6]/li[3]/label[1]/input[1]")).click();
	}

}
