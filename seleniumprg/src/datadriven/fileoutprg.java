package datadriven;

import java.io.FileOutputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class fileoutprg {
	public WebDriver driver;
	FileOutputStream fo;
	WritableWorkbook wb;
	WritableSheet ws;
	
  @Test
  public void f() throws Exception {
fo=new FileOutputStream("E:\\sari\\os\\sari3.xls");
wb=Workbook.createWorkbook(fo);
ws=wb.createSheet("result", 0);
jxl.write.Label un=new jxl.write.Label(0, 0, "username");
jxl.write.Label pw=new jxl.write.Label(1, 0, "password");
jxl.write.Label rs=new jxl.write.Label(2, 0, "results");

ws.addCell(un);
ws.addCell(pw);
ws.addCell(rs);
jxl.write.Label un1=new jxl.write.Label(0, 1, "jan30selenium");
jxl.write.Label pw1=new jxl.write.Label(1, 1, "selenium1");



ws.addCell(un1);
ws.addCell(pw1);


wb.write();
wb.close();


  }
  
  @BeforeTest
  public void beforeTest() {
 driver=new FirefoxDriver();
 driver.get("http:\\gmail.com");
 
  }
  

  @AfterTest
  public void afterTest() {
  }

}


