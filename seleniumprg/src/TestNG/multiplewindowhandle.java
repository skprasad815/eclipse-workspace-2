package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class multiplewindowhandle {
	WebDriver driver = new FirefoxDriver();

	 @Test
    public void test5() throws Exception {
       
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://site2.way2sms.com/content/prehome.jsp");

          String mainwindow=driver.getWindowHandle();
         // driver.findElement(By.className("button button br2")).click();

          for(String winHandle :driver.getWindowHandles()){
              driver.switchTo().window(winHandle);
              if(driver.getTitle().equals("Real Estate | Property in India | Buy/Sale/Rent Properties | MagicBricks")){
System.out.println("You are in required window");
                  break;
                  } else{
          System.out.println("Title of the page after - switchingTo: " + driver.getTitle());
              }
          }
          driver.switchTo().window(mainwindow);
	 }
}
