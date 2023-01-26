package SeleniumPack;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\santo\\Desktop\\latestJars\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		/*
		 * driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys(
		 * "snakes"); // search option driver.findElement(By.xpath(
		 * "//body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[2]/div[1]/aside[1]/div[1]/div[1]/div[1]/form[1]/div[1]/span[2]/span[2]/input[1]"
		 * )) .click();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.id("field1")).clear(); // clear contents
		 * driver.findElement(By.id("field2")).sendKeys("sanjay");
		 * 
		 * driver.switchTo().frame("frame-one1434677811"); // using frame
		 * 
		 * driver.findElement(By.id("RESULT_TextField-1")).sendKeys("sanjaykumar");
		 * driver.findElement(By.id("RESULT_TextField-2")).sendKeys("prasad");
		 * driver.findElement(By.id("RESULT_TextField-3")).sendKeys("8121295214");
		 * driver.findElement(By.id("RESULT_TextField-4")).sendKeys("india");
		 * driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Hyderabad");
		 * driver.findElement(By.id("RESULT_TextField-6")).sendKeys("emailid");
		 * driver.navigate().refresh();
		 * 
		 * JavascriptExecutor jsx = (JavascriptExecutor) driver;
		 * 
		 * // jsx.executeScript("window.scrollby(0,3050", "")
		 * jsx.executeScript("window.scrollBy(0,500)", ""); // scroll down
		 * 
		 * WebElement drag = driver.findElement(By.xpath(
		 * "//body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[3]/div[1]/aside[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[1]"
		 * ));
		 * 
		 * WebElement drop = driver.findElement(By.xpath("//div[@id='trash']")); // drag
		 * and drop
		 * 
		 * Actions act = new Actions(driver); act.dragAndDrop(drag, drop).perform();
		 * 
		 * WebElement draggable1 = driver.findElement(By.id("draggable")); // drag and
		 * drop delete Thread.sleep(2000); WebElement droppable1 =
		 * driver.findElement(By.id("droppable")); Thread.sleep(2000); Actions act1 =
		 * new Actions(driver); act1.dragAndDrop(draggable1, droppable1).perform();
		 * 
		 * driver.switchTo().frame("frame-one1434677811"); // for radio button in frame
		 * driver.findElement(By.cssSelector("#q26 tr:nth-child(1) label")).click();
		 * driver.findElement(By.cssSelector("tr:nth-child(3) label")).click();
		 * driver.switchTo().defaultContent(); Thread.sleep(1000);
		 * 
		 * driver.navigate().refresh();
		 * 
		 * driver.findElement(By.id("datepicker")).click(); // date select
		 * driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		 * driver.findElement(By.xpath("//a[contains(text(),'26')]")).click();
		 * 
		 * driver.findElement(By.id("files")).click(); // using dropdown { WebElement
		 * dropdown = driver.findElement(By.id("speed"));
		 * dropdown.findElement(By.xpath("//option[contains(text(),'Medium')]")).click()
		 * ;
		 * 
		 * driver.findElement(By.id("files")).click(); { WebElement dropdown1 =
		 * driver.findElement(By.id("files"));
		 * dropdown1.findElement(By.xpath("//option[contains(text(),'PDF file')]")).
		 * click(); } driver.findElement(By.id("number")).click(); { WebElement
		 * dropdown2 = driver.findElement(By.id("number"));
		 * dropdown2.findElement(By.xpath("//option[contains(text(),'3')]")).click(); }
		 * driver.findElement(By.id("products")).click(); { WebElement dropdown3 =
		 * driver.findElement(By.id("products"));
		 * dropdown3.findElement(By.xpath("//option[contains(text(),'Iphone')]")).click(
		 * ); } driver.findElement(By.id("animals")).click(); { WebElement dropdown4 =
		 * driver.findElement(By.id("animals"));
		 * dropdown4.findElement(By.xpath("//option[contains(text(),'Big Baby Cat')]")).
		 * click(); }
		 * 
		 * driver.switchTo().frame("frame-one1434677811"); // drop down in frame
		 * driver.findElement(By.id("RESULT_RadioButton-9")).click(); WebElement
		 * dropdown5 = driver.findElement(By.id("RESULT_RadioButton-9"));
		 * dropdown5.findElement(By.xpath("//option[. = 'Evening']")).click(); }
		 * 
		 * driver.switchTo().frame("frame-one1434677811"); // file upload
		 * driver.findElement(By.id("RESULT_FileUpload-10")).click();
		 * driver.findElement(By.id("RESULT_FileUpload-10")).sendKeys(
		 * "C:\\Users\\santo\\Pictures\\Screenshots");
		 */

		// driver.findElement(By.xpath("//span[contains(text(),'Message####
		// 1234567')]")).getText();

		String alertMessage = ""; // alert msg
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		alertMessage = driver.switchTo().alert().getText();
		System.out.println("Alert box message =" + alertMessage);
		driver.switchTo().alert().accept();

		// JavascriptExecutor jsx1 = (JavascriptExecutor) driver;
		// jsx1.executeScript("window.scrollBy(1000,1300)", ""); // scroll down

		// mouse slider
		/*
		 * WebElement mouseSlider =
		 * driver.findElement(By.xpath("//*[@id=\"slider\"]/span")); Actions action =
		 * new Actions(driver); action.dragAndDropBy(mouseSlider, 0, 60);
		 */

		// drop down another method
		WebElement selectElement = driver.findElement(By.id("speed"));
		Select select = new Select(selectElement);
		select.selectByVisibleText("Medium");

		// click on external link
		driver.switchTo().frame("frame-one1434677811");
		driver.findElement(By.xpath("//*[@id=\"FSForm\"]/div[2]/div[27]/a[1]")).click();

		driver.navigate().back();
		
		// No of column
		List<WebElement> col = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
		System.out.println("No of colum ns are:" + col.size());

		// No of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr//td[1]"));
		System.out.println("No of rows ns are:" + rows.size());
		driver.navigate().back();
	
	
	}

}
