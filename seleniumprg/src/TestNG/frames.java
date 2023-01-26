package TestNG;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frames {
	 public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new FirefoxDriver();
	        driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
	        driver.get("https://www.google.co.in/"); //open google
	        driver.manage().window().maximize();
	        driver.findElement(By.id("lst-ib")).sendKeys("times of india"); //type in search box 'times of india'
	        driver.findElement(By.xpath(".//*[@id='rso']/li/div/table/tbody/tr[2]/td[1]/div/span/h3/a")).click(); //click on 1st link of 'times of india'
	        //driver.findElement(By.xpath("html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/a ']")).click(); //click on 'click here to go to timesofindia.com'
	        driver.findElement(By.xpath(".//*[@id='header']/div[1]/div/div/span[2]/span[1]")).click(); //click on 'Login' button
	        driver.switchTo().frame(driver.findElement(By.xpath(".//*[@id='loginbox']/form"))); //now switch to login frame which has 3 options facebook, twitter and your email
	        driver.findElement(By.id("fb")).click(); //click on facebook which will open in new window
	        Iterator<String> it = driver.getWindowHandles().iterator();// get the address of all the windows
	        String times = it.next();
	        String fb = it.next();
	        driver.switchTo().window(fb); // switch to facebook window
	        driver.findElement(By.xpath("//input[@type='checkbox']")).click(); //check the checkbox in facebook window
	        driver.findElement(By.xpath("//input[@value='Cancel']")).click(); //click on cancle button in facebook window
	        driver.switchTo().window(times); //switch back to main window
	        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='signupsso']"))); //again switch to login frame which has 3 options facebook, twitter and your email
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//img[@src='/photo/11509366.cms']")).click(); // click on cross sign to close frame 
	        Thread.sleep(2000);
	        driver.switchTo().defaultContent(); //switch back to main page
	        driver.findElement(By.xpath("//div[ul[script[text()='sectionid=4719157']]]//a[@href='/india/indiaarticlelist/-2128936835.cms']")).click(); //click on india
	        driver.close();
	    }

	}


