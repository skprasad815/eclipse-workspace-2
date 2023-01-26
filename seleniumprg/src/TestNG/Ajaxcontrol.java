package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ajaxcontrol {
	public WebDriver driver;
   // public Selenium selenium;
   
  @Test
  public void ajaxcontroltest() throws Exception {
    driver.findElement(By.name("q")).sendKeys("selenium");
  
//string="adggg";OBMEnb
    String str = driver.findElement(By.xpath("(//ul[@class='G43f7e'])[1]/li")).getText();
    Thread.sleep(2000);
   System.out.println(str);//sele,sel ideselewait...............selenium turb
  String s[] = str.split("\n");//s[0]=sel,s[1]=swd,s[2]=tr,s[3]=wed
  System.out.println(s.length);
  for (int i = 0; i < s.length; i++) {
	  
       if (s[i].equalsIgnoreCase("selenium tutorial")) {
           System.out.println(s[i]);
           driver.findElement(By.name("q")).clear();//selenium
           driver.findElement(By.name("q")).sendKeys(s[i],Keys.ENTER);
          
       }      
    }
  }
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\santo\\Desktop\\latestJars\\chrome\\chromedriver.exe"); 
	  driver=(WebDriver) new ChromeDriver();
	 
	 // driver=new FirefoxDriver();
  driver.get("http://google.com/");
  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }
}
