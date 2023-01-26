package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebTable_CssSelector {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\svitikala\\Downloads\\library\\chrome\\chromedriver.exe");	
			driver=new ChromeDriver();
			
		driver.get("http://www.timeanddate.com/worldclock/");
		
		String xpath="//table[@class='border2 lpad wa wc-tab ccols4']/tbody/tr[8]/td[3]/a";
		String cSelec="table[class='border2 lpad wa wc-tab ccols4'] tbody tr:nth-child(3) td:nth-child(3) a";
		System.out.println(driver.findElement(By.cssSelector(cSelec)).getText());
	}

}
