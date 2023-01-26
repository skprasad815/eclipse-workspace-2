package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadStep1 {
	  public WebDriver driver;
		public FileInputStream fi;
		public Workbook w;
		public Sheet s;
  @Test
  public void f() throws IOException, BiffException {
	 
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\svitikala\\Downloads\\library\\geckodriver.exe");	
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
	  
		fi=new FileInputStream("C:\\Users\\svitikala\\Downloads\\Classppts\\classdata\\gmaillogin1.xls");
		w=Workbook.getWorkbook(fi);
		s=w.getSheet("Result");
		driver.findElement(By.id(s.getCell(0,0).getContents())).sendKeys(s.getCell(0,1).getContents());
		driver.findElement(By.className(s.getCell(1,0).getContents())).click();
//		driver.findElement(By.id("identifierId")).sendKeys(s.getCell(0,1).getContents());
//		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	  
  }
}
