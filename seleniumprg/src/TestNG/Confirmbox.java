package TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Confirmbox {
	WebDriver driver;
  @Test
  public void f() {
	  driver.switchTo().frame("iframeResult");
	 // driver.switchTo().frame("iframeResult");
	  driver.findElement(By.xpath("//button[text()='Try it']")).click();
	  Alert alt=driver.switchTo().alert();
	  System.out.println(alt.getText());
	  alt.accept();
	  
	// alt.dismiss();//cancel
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
	  driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
