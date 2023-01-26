import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverinterface {

	 static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");	
			driver=new ChromeDriver();
			driver.get("http://google.com");//wait until all webelements load in the page
			//driver.navigate();//directly search webelements
			driver.findElement(By.name("q")).sendKeys("selenium");
			//driver.close();
	}

}
