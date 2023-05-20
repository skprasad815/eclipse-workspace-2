package TestNGpkg;

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
		driver.findElement(By.name("q")).sendKeys("laptop");
		Thread.sleep(2000);
		//List<WebElement> list=driver.findElements(null)
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"jZ2SBf\"]/div[1]/span"));
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			
		}
		
	}

}
