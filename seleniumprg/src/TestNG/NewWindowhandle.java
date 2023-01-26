package TestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowhandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\LENOVO\\Desktop\\LatestSeleniumjar\\Chrome\\chromedriver.exe");
			driver = new ChromeDriver();

		driver.get("https://demoqa.com/browser-windows");

		// Open new window by clicking the button
		driver.findElement(By.id("windowButton")).click();
		driver.getWindowHandle();
		//String mainwind0w=driver.getWindowHandles();
		
		//Get handles of the windows
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                WebElement text = driver.findElement(By.id("sampleHeading"));
                System.out.println("Heading of child window is " + text.getText());
                
                
            }
        }
                Thread.sleep(2000);
                driver.switchTo().defaultContent();
                driver.findElement(By.xpath("//div[text()='Browser Windows']")).click();
                //System.out.println(str1);
        

		/*
		 * // Click on the new window element and read the text displayed on the window
		 * WebElement text = driver.findElement(By.id("sampleHeading"));
		 * 
		 * // Fetching the text using method and printing it
		 * System.out.println("Element found using text: " + text.getText());
		 * driver.quit();
		 */
	}

}
