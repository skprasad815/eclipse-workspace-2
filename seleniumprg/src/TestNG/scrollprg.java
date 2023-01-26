package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.java.swing.plaf.windows.resources.windows;

public class scrollprg {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 //driver.get("http://www.flipkart.com/womens-clothing/pr?sid=2oq,c1r&amp;otracker=hp_nmenu_sub_women_1_View%20all");
          driver.get("https://shopping.yahoo.com/");

		 driver.manage().window().maximize();
		 JavascriptExecutor jsx=(JavascriptExecutor)driver;
		
		// jsx.executeScript("window.scrollby(0,3050", "")
		 jsx.executeScript("window.scrollBy(0,2050)", ""); //scroll down
		
//		 Thread.sleep(20000);
//		 jsx.executeScript("window.scrollBy(0,588)","");
//		 jsx.executeScript("window.scrollBy(2,390)", "");
//		 
		 		//+ "scrollBy(0,50)", ""); //scroll up


	}






}
