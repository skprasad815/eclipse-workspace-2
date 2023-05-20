package TestNG;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interviewtogetlistofurl {
	 static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\santo\\\\Desktop\\\\latestJars\\\\chrome\\\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("doctor near me",Keys.ENTER);
		Thread.sleep(2000);
		//List<WebElement> str=driver.findElements(null)
		List<WebElement> str=driver.findElements(By.xpath("//*[@class='iUh30 qLRx3b tjvcx']"));
		System.out.println(str.size());
		for (int i = 0; i < str.size(); i++) {
			System.out.println(str.get(i).getText());
			
		}
		
	}

}
