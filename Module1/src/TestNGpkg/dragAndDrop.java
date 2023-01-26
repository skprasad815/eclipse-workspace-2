package TestNGpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\santo\\Desktop\\latestJars\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");

		Thread.sleep(2000);
		WebElement draggable = driver.findElement(By.id("draggable"));
		Thread.sleep(2000);
		WebElement droppable = driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDrop(draggable, droppable).perform();

		/*
		 * Actions action = new Actions(driver); action.contextClick(droppable);
		 * //action.m //action.dragAndDropBy(draggable, 110, 230).build().perform();
		 * action.dragAndDrop(draggable, droppable).perform();
		 */
		// action.dragAndDrop(draggable, droppable).perform();

	}

}
