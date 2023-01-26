package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FacebookDemo {
	static WebDriver driver;

	public void setupBrowser(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\santo\\Desktop\\latestJars\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		}

		else if ((browser.equalsIgnoreCase("firefox"))) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\santo\\Desktop\\latestJars\\chrome\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}

		else if ((browser.equalsIgnoreCase("IE"))) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\santo\\Desktop\\latestJars\\chrome\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}

		else {
			System.out.println("valid browser was not provided, hence quitting");
		}

		if (url != "")
			driver.get(url);
		else
			driver.get("about blank");

	}

	public void quit() {
		driver.quit();
	}

	public void facebooklogin() {

		driver.findElement(By.id("email")).sendKeys("ksanjay815");
		driver.findElement(By.id("pass")).sendKeys("ksanjay815");
	}

	public static void main(String[] args) {
		FacebookDemo obj = new FacebookDemo();  // object created
		obj.setupBrowser("Chrome", "https://www.facebook.com"); // constructor is used
		//obj.setupBrowser("IE", "https://www.facebook.com");  // for InternetExplorer
		// obj.setupBrowser("firefox","https://www.facebook.com"); for firefox
		obj.facebooklogin();
		obj.quit();

	}

}
