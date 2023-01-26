package datadriven;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Login_OR {
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook w;
	public Sheet s,s1;
  @Test
  public void verifyLogin()throws Exception {
	  fi=new FileInputStream("E:\\WORKSPACE_10JUNE_730AM"
	  		+ "\\SeleniumAutomation\\OR\\login_OR.xls");
	  w=Workbook.getWorkbook(fi);
	  s=w.getSheet("Sheet1");
	  
driver.findElement(By.id(s.getCell(0, 1).getContents()))
						.sendKeys("saritha03.chary");
driver.findElement(By.id
		(s.getCell(1, 1).getContents())).click();
	Thread.sleep(3000);
driver.findElement(By.id
(s.getCell(2, 1).getContents())).sendKeys("saritha123");
driver.findElement(By.id
		(s.getCell(3, 1).getContents())).click();
	Thread.sleep(8000);  
  }
  @Test
  public void verifyLogout(){
	  s1=w.getSheet("Sheet2");
	  driver.findElement(By.linkText
			  (s1.getCell(0, 1).getContents())).click();
	  driver.findElement(By.id
			  (s1.getCell(0, 2).getContents())).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://gmail.com");
	  driver.manage().window().maximize();
  }


}
