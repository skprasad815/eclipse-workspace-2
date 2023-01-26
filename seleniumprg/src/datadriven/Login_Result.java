package datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.Selenium;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Login_Result {
	public WebDriver driver;
	public Selenium selenium;
	public FileInputStream fi;
	public Workbook w;
	public Sheet s;
	public FileOutputStream fo;
	public WritableWorkbook wb;
	public WritableSheet ws;
	public String str;
  @Test
  public void f()throws Exception {
	  fi=new FileInputStream("E:\\WORKSPACE_10JUNE_730AM"
	 	+ "\\SeleniumAutomation\\testdata\\login.xls");
	  w=Workbook.getWorkbook(fi);
	  s=w.getSheet("login");
	  
  fo=new FileOutputStream("E:\\WORKSPACE_10JUNE_730AM"
	 	+ "\\SeleniumAutomation\\results\\results3.xls");
	  wb=Workbook.createWorkbook(fo);
	  ws=wb.createSheet("Results", 0);
	  
	  
	  
	  for(int i=1;i<s.getRows();i++)
	  {
		  driver.findElement(By.name("username")).sendKeys(s.getCell(0, i).getContents());
		  driver.findElement(By.name("password")).sendKeys(s.getCell(1, i).getContents());
	      driver.findElement(By.name("submit")).click();
	       Thread.sleep(3000);
		  
	  	  
	  
	  
	  
		
		  
		  if(selenium.isElementPresent("link=Logout"))
		  {
			  System.out.println("Valid Credential");
			  str="PASS";
			  selenium.click("link=Logout");
			  Thread.sleep(3000);
		  }
		  else
		  {
			  System.out.println("Invalid credential");
			  str="FAIL";
			  Thread.sleep(3000);
		  }
		  Label result=new Label(2, i, str);
		  ws.addCell(result);
		  
		  for(int j=0;j<s.getColumns();j++)
		  {
  System.out.println(s.getCell(j, i).getContents());
  Label a=new Label(j, i, s.getCell(j, i).getContents());
	  ws.addCell(a);
		  }
	  }
	  Label un=new Label(0, 0, "User Name");
	  Label pw=new Label(1, 0, "Password");
	  Label rs=new Label(2, 0, "Results");
	  ws.addCell(un);
	  ws.addCell(pw);
	  ws.addCell(rs);
	 
	  wb.write();
	  wb.close();
  }
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\svitikala\\Downloads\\LatestSeleniumjar\\chromedriver.exe");	
		driver=new ChromeDriver();
	  selenium=new WebDriverBackedSelenium
			  (driver, "http://selenium4testing.com/hms");
	  driver.get("http://selenium4testing.com/hms");
	  driver.manage().window().maximize();
  }


}
