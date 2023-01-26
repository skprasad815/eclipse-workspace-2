package datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.Selenium;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Multicred {
	public WebDriver driver;
	public Selenium se;
	
	public FileInputStream fi;
	public Workbook w;
	public Sheet s;
	
	FileOutputStream fo;
	WritableWorkbook ww;
	WritableSheet ws;

	String str;
  @Test
  public void f() throws Exception {
	  fi=new FileInputStream("E:\\IMPNotes\\MultiCreds.xls");
	  w=Workbook.getWorkbook(fi);
	  s=w.getSheet(0);
	  
	 fo=new FileOutputStream("E:\\IMPNotes\\MailIn_MultiCredentials_Results.xls");
	  ww=Workbook.createWorkbook(fo);
	  ws=ww.createSheet("Results", 1);
	  
	  for (int i = 1; i < s.getRows(); i++) {
		
		  driver.findElement(By.id("Email")).sendKeys(s.getCell(0,i).getContents());
		  driver.findElement(By.id("next")).click();
		  driver.findElement(By.id("Passwd")).sendKeys(s.getCell(1,i).getContents());
		  driver.findElement(By.id("signIn")).click();
		  Thread.sleep(2000);
		  if (se.isElementPresent("id=Email")) {
			

		     driver.findElement(By.id("Email")).sendKeys(s.getCell(0,i).getContents());
		     driver.findElement(By.id("next")).click();
		     driver.findElement(By.id("Passwd")).sendKeys(s.getCell(1,i).getContents());
		     driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		     //dri
		     Thread.sleep(2000);
			}
		  if (se.isElementPresent("link=Sign out")) {
			  driver.findElement(By.linkText("Sign out")).click();
			 System.out.println("Valid Credentials");
			 str="Pass";
			 //d
			  driver.navigate().to("http://gmail.com");
			  Thread.sleep(2000);
		}
		  else
		  {
			  System.out.println("Invalid Credential");
			  str="Fail";
		  }
		  Label result=new Label(2, i, str);
		  ws.addCell(result);
		  
		
		  for (int j = 0; j < s.getColumns(); j++) {
				Label content=new Label(j, i, s.getCell(j, i).getContents());
				ws.addCell(content);
			}
		  Label un=new Label(0, 0, "Username");
			ws.addCell(un);
			Label pwd=new Label(1, 0, "Password");
			ws.addCell(pwd);
			Label rs=new Label(2, 0, "Results");
			ws.addCell(rs);
		
		}
	 
	
		 ww.write();
		  ww.close();
	 
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  se=new WebDriverBackedSelenium(driver, "http://gmail.com");
	  driver.get("http://gmail.com");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }



}
