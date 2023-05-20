package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazonlink {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\santo\\\\Desktop\\\\latestJars\\\\chrome\\\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		List<WebElement> alllinks=driver.findElements(By.xpath("//a[@class='nav-a  ']"));
		int rowCount=alllinks.size();
		System.out.println(rowCount);
				String beforeXpath="//a[@data-csa-c-slot-id='nav_cs_";
		String afterXpath="']";
		for (int i = 1; i <=rowCount; i++) {
			String ActualXpath=beforeXpath + i +afterXpath;
			 WebElement element=driver.findElement(By.xpath(ActualXpath));
			 Thread.sleep(2000);
			 if(i==8)
				 break;
			 else  i++;
			 System.out.println(element.getText());
  }
}
}
