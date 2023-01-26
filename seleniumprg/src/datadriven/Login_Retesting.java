package datadriven;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.Selenium;

import jxl.Sheet;
import jxl.Workbook;

public class Login_Retesting {
	public WebDriver driver;
	public Selenium selenium;
	public FileInputStream fi;
	public Workbook w;
	public Sheet s;
  @Test
  public void f()throws Exception {
	  fi=new FileInputStream("E:\\WORKSPACE_10JUNE_730AM"
	  	+ "\\SeleniumAutomation\\testdata\\login.xls");
	  w=Workbook.getWorkbook(fi);
	  s=w.getSheet("login");
	  
	  for(int i=1;i<s.getRows();i++)
	  {
		  driver.findElement(By.name("username"))
		  		.sendKeys(s.getCell(0, i).getContents());
		  driver.findElement(By.name("password"))
		  		.sendKeys(s.getCell(1, i).getContents());
		  driver.findElement(By.name("submit")).click();
		  
		  if(selenium.isElementPresent("link=Logout"))
		  {
			  System.out.println("Valid Credential");
			  selenium.click("link=Logout");
			  Thread.sleep(3000);
		  }
		  else
		  {
			  System.out.println("Invalid credential");
			  Thread.sleep(3000);
		  }
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "F:\\chrome\\chromedriver.exe");	
		driver=new ChromeDriver();
	  //selenium new webd
	  selenium=new WebDriverBackedSelenium
			  (driver, "http://selenium4testing.com/hms");
	  driver.get("http://selenium4testing.com/hms");
	  driver.manage().window().maximize();
  }


}
