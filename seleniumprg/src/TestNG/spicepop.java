package TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class spicepop {
	WebDriver driver;
	public void verifySearch(String a, String c, String i) throws Exception{
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[5]/td[2]/a")).click();
		  Thread.sleep(1000);
		  new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText(a);
		  new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText(c);
		  new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant"))).selectByVisibleText(i);
		  driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		  Thread.sleep(7000);			
	}
  @Test(description="Verify the oneway search")
  public void test1() throws Exception{
	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	  
	  verifySearch("3 Adults","1 Child","1 Infant");
	  
  }
  @Test(description="Verify the currency converter popup")
  public void test2() throws Exception{
		String str=driver.getWindowHandle();
		driver.findElement(By.linkText("Currency Converter")).click();
		Thread.sleep(2000);
		Set<String> w=driver.getWindowHandles();
		
		Object s[]=w.toArray();
		driver.switchTo().window(s[1].toString());
		System.out.println(w);
new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency"))).selectByVisibleText("US Dollar(USD)");
new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency"))).selectByVisibleText("Indian Rupee(INR)");
		driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount")).sendKeys("100");
		driver.findElement(By.id("CurrencyConverterCurrencyConverterView_ButtonConvert")).click();
		Thread.sleep(3000);
		//driver.close();
		driver.findElement(By.id("ButtonCloseWindow")).click();
		driver.switchTo().window(s[0].toString());
new Select(driver.findElement(By.id("AvailabilitySearchInputSelectViewdestinationStation1"))).selectByVisibleText("Ahmedabad (AMD)");
}
  /*driver.findElement(By.linkText("Currency Converter")).click();
	Thread.sleep(2000);
	Set<String> windows=driver.getWindowHandles();
	System.out.println(windows);
	System.out.println(driver.getTitle());
	Object s[]=windows.toArray();
	Iterator<String> itererator = windows.iterator();   

   String mainWinID = itererator.next();
    String  newAdwinID = itererator.next();
    String new2winID= itererator.next();

    driver.switchTo().window(newAdwinID);
    System.out.println(driver.getTitle());
    Thread.sleep(2000);
    Thread.sleep(3000);
	driver.switchTo().window(s[1].toString());
	new Select(driver.findElement(By.xpath("//*[@id='CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency']"))).selectByVisibleText("US Dollars(USD)");
	new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency"))).selectByVisibleText("Indian Rupee(INR)");
	driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount")).sendKeys("100");
	driver.findElement(By.id("CurrencyConverterCurrencyConverterView_ButtonConvert")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("ButtonCloseWindow")).click();
	//driver.close();
	
	driver.switchTo().window(mainWinID);
	new Select(driver.findElement(By.id("AvailabilitySearchInputSelectViewdestinationStation1"))).selectByVisibleText("Ahmedabad (AMD)");	
  }*/
	@BeforeTest
public void beforeTest() {
		driver=new FirefoxDriver();
		/*System.setProperty("webdriver.chrome.driver", "F:\\chrome\\chromedriver.exe");	
		driver=new ChromeDriver();*/
  driver.get("http://spicejet.com");
  driver.manage().window().maximize();
}

@AfterTest
public void afterTest() {
}

}


