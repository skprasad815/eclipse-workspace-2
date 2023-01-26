package TestNG;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class newtab {
	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Documents\\jarsIntern\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("//a[text()='Gmail']"));
		act.moveToElement(link).contextClick().sendKeys("T").build().perform(); // open link in new tab
		//act.sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER)).build().perform();// switch to new tab by pressing control+tab
		act.sendKeys(Keys.CONTROL +"TAB").build().perform();
		// Thread.sleep(3000); // simply wait for 3sec to see new tab open or not
		String main = driver.getWindowHandle();
		String child = driver.getWindowHandle(); // driver.switchTo().window(main);//switch control to new tab
		Thread.sleep(2000);
		// act.sendKeys(Keys.chord(Keys.CONTROL,Keys.F4)).perform(); //press control+f4
		// to close tab
		driver.switchTo().window(child);
		driver.findElement(By.xpath("(//a[contains(text(),' Sign in')])[2]")).click();
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("hello"); // confirm that control is in new
																						// tab or not, just send few
																						// words in Email box
		act.sendKeys(Keys.chord(Keys.CONTROL, Keys.SHIFT, Keys.TAB)).perform(); // open previous tab
		driver.switchTo().window(main); // switch control to previous tab
		driver.findElement(By.name("q")).sendKeys("i am in previous tab"); // confirm that control is in previous tab or
																			// not, just send few words in google search
																			// box

	}
}
