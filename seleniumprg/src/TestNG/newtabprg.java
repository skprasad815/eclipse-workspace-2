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

public class newtabprg {
	 public static void main(String[] args) throws AWTException, InterruptedException {
		 WebDriver driver;
	       
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Documents\\jarsIntern\\chromedriver.exe");
			driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://www.google.co.in/?gfe_rd=cr&ei=dGKEU8HNCqeOiAenwoDgAQ");
	        Actions act = new Actions(driver);
	        WebElement link= driver.findElement(By.linkText("Gmail"));
	        
	        act.moveToElement(link).contextClick().sendKeys("T").perform();
	        //act.sendKeys(Keys.chord(Keys.CONTROL,Keys.TAB)).perform();
	        act.sendKeys(Keys.chord(Keys.CONTROL,Keys.TAB)).build().perform();
	        String mainwn = driver.getWindowHandle();
	        driver.switchTo().window(mainwn);
	        String child = driver.getWindowHandle();
	        driver.switchTo().window(child);
	        driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("hello"); //click on a 'Show all posts' link of main tab to confirm we are in main tab
	        act.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,Keys.TAB)).perform(); //open previous tab
	        driver.switchTo().window(child); //switch control to previous tab
	        driver.findElement(By.name("q")).sendKeys("i am in previous tab"); //confirm that control is in previous tab or not, just send few words in google search box
	        
		 
		  
		 
		 
		  
	     
	    }
}
