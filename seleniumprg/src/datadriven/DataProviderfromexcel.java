package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;

public class DataProviderfromexcel {
	public WebDriver driver;
	public WebDriverWait wait;
	String appURL = "https://www.linkedin.com/";
	
	//Locators
	private By byEmail = By.id("login-email");
	private By byPassword = By.id("login-password");
	private By bySubmit = By.xpath(".//*[@id='pagekey-uno-reg-guest-home']/div[1]/div/form/input[5]");
	private By byError = By.id("global-alert-queue");
	
	@BeforeClass
	public void testSetup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\svitikala\\Downloads\\library\\geckodriver.exe");	
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 5);
	}
	

	@Test(dataProvider="empLogin")
	public void VerifyInvalidLogin(String userName, String password) {
		//driver.navigate().to(appURL);
		driver.get("https://www.linkedin.com");
		driver.findElement(byEmail).sendKeys(userName);
		driver.findElement(byPassword).sendKeys(password);
		//wait for element to be visible and perform click
		wait.until(ExpectedConditions.visibilityOfElementLocated(bySubmit));
		driver.findElement(bySubmit).click();
		
		//Check for error message
		wait.until(ExpectedConditions.presenceOfElementLocated(byError));
		String actualErrorDisplayed = driver.findElement(byError).getText();
		String requiredErrorMessage = "Please correct the marked field(s) below.";
		Assert.assertEquals(requiredErrorMessage, actualErrorDisplayed);
		
	}
	
	@DataProvider(name="empLogin")
	public Object[][] loginData() throws JXLException {
		Object[][] arrayObject = getExcelData("C:\\Users\\svitikala\\Downloads\\Classppts\\classdata\\gmaillogin.xls","Sheet1");
		return arrayObject;
	}

	/**
	 * @param File Name
	 * @param Sheet Name
	 * @return
	 * @throws JXLException 
	 */
	public String[][] getExcelData(String fileName, String sheetName) throws JXLException {
		String[][] arrayExcelData = null;
		try {
			FileInputStream fs = new FileInputStream(fileName);
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh = wb.getSheet(sheetName);

			int totalNoOfCols = sh.getColumns();
			int totalNoOfRows = sh.getRows();
			
			arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
			
			for (int i= 1 ; i < totalNoOfRows; i++) {

				for (int j=0; j < totalNoOfCols; j++) {
					arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		
		}
		return arrayExcelData;
	}

	@BeforeTest
	public void Setuo(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\svitikala\\Downloads\\library\\geckodriver.exe");	
		driver=new FirefoxDriver();
		driver.get("https://www.linkedin.com");
		//driver.quit();
	}
}
