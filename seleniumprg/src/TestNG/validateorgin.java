package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class validateorgin {
	public WebDriver driver;
	  @Test
	  public void f() {
		  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		String str;  
	str=driver.findElement(By.xpath(".//*[@id='citydropdown']/tbody/tr[2]/td[2]")).getText();
	System.out.println(str);
	System.out.println("---------------------------------");
	String s[]=str.split("\n");
	System.out.println(s.length);
		for (int i = 0; i < s.length; i++) {
			//System.out.println(s[i]);
			if(s[i].equalsIgnoreCase("Hyderabad    (HYD)"))
			{
				System.out.println("Available :"+s[i]);
			}
			else if(s[i].equalsIgnoreCase("Bengaluru (BLR)"))
			{
				System.out.println("Available :"+s[i]);
			}
			else if(s[i].equalsIgnoreCase("Chennai (MAA)"))
			{
				System.out.println("Available :"+s[i]);
			}
		}
	  }
	  @BeforeTest
	  public void beforeTest() {
		  driver=new FirefoxDriver();
		  driver.get("http://spicejet.com");
		  driver.manage().window().maximize();
	  }

}
