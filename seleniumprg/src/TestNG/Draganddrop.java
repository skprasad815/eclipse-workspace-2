package TestNG;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public interface Draganddrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();

		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		

		WebElement draggable = driver.findElement(By.id("draggable"));

		WebElement droppable = driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(draggable, droppable).perform();
		
		

		/*
		 * Actions action = new Actions(driver); action.contextClick(droppable);
		 * //action.m //action.dragAndDropBy(draggable, 110, 230).build().perform();
		 * action.dragAndDrop(draggable, droppable).perform();
		 */
		// action.dragAndDrop(draggable, droppable).perform();

	}
}
