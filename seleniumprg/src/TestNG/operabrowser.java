package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class operabrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 DesiredCapabilities capabilities = DesiredCapabilities.opera();  
//	    capabilities.setCapability("opera.binary", " Absolute Path of Opera browser ");  
	    capabilities.setCapability("opera.binary", "F:\\operadriver.exe");   
	    WebDriver driver = new OperaDriver(capabilities);
	    driver.get("http://google.com");
	    
	  }
	}


