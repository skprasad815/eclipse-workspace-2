package temp.product.cscart.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class PO_search {
//for  page factory step 1
	WebDriver driver;
// for page factory	step 2
	public PO_search(WebDriver driver) {
		this.driver=driver;
		
		}
	
	//Page Objects step 3
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement txtbox_search;
	@FindBy(id = "nav-search-submit-button")
	private WebElement searchBtn ;
	
	//methods
	public void SearchTextbox(String arg) {
				txtbox_search.sendKeys(arg);
      Reporter.log("search product enter in search box:"+ arg, true);
	}
	public void Clicksearchbutton() {
		searchBtn.click();
		  Reporter.log("search box button clicked:", true);
	}
	//Buisness Method
	public void searchAproduct(String arg) {
		SearchTextbox(arg);
		 Clicksearchbutton();
		 String actual = driver.getTitle();
		 String expected = ("Amazon.in : ");
		 Assert.assertEquals(actual, expected, "search product not displayed");
		 Reporter.log("Able to search for product successful:", true);
	}
	
}
  