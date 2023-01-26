package datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import jxl.LabelCell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class step2 {
	public WebDriver driver;
	FileOutputStream fo;
	WritableWorkbook wb;
	WritableSheet ws;
	public FileInputStream fi;
	public Workbook w;
	public Sheet s;
	
  @Test
  public void f() throws Exception,InterruptedException {
	  
	     fo=new FileOutputStream("C:\\Users\\svitikala\\Downloads\\Classppts\\classdata\\gmailloginbatch5aaa30.xls");
	    wb=Workbook.createWorkbook(fo);
	    ws=wb.createSheet("Login", 0);
	  // Label un=new Label(0, 0, "uamesern")
	 Label hello=new Label(5, 4, "Hello");
	   // Label u1=new Label(c, r, cont)
	   jxl.write.Label un=new jxl.write.Label(0, 0, "UserName");
	  jxl.write.Label ne=new jxl.write.Label(1, 0, "next");
	   jxl.write.Label pw=new jxl.write.Label(2, 0, "password");
	   jxl.write.Label rs=new jxl.write.Label(3, 0, "results");
	   ws.addCell(hello);
	    ws.addCell(un);
	   ws.addCell(ne);
	   ws.addCell(pw);
	   ws.addCell(rs);
	   jxl.write.Label un1=new jxl.write.Label(0,1, "saritha03.chary");
	   jxl.write.Label ne1=new jxl.write.Label(1,1,"next");
	   jxl.write.Label pw1=new jxl.write.Label(2,1, "saritha123");
  ws.addCell(un1);
ws.addCell(pw1);
wb.write();
wb.close();


fi=new FileInputStream("C:\\Users\\svitikala\\Downloads\\Classppts\\classdata\\gmailloginbatch530.xls");
w=Workbook.getWorkbook(fi);
s=w.getSheet("Login");

driver.findElement(By.id("identifierId")).sendKeys(s.getCell(0,1).getContents());
driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[1]")).click();
//Thread.sleep(2000);
//driver.findElement(By.id("Passwd")).sendKeys(s.getCell(2,1).getContents());
//driver.findElement(By.id("signIn")).click();

//wb.close();


  }
  
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\svitikala\\Downloads\\LatestSeleniumjar\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
  }
  

 

}
