package temp.product.amazon.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class BrowserManager {

	public static WebDriver getDriver(String type, String url) {
		WebDriver driver = null;
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\santo\\Desktop\\latestJars\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\santo\\Desktop\\latestJars\\chrome\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (type.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\santo\\Desktop\\latestJars\\chrome\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}
		Assert.assertTrue(false, "give the valid browser name");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		Reporter.log("navigated to browser" + type + "URL" + url, true);
		return driver;

	}

	public void close() {
		WebDriver driver = null;
		driver.close();
	}

}
