package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class step1 {
  public WebDriver driver;
	public FileInputStream fi;
	public Workbook w;
	public Sheet s;
	
@Test
public void step1()throws BiffException, IOException {
	//FileInputStream fi=new FileInputStream("C:\\\\Users\\\\svitikala\\\\Downloads\\\\Classppts\\\\classdata\\\\gmaillogin.xls");
	   
	fi=new FileInputStream("C:\\Users\\svitikala\\Downloads\\Classppts\\classdata\\gmaillogin1.xls");
	w=Workbook.getWorkbook(fi);
	s=w.getSheet("Login");

	driver.findElement(By.id(s.getCell(0,1).getContents())).sendKeys(s.getCell(1,1).getContents());
	//driver.findElement(By.id(s.getCell(0,0).getContents())).sendKeys(s.getCell(0,1).getContents());
	driver.findElement(By.xpath(s.getCell(0,2).getContents())).click();
	  System.out.println("==="+s.getCell(0,1).getContents());
	  //driver.findElement(By.id("email")).sendKeys("");
	 // driver.findElement(By.id(s.getCell(arg0, arg1)))
	  //driver.findElement(By.id(s.getCell(1, 0).getContents())).sendKeys(s.getCell());
	//  driver.findElement(By.id("identifierId")).sendKeys(s.getCell(0,1).getContents());
	 // driver.findElement(By.id(sgetCell(0,1).getContents())).sendKeys(arg0);
//	  driver.findElement(By.id(s.getCell(0,1).getContents())).sendKeys(s.getCell(0,2).getContents());
//	  driver.findElement(By.id(s.getCell(0,3).getContents())).click();
//	  Thread.sleep(5000);
//	  //driver.findElement(By.id(s.getCell(, arg1)))
//	  driver.findElement(By.id(s.getCell(0,4).getContents())).sendKeys(s.getCell(0,5).getContents());
//	  driver.findElement(By.id("signIn")).click();
	  
	  

	  
		
	  	  
	  
}
@BeforeTest
public void beforeTest() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\svitikala\\Downloads\\LatestSeleniumjar\\chromedriver.exe");	
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://gmail.com");
}

@AfterTest
public void afterTest() {
}

}


