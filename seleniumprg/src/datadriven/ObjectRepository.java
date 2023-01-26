package datadriven;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class ObjectRepository {
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook w;
	public Sheet s;
  @Test
  public void f() throws Exception{
	  fi=new FileInputStream("C:\\Users\\svitikala\\Downloads\\Classppts\\classdata\\keyworddata.xlsx");
	  w=Workbook.getWorkbook(fi);
	  s=w.getSheet("Sheet1");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	  for(int i=1;i<s.getRows();i++)
	  {
		  if(s.getCell(0, i).getContents()
				  		.equalsIgnoreCase("textbox"))
		  {		  
driver.findElement(By.id(s.getCell(1, i).getContents()))
				.sendKeys(s.getCell(2, i).getContents());
		  }
		  else if(s.getCell(0, i).getContents()
				  .equalsIgnoreCase("dropdown"))
		  {

new Select(driver.findElement
		(By.id(s.getCell(1, i).getContents())))
	.selectByVisibleText(s.getCell(2, i).getContents());					  
		  }
		  else if(s.getCell(0, i).getContents()
				  .equalsIgnoreCase("radiobutton"))
		  {
driver.findElement(By.id(s.getCell(1, i).getContents()))
											.click();
		  }
		  else if(s.getCell(0, i).getContents()
				  .equalsIgnoreCase("link"))
		  {
 driver.findElement(By.linkText(s.getCell(0, i).getContents()))
				.click();			  
		  }
		  else if(s.getCell(0, i).getContents()
				  .equalsIgnoreCase("button"))
		  {
 driver.findElement(By.id(s.getCell(0, i).getContents()))
				.click();			  
		  }
		  else if(s.getCell(0, i).getContents()
				  .equalsIgnoreCase("checkbox"))
		  {
 driver.findElement(By.id(s.getCell(0, i).getContents()))
				.click();			  
		  }
		  else if(s.getCell(1, i).getContents()
				  .equalsIgnoreCase("url"))
		  {
 driver.get(s.getCell(0, i).getContents());
		  }
		  else if(s.getCell(1, i).getContents()
				  .equalsIgnoreCase("wait"))
		  {
			  Thread.sleep(5000);
		  }
		  else if(s.getCell(0,i).getContents()
				  .equalsIgnoreCase("Button"))
		  {
			 driver. findElement(By.id(s.getCell(1, i).getContents())).click();
		  }
		  
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\svitikala\\Downloads\\library\\chrome\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	  driver.get("http://facebook.com");
	  driver.manage().window().maximize();
  }


}
