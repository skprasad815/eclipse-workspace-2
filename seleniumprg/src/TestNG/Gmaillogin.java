package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmaillogin {
	public WebDriver driver;
 
	@BeforeTest 
	public void open()
	{
		/*WebDriver driver=new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://gmail.com");
			driver.manage().window().maximize();*/
	}
	@Test
  public void f() throws Exception {
		driver=new FirefoxDriver();
		
		/*System.setProperty("webdriver.chrome.driver", "F:\\chrome\\chromedriver.exe");
		  driver=new ChromeDriver();*/
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("saritha03.chary");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("saritha123");
		driver.findElement(By.id("signIn")).click();
	
		Thread.sleep(30000);
		//System.out.println("login sucessfully ");
		
		//driver.findElement(By.className("gb_7 gbii")).click();
		driver.findElement(By.xpath("html/body/div[7]/div[3]/div/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		driver.findElement(By.id("gb_71")).click();
		Thread.sleep(20000);
		System.out.println("loginout successfully");
		driver.findElement(By.id("account-chooser-link")).click();
		
		driver.findElement(By.id("edit-account-list")).click();
		
		driver.findElement(By.id("choose-account-0")).click();
		driver.findElement(By.id("edit-account-list")).click();
	}

  }

