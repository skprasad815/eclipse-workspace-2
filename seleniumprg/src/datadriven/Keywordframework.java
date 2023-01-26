package datadriven;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import org.testng.annotations.BeforeTest;

import java.awt.List;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Keywordframework {
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook w;
	public Sheet s,s1;
  @Test
  public void verifyLogin()throws Exception {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  fi=new FileInputStream("E:\\WORKSPACE_10JUNE_730AM"
	  		+ "\\SeleniumAutomation\\OR\\keyworddata.xls");
	  w=Workbook.getWorkbook(fi);
	  s=w.getSheet("Sheet1");
	  driver.findElement(By.className(s.getCell(1, 1).getContents()))
		.sendKeys(s.getCell(3,1).getContents());
 
	  
		  /*java.util.List<WebElement> str=driver.findElements(By.className("text"));
		  System.out.println(str.size());
		  for (int i = 1; i < str.size(); i++) {
			//System.out.println(str.get(i).getAttribute("id"));
			  driver.findElement(By.className(s.getCell(2,i).getContents())).sendKeys(s.getCell(3,i).getContents());*/
		}

/*driver.findElement(By.id(s.getCell(0, 1).getContents()))
	}					.sendKeys("selenium");*/
 

  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://facebook.com");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
