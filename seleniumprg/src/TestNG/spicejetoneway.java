package TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class spicejetoneway {
	public WebDriver driver;

	@Test
	public void onewaytrip() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[text()='one way']")).click();
		driver.findElement(By.xpath("//div[text()='From']")).click();
		driver.findElement(By.xpath("//div[text()='From']")).sendKeys("hy");
		driver.findElement(By.xpath("//div[text()='Hyderabad']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[text()='To']//following::div")).sendKeys("blr");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.xpath("(//div[text()='18'])[1]")).click();
		driver.findElement(By.xpath("//div[text()='Currency']")).click();
		driver.findElement(By.xpath("//div[text()='USD']")).click();
		
		/*
		 * driver.findElement(By.xpath("//div[text()='one way']")).click();
		 * driver.findElement(By.xpath("//div[text()='From']")).click();
		 * driver.findElement(By.xpath("//div[text()='Chennai International Airport']"))
		 * .click(); driver.findElement(By.xpath("//div[text()='Hyderabad']")).click();
		 * 
		 * 
		 * driver.findElement(By.xpath("(//div[text()='18'])[1]")).click();
		 * //Thread.sleep(2000); ////
		 * driver.findElement(By.xpath("//div[text()='INR']")).click();
		 * 
		 * // driver.findElement(By.xpath("//div[text()='USD']")).click();
		 * 
		 * Thread.sleep(6000); //WebDriverWait wait = new WebDriverWait(driver,30); //
		 * new WebDriverWait(wait(),
		 * 10).until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("//div/div[text()='Search Flight']"))).click(); //
		 * wait.until(ExpectedConditions.elementToBeClickable(By.
		 * xpath("//div/div[text()='Search Flight']")));
		 * 
		 * WebElement
		 * search=driver.findElement(By.xpath("//div/div[text()='Search Flight']"));
		 * search.click(); //
		 * driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).
		 * click(); // driver.findElement(By.linkText("Hyderabad (HYD)")).click(); // //
		 * driver.findElement(By.partialLinkText(" Goa (GOI)")).click(); //
		 *///

		/*
		 * 
		 * 
		 * // driver.findElement(By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).
		 * click(); driver.findElement(By.xpath(
		 * "//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		 * driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		 * Thread.sleep(1000);
		 * driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		 * Thread.sleep(1000); driver.findElement(By.xpath(
		 * "(//div[@data-testid='undefined-calendar-day-27'])[1]")).click();
		 * //"/html/body/div/div[1]/table/tbody/tr[4]/td[7]/a")).click();
		 * Thread.sleep(1000);
		 * 
		 * 
		 * driver.findElement(By.id("divpaxinfo")).click(); new
		 * Select(driver.findElement(By.name("ctl00$mainContent$ddl_Adult"))).
		 * selectByIndex(2); // new
		 * Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).
		 * selectByVisibleText("2"); // new
		 * Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).
		 * selectByValue("2");;
		 * driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		 */

		/*
		 * driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']"))
		 * .click(); driver.findElement(By.xpath(
		 * "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]"
		 * )).sendKeys("Hyd"); driver.findElement(By.xpath(
		 * "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div/div[2]/input"
		 * )).sendKeys("DEL"); driver.findElement(By.xpath(
		 * "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div[4]/div[1]/div"
		 * )).click(); driver.findElement(By.xpath(
		 * "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div[4]/div[6]/div"
		 * )).click(); driver.findElement(By.xpath(
		 * "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[6]/div/div[2]/div[2]/div/div[2]/div/div/div[2]/div"
		 * )).click(); driver.findElement(By.xpath(
		 * "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")).
		 * click(); Thread.sleep(2000); driver.findElement(By.
		 * xpath("//div[@class='css-1dbjc4n r-1tf5bf9 r-1777fci r-1ww30s9']")).click();
		 * 
		 * ((JavascriptExecutor) driver).executeScript("arguments[0].click()", str);
		 * 
		 * WebElement promptAlert = driver.switchTo().activeElement();
		 * System.out.println(promptAlert); Thread.sleep(2000);
		 * //driver.getWindowHandles(); //Get handles of the windows String
		 * mainWindowHandle = driver.getWindowHandle(); Set<String> allWindowHandles =
		 * driver.getWindowHandles(); Iterator<String> iterator =
		 * allWindowHandles.iterator();
		 * 
		 * // Here we will check if child window has other child windows and will fetch
		 * the heading of the child window while (iterator.hasNext()) { String
		 * ChildWindow = iterator.next(); if
		 * (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
		 * driver.switchTo().window(ChildWindow); WebElement str=driver.findElement(By.
		 * xpath("//div[@class='css-1dbjc4n r-1tf5bf9 r-1777fci r-1ww30s9']//*[local-name()='svg']"
		 * )); // System.out.println("Heading of child window is " + str.getText());
		 * str.click();
		 * driver.findElement(By.xpath("(//div[text()='Continue'])[2]")).click(); } }
		 */
	}
}
