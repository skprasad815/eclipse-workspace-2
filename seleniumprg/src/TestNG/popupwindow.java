package TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popupwindow {
	public static void main(String[] args ) throws InterruptedException
    {
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();
        driver.get("http://www.rediff.com/");
        WebElement sign = driver.findElement(By.xpath(".//*[@id='signin_info']/a[1]"));
        sign.click();

        Set<String> windowId = driver.getWindowHandles();    // get  window id of current window
        Iterator<String> itererator = windowId.iterator();   

        String mainWinID = itererator.next();
        String  newAdwinID = itererator.next();

        driver.switchTo().window(newAdwinID);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
    //    driver.close();
//
        driver.switchTo().window(mainWinID);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);

        WebElement email_id= driver.findElement(By.id("login1"));
        email_id.sendKeys("hi");
        Thread.sleep(5000);

        //driver.close();
        //driver.quit();
    }  

}
