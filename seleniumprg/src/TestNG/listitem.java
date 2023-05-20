package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class listitem {
	static WebDriver driver;

	public static void main(String arg[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\santo\\Desktop\\latestJars\\chrome\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santo\\Desktop\\latestJars\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http:www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("automation");
		Thread.sleep(2000);
List<WebElement> list =driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
		System.out.println("the elements are :");
		
		
		/*for (WebElement ele:list) {
			System.out.println(ele.getText());*/
		
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
		String listitem =list.get(i).getText();
		
	System.out.println(listitem);
			/*if(listitem.contains("automation meaning")){
				list.get(i).click();*/
			
			}
					
	}
}
