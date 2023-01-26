/*package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


public class Exportresult {
	public static void main(String[] args) throws Exception {
	WebDriver driver = new FirefoxDriver();

    driver.get("http://www.gmail.com");

    driver.manage().window().maximize();  
   
    WebElement username = driver.findElement(By.name("Email"));
    
    WebElement password=driver.findElement(By.name("Passwd"));

try {
	FileInputStream fi;
	 Workbook w;
	 Sheet s;
	fi=new FileInputStream("E:\\IMPNotes\\MultiCreds.xls");
	  w=Workbook.getWorkbook(fi);
	  s=w.getSheet(0);
	  

    Cell resultCell= s.getRow(1).getCell(3);
    Cell resultcell1=s.getRow(2).getCell(3);
    String usernamevalue = s.getRow(1).getCell(2).getStringCellValue();
    String passwordvalue=s.getRow(2).getCell(2).getStringCellValue();
    username.sendKeys(usernamevalue);
    password.sendKeys(passwordvalue);

    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

    String usernametext=  username.getAttribute("value");
    String passwordtext= password.getAttribute("value");

    if(usernametext.equals(usernamevalue)){
            System.out.println("set is successful.");
            resultCell.setCellValue("PASS");
    } else {
            System.out.println("set is not successful.");
            resultCell.setCellValue("FAIL");
    }
    if(passwordtext.equals(passwordvalue)){
        System.out.println("set is successful.");
        resultcell1.setCellValue("PASS");
} else {
        System.out.println("set is not successful.");
        resultcell1.setCellValue("FAIL");
}


file.close();

FileOutputStream outFile =new FileOutputStream(new File("D:\\testdata-result.xls"));
workbook.write(outFile);
outFile.close();

} catch (FileNotFoundException fnfe) {
fnfe.printStackTrace();
} catch (IOException e) {
e.printStackTrace();
}
driver.findElement(By.name("signIn")).click();

}
}
*/