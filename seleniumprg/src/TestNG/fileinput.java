package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class fileinput {
	WebDriver driver;

	public FileInputStream fi;
	public Workbook w;
	public Sheet s;
  @Test
  public void f() throws Exception {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\svitikala\\Downloads\\library\\chrome\\chromedriver.exe");	
		driver=new ChromeDriver();;
	  driver.get("http://www.gmail.com/");
	 // driver.get("http://gmail.com");
	  fi=new FileInputStream("E:\\sari\\data.xls");
	  w=Workbook.getWorkbook(fi);
	  s=w.getSheet("Sheet1");
	  //driver.findElement(By.id("email")).sendKeys("");
	 // driver.findElement(By.id(s.getCell(arg0, arg1)))
	  //driver.findElement(By.id(s.getCell(1, 0).getContents())).sendKeys(s.getCell());
	  //driver.findElement(By.id("Email")).sendKeys(s.getCell(0,2).getContents());
	  driver.findElement(By.id(s.getCell(1,0).getContents())).sendKeys("saritha");
	  driver.findElement(By.id(s.getCell(0,2).getContents())).click();
	  Thread.sleep(2000);
	  //driver.findElement(By.id(s.getCell(, arg1)))
	 // driver.findElement(By.id(s.getCell(0,3).getContents())).sendKeys(s.getCell(3,1).getContents());
	  driver.findElement(By.id("signIn")).click();
  }
}
