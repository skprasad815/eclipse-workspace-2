package com.OCP.TestCase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.OCP.utilities.ExcelReader;
import com.OCP.utilities.ReadConfig;



public class BaseTest {

	
		ReadConfig readconfig=new ReadConfig();
			
			
			public String url = readconfig.getApplicationurl();
			/*
			 * public String user = readconfig.getusername(); public String pass =
			 * readconfig.getpasswordL();
			 */
			public static WebDriver driver;
			public static 	Logger logger;
			public static ExcelReader excel= new ExcelReader(System.getProperty("user.dir") + "\\src\\test\\java\\com\\inetBanking\\testData\\LoginData.xlsx");
			@Parameters("browser")
			@BeforeMethod
			public void setup(String br) {
				logger=	Logger.getLogger("devpinoyLogger");
		PropertyConfigurator.configure("log4j.properties");

		if(br.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",readconfig.getchromePath());
				driver = new ChromeDriver();
			}
		else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",readconfig.getfirefoxPath());
			driver = new FirefoxDriver();
		}
		else if (br.equals("ie")) {
			System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
			driver = new InternetExplorerDriver();
			}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		logger.info("URL is opened");

		}
			
			@AfterMethod
			public void teardown() {
		driver.quit();
			}

			public static void captureScreenshot(WebDriver drover, String name) throws IOException  {

				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+ name + ".png");
				FileUtils.copyFile(scrFile,target);
				System.out.println("Screenshot taken");
			}
					}

