package seleprg;

import java.awt.Dimension;
import java.awt.image.BufferedImage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.sikuli.script.Screen;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class sikuliprg {
	public WebDriver driver;
	//Screen s=new Screen();
		
		
		
  @Test
  public void f()  throws Exception{
	 //s.hover("C:\\Documents and Settings\\admin\\Desktop\\aboutus.png.sikuli\\1400055239906.png");

  //s.hover("C:\\Documents and Settings\\admin\\Desktop\\aboutus.png.sikuli\\1400055239906.png");
  
  }
  @BeforeTest
  public void beforeTest()  {
	  driver=new FirefoxDriver();
	  driver.get("http://spicejet.com");
  }


  @AfterTest
  public void afterTest() {
  }

}
