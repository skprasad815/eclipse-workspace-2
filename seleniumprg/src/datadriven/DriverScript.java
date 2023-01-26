package datadriven;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class DriverScript {
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook w;
	public Sheet s;
  @Test
  public void f() throws Exception{
	  fi=new FileInputStream("D:\\WORKSPACE_10JUNE_730AM"
	  + "\\SeleniumAutomation\\testdata\\gmailinfo.xls");
	  w=Workbook.getWorkbook(fi);
	  s=w.getSheet("Sheet2");
	  
	 
	  for(int i=1;i<s.getRows();i++)
	  {
		  if(s.getCell(2, i).getContents()
				  		.equalsIgnoreCase("textbox"))
		  {		  
driver.findElement(By.id(s.getCell(0, i).getContents()))
				.sendKeys(s.getCell(3, i).getContents());
		  }
		  else if(s.getCell(2, i).getContents()
				  .equalsIgnoreCase("dropdown"))
		  {

new Select(driver.findElement
		(By.id(s.getCell(0, i).getContents())))
	.selectByVisibleText(s.getCell(3, i).getContents());					  
		  }
		  else if(s.getCell(2, i).getContents()
				  .equalsIgnoreCase("radiobutton"))
		  {
driver.findElement(By.id(s.getCell(0, i).getContents()))
											.click();
		  }
		  else if(s.getCell(2, i).getContents()
				  .equalsIgnoreCase("link"))
		  {
 driver.findElement(By.linkText(s.getCell(0, i).getContents()))
				.click();			  
		  }
		  else if(s.getCell(2, i).getContents()
				  .equalsIgnoreCase("button"))
		  {
 driver.findElement(By.id(s.getCell(0, i).getContents()))
				.click();			  
		  }
		  else if(s.getCell(2, i).getContents()
				  .equalsIgnoreCase("checkbox"))
		  {
 driver.findElement(By.id(s.getCell(0, i).getContents()))
				.click();			  
		  }
		  else if(s.getCell(2, i).getContents()
				  .equalsIgnoreCase("url"))
		  {
 driver.get(s.getCell(0, i).getContents());
		  }
		  else if(s.getCell(2, i).getContents()
				  .equalsIgnoreCase("wait"))
		  {
			  Thread.sleep(5000);
		  }
		  
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
  }

}
