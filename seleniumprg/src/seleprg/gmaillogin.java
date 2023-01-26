package seleprg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmaillogin {
public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
 driver=new FirefoxDriver();
 
 driver.get("http://gmail.com");
 driver.manage().window().maximize();
 driver.findElement(By.id("Email")).sendKeys("saritha03.chary");
 driver.findElement(By.id("next")).click();
 //driver.findElement(by.)
 Thread.sleep(2000);
 driver.findElement(By.id("Passwd")).sendKeys("saritha123");
 driver.findElement(By.id("signIn")).click();
 /*Thread.sleep(20000);
 driver.findElement(By.linkText("vitikala.saritha@gmail.com")).click();
 driver.findElement(By.linkText("Sign out")).click();*/
 /*driver.close();
 driver.quit();*/
	}

}
