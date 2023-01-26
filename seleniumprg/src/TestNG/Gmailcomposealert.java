package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Gmailcomposealert {
	public WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  driver.findElement(By.id("Email")).sendKeys("saritha03.chary");
		 driver.findElement(By.id("next")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("Passwd")).sendKeys("saritha123");
		 driver.findElement(By.id("signIn")).click();
		  String alertMessage = "";
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=':it']/div/div")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id=':nx']")).click();
        //driver.findElement(By.xpath("html/body/div[28]/div[3]/button")).click(); 
        
		alertMessage = driver.switchTo().alert().getText();
	     driver.switchTo().alert().accept();
	     	
		/* driver.findElement(By.linkText("vitikala.saritha@gmail.com")).click();
		 driver.findElement(By.linkText("Sign out")).click();
	*/
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "F:\\chrome\\chromedriver.exe");
		 driver = new ChromeDriver();
	  driver.get("http://gmail.com");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
