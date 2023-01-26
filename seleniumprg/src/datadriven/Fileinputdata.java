package datadriven;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Fileinputdata {
	WebDriver driver;
	FileInputStream fi;
	Workbook w;
	Sheet s;
  @Test
  public void Gmail_Login() throws Exception {
	  
	  
	  fi=new FileInputStream("E:\\sari\\os\\sari.xls");
	  w=Workbook.getWorkbook(fi);
	  s=w.getSheet("Result");
	  driver.findElement(By.xpath(s.getCell(0,1).getContents())).sendKeys(s.getCell(1, 1).getContents());
	  driver.findElement(By.id(s.getCell(0,2).getContents())).click();
	  driver.findElement(By.id(s.getCell(0,3).getContents())).sendKeys(s.getCell(1,3).getContents());
	  driver.findElement(By.id("signIn")).click();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://gmail.com");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
