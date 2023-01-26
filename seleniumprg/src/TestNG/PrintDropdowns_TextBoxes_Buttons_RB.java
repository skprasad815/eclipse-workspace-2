package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrintDropdowns_TextBoxes_Buttons_RB {
	public WebDriver driver;
	  @Test
	  public void printDropdowns() {
		  List<WebElement> str=driver.findElements(By.tagName("td"));
		  System.out.println(str.size());
		  for (int i = 0; i < str.size(); i++) {
			System.out.println(str.get(i).getAttribute("id"));
		}
	  }
	  @Test
	  public void printTextBoxes(){
		  List<WebElement> str=driver.findElements(By.className("text"));
		  System.out.println(str.size());
		  for (int i = 0; i < str.size(); i++) {
			System.out.println(str.get(i).getAttribute("id"));
		}
	  }
	  @Test
	  public void printTextBoxes_Buttons_RB_Checkboxes(){
		  List<WebElement> str=driver.findElements(By.tagName("a"));
		  System.out.println(str.size());
		  for (int i = 0; i < str.size(); i++) {
			  if(str.get(i).getAttribute("class").equalsIgnoreCase("text"))
			  {
			System.out.println("Text box ids are: "+str.get(i).getAttribute("id"));
			  }
			  else if(str.get(i).getAttribute("type").equalsIgnoreCase("image"))
			  {
				  System.out.println("Button ids are :"+str.get(i).getAttribute("id"));
			  }
			  else if(str.get(i).getAttribute("type").equalsIgnoreCase("radio"))
			  {
				  System.out.println("Button ids are :"+str.get(i).getAttribute("id"));
			  }
		}
	  }
	  @Test
	  public void printDisplaynames(){
		  String str;
	str=driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/div")).getText();
	System.out.println(str);
	System.out.println("--------------------------");
	String s[]=str.split("\n");
	System.out.println(s.length);
	for (int i = 0; i < s.length; i++) {
		//System.out.println(s[i]);
		if(s[i].contains("*"))
		{
			System.out.println(s[i]);
		}
	}
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");	
			driver=new ChromeDriver();
		  driver.get("http://gmail.com");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("html/body/div/div[2]/div[2]/div[2]/div/div/p[1]/span[2]/a")).click();
	  }
}
