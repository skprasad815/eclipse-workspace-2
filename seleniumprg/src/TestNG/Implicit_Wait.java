package TestNG;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Implicit_Wait {

	
	public static void main(String[] args) throws InterruptedException {

		  WebDriver driver;//interface
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\svitikala\\Downloads\\library\\chrome\\chromedriver.exe");	
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		// implicit and explicit wait
		// implicit wait -  global timout
		// explicit wait - not a global timeout but - specific to an element
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)//overloading
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement DynamicElement = 
				   (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("DynamicElement")));
		
		driver.get("http://yahoo.com");
		driver.findElement(By.xpath("//input[@id='p_13838465-p']")).sendKeys("hello");//2
		// implicit and explicit.im
		//Thread.sleep(4000);
		String text = driver.findElement(By.xpath("//*[starts-with(@id,'yui_3_4_0_1_13629')]/ul/li[1]/a")).getText();//3
		System.out.println(text);//10
		
		// WebDriverWait, FluentWait
		
		
		wait wait = 
				   new FluentWait(driver).withTimeout(60, SECONDS)
				   .pollingEvery(10, SECONDS)
				   .ignoring(NoSuchElementException.class);
				   
				   WebElement dynamicelement = wait.until(new Function<webdriver,webElement>() {
				   
				   public WebElement apply(WebDriver driver) {
				      return driver.findElement(By.id("dynamicelement"));
				   }
				});
		
		
		int i=10;
//		driver.get("https://google.com/ncr");
//		driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
//		// Initialize and wait till element(link) became clickable - timeout in 10 seconds
//		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
//		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
//		// Print the first result
//		System.out.println(firstResult.getText());

	}

}
