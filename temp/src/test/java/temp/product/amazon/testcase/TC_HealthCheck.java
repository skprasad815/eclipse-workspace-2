package temp.product.amazon.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import temp.product.amazon.utils.BrowserManager;
import temp.product.cscart.po.PO_search;

public class TC_HealthCheck {


	@Test
@Parameters({"browser","url"});
	public void t01_amazon_search() {

		WebDriver driver = BrowserManager.getDriver(String browser, String url);
		PO_search obj = PageFactory.initElements(driver, PO_search.class);
		obj.searchAproduct("computer");

		
		}
	
	

}
