package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.AccountPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

public class LoginTest extends Base {

	public WebDriver driver;
	Logger log;

	@Test(dataProvider = "getLoginData")
	public void Login(String email, String password, String Expectedstatus) throws IOException, InterruptedException {

		log = LogManager.getLogger(LoginTest.class.getName());

		LandingPage landingpage = new LandingPage(driver);
		landingpage.myAccountDropdown().click();
		log.debug("Clicked on My Account dropdown");
		landingpage.loginOption().click();
		log.debug("Clicked on login option");

		Thread.sleep(3000);

		LoginPage loginpage = new LoginPage(driver);
		loginpage.EmailAddressField().sendKeys(email);
		log.debug("Email addressed got entered");
		loginpage.PasswordField().sendKeys(password);
		log.debug("Password got entered");
		loginpage.LoginButton().click();
		log.debug("Clicked on Login Button");

		AccountPage accountpage = new AccountPage(driver);

		String ActualResult = null;
		

		try {

			if (accountpage.EditYourAccountInformation().isDisplayed())
				log.debug("User got logged in");
			{
				ActualResult = "succesful";
			}

		} catch (Exception e) {
			log.debug("User didn't log in");
			ActualResult = "Fail";
		}

		Assert.assertEquals(ActualResult, Expectedstatus);
		log.info("Login Test got passed");

	}

	@BeforeMethod
	public void OpenApplication() throws IOException {
		
		log = LogManager.getLogger(LoginTest.class.getName());
		
		driver = initializeBrowser();
		log.debug("Browser got launched");
		driver.get(prop.getProperty("url"));
		log.debug("Navigated to application URL");
	}

	@AfterMethod
	public void TearDown() {
		driver.close();
		log.debug("Browser got closed");
	}

	@DataProvider
	public Object[][] getLoginData() {

		Object[][] data = { { "jk1@gmail.com", "123456", "succesful" }, { "jk3@gmail.com", "45895", "Fail" } };
		return data;
	}
}
