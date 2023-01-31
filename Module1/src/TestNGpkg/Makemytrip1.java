package TestNGpkg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip1 {
	static WebDriver driver;

	@Test
	public void roundtrip() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\santo\\Desktop\\latestJars\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//li[@class='selected']//span[@class='tabsCircle appendRight5']")).click();
	
		// selecting from city
		
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Guwahati");
		Thread.sleep(2000);
		List<WebElement> list =driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
		
	System.out.println("the elements are :");
		/*for (WebElement ele:list) {
		System.out.println(ele.getText());*/
	
	System.out.println(list.size());
	for(int i=0;i<list.size();i++) {
	String listitem =list.get(i).getText();
	
System.out.println(listitem);
		if(listitem.contains("Guwahati")){
			list.get(i).click();
			
			// selecting To city
			
			driver.findElement(By.id("toCity")).click();
			driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Ahmedabad");
			Thread.sleep(2000);
			List<WebElement> list1 =driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li/div/div"));
			
		System.out.println("the elements are :");
			/*for (WebElement ele:list) {
			System.out.println(ele.getText());*/
		
		System.out.println(list1.size());
		for(int i1=0;i1<list1.size();i1++) {
		String listitem1 =list1.get(i1).getText();
		
	System.out.println(listitem);
			if(listitem1.contains("Ahmedabad")){
				list1.get(i1).click();
				
			
			
		
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[3]")).  click();
		  driver.findElement(By.xpath("//div[@aria-label='Fri Feb 24 2023']//div[@class='dateInnerCell']")).
		  click();
		  driver.findElement(By.cssSelector("li[data-cy='adults-2']")).click();
		  driver.findElement(By.
		  xpath("//li[@class='font12 blackText latoBold wrapFilter activeItem ']")).
		  click();
		  driver.findElement(By.xpath("//a[normalize-space()='Search']")).click();
		 
	}
}}}
}}