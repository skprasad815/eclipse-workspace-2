package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Informationcommands {
	public WebDriver driver;
	  @Test
	  public void f() {
		  String str=driver.findElement(By.linkText("Gmail")).getText();
		  System.out.println(str);
		  String str1=driver.findElement(By.name("btnK")).getAttribute("class");
		 System.out.println(str1);
		 //div[@class='str1']
		 driver.findElement(By.xpath("//a[text()='"+str+"']")).click();
		  //String str2=driver.findElement(By.id("hplogo")).getAttribute("title");
		  //System.out.println(str2);
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");	
			driver=new ChromeDriver();
		 
			driver.get("http://google.com");
			//driver.findElement(By.name("q")).sendKeys("doctor near me",Keys.ENTER);
		  driver.manage().window().maximize();
	  }
}
