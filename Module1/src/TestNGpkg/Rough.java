package TestNGpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rough {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\santo\\Desktop\\latestJars\\chrome\\chromedriver.exe");
		driver =new ChromeDriver();
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("laptop");
	List<WebElement> list = driver.findElements(By.xpath("//span[normalize-space()='laptop']"));
	System.out.println("list items are"+ list.size());
	for(int i=0;i<list.size();i++) {
	System.out.println((list.get(i).getText()));	
	driver.close();
	}
	
	
	}

}
