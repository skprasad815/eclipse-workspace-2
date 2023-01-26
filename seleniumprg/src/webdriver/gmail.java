package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("vitikala.saritha@gmail.com");
		driver.findElement(By.id("Passwd")).sendKeys("saritha123");
		driver.findElement(By.id("signIn")).click();
		System.out.println("valid user");
	}

}
