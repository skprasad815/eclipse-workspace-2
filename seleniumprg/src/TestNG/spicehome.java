package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class spicehome {
	public  WebDriver     driver;
	  @Test
	  public void f() throws Exception {
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@title='Hotels']")).click();
		   
		  driver.findElement(By.id("ctl00_mainContent_txtOriginStation1_MST")).sendKeys("Delhi");
		 Thread.sleep(2000);
		 
		  
		  //java.util.List<WebElement > str= new Select(driver.findElement(By.xpath(".//*[@id='destination']")));
		  driver.findElement(By.name("ctl00$mainContent$txt_Fromdate_MST")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td[@data-month='10']//a[text()='25']")).click();
		Thread.sleep(2000);
		//new Select(driver.findElement(by.xpath("ddd"))).sel
				 new Select(driver.findElement(By.xpath("//select[@ id='ddl_Adult_MST']"))).selectByVisibleText("2");	
		 driver.findElement(By.name("ctl00$mainContent$ButtonSubmit_MST")).click();
		 
//		 
//		String s[]=str.split("\n");
//		System.out.println(s.length);
//		
//		
//		  
//		 for (int i = 0; i < s.length; i++) {
//			 
//				 driver.findElement(By.xpath(".//*[@id='destination']")).clear();
//				 driver.findElement(By.xpath(".//*[@id='destination']")).sendKeys(s[0]);
//				 
//				 //System.out.println(i+ driver.findElement(By.xpath(".//*[@id='destination']")).getText());
//			
//		}
//		 /* new Select(driver.findElement(By.className("b-selectbox__element"))).selectByVisibleText("13");
//		  new Select(driver.findElement(By.className("b-selectbox__element"))).selectByVisibleText("13");
//		 */
//		 driver.findElement(By.className("b-date-selector__control b-date-selector__control-datepicker b-datepicker")).click();
	  }
	 
	@BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\svitikala\\Downloads\\library\\chrome\\chromedriver.exe");	
			driver=new ChromeDriver();
		  driver.get("http://spicejet.com");
		  driver.manage().window().maximize();
	  }

	  @AfterTest
	  public void afterTest() {
	  }

}
