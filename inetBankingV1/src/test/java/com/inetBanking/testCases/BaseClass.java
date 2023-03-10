package com.inetBanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {

	public String url = "https://demo.guru99.com/V1/index.php";
	public String user = "mngr472775";
	public String pass = "gepavEg";
	public static WebDriver driver;
	public static 	Logger logger;
	@BeforeClass
	public void setup() {
		logger=	Logger.getLogger("devpinoyLogger");
PropertyConfigurator.configure("log4j.properties");

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@AfterClass
	public void teardown() {
driver.quit();
	}

}
