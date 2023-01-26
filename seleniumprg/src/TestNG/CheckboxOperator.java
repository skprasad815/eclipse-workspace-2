package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CheckboxOperator {
	WebDriver driver;

	@Test
	public void checkbox() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		 System.out.println();
		// driver.get("https://www.demoqa.com/automation-practice-form");
		driver.get("https://shopping.yahoo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("p")).sendKeys("toys",Keys.ENTER);

		/**
		 * Validate isSelected and click
		 */

		WebElement checkBoxSelected = driver
				.findElement(By.xpath("//input[@aria-label='adult' and  @type='checkbox']"));
		// "label[for='hobbies-checkbox-1']"));
		boolean isSelected = checkBoxSelected.isSelected();// true
		System.out.println(isSelected);
		// performing click operation if element is not selected
		if (isSelected == false) {
			checkBoxSelected.click();
		}

		
		WebElement checkboxDisplayed=driver
				.findElement(By.xpath("//input[@id='filter-opt-female' and  @type='checkbox']"));
		boolean isDiplayed=checkboxDisplayed.isDisplayed();
		/**
		 * Validate isDisplayed and click
		 */
		/*
		 * WebElement checkBoxDisplayed =
		 * driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]")); boolean
		 * isDisplayed = checkBoxDisplayed.isDisplayed();
		 * 
		 * // performing click operation if element is displayed if (isDisplayed ==
		 * true) { checkBoxDisplayed.click(); }
		 * 
		 *//**
			 * Validate isEnabled and click
			 *//*
				 * WebElement checkBoxEnabled =
				 * driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]")); boolean
				 * isEnabled = checkBoxEnabled.isDisplayed();
				 * 
				 * // performing click operation if element is enabled if (isEnabled == true) {
				 * checkBoxEnabled.click(); }
				 */

	}

}
