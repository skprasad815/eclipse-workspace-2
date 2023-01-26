package TestNG;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmailregister {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new FirefoxDriver();
	driver.get("http:\\www.gmail.com");
	 driver.manage().window().maximize(); 
	driver.findElement(By.xpath(".//*[@id='link-signup']/a")).click();}

	/*static boolean c,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20;
	//static WebElement d,e,f,g,h,i,k,l,m,f2,g2,h2,i2,i4,g4,g6,g8;
	 
	static WebElement f;
	 
	static String sample,sample1,sample2,sample3,sample4,sample5,sample12;
	WebDriverWait wait;
	Alert alrt;

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	  
	WebDriver driver =new FirefoxDriver();
	driver.get("http:\\www.gmail.com");
	  
	/driver.findElement(By.id("gmail-sign-in")).click();
	  
	WebElement Username=driver.findElement(By.id("Email"));
	Username.sendKeys("koushik.arvapelli@netwinindia.com");
	  
	WebElement Password=driver.findElement(By.id("Passwd"));
	Password.sendKeys("vaageswari");/
	  
	driver.findElement(By.id("link-signup")).click();
	  
	c= driver.findElement(By.xpath(".//*[@id='gmail-create-account']")).isDisplayed();
	   
	if(c==true)
	System.out.println("Google logo is present");
	  
	c1= driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[2]/img[1]")).isDisplayed();
	  
	if(c1==true)
	System.out.println("Images are present");  
	  
	c2= driver.findElement(By.xpath(".//*[@id='name-form-element']/fieldset/legend/strong")).isDisplayed();
	if(c2==true)
	System.out.println("Name Text is presnt");
	  
	c3=driver.findElement(By.xpath(".//*[@id='FirstName']")).isDisplayed();
	  
	if(c3==true)
	System.out.println("Fname TextBox is Present");
	  
	//WebElement fname=
	  
	driver.findElement(By.xpath(".//*[@id='FirstName']")).sendKeys("james");
	//fname.sendKeys("james");  
	  
	c4=driver.findElement(By.xpath(".//*[@id='LastName']")).isDisplayed();
	   
	if(c4==true)
	System.out.println("Lname TextBox is Present");
	  
	driver.findElement(By.xpath(".//*[@id='LastName']")).sendKeys("karley");
	    
	c5=driver.findElement(By.xpath(".//*[@id='errormsg_0_FirstName']")).isDisplayed();
	    
	if(c5==true)
	System.out.println("Please enter your first name");   
	  
	c6= driver.findElement(By.xpath(".//*[@id='gmail-address-label']/strong")).isDisplayed();
	  
	if(c6==true)
	System.out.println("Choose your username Text is presnt");
	  
	c7=driver.findElement(By.xpath(".//*[@id='GmailAddress']")).isDisplayed();
	if(c7==true)
	System.out.println("Username TextBox is Present");
	  
	driver.findElement(By.xpath(".//*[@id='GmailAddress']")).sendKeys("jameskarley005");
	sample2=driver.findElement(By.xpath(".//*[@id='GmailAddress']")).getAttribute("value");
	driver.findElement(By.xpath(".//*[@id='GmailAddress']")).sendKeys(Keys.ENTER);
	  
	//if(sample2.length()<6 && sample2.length()>30)
	if(sample2.length()<6)
	{
	 System.out.println("username Should be greater than 6 Cahrs");
	}
	    
	c8=driver.findElement(By.xpath(".//*[@id='errormsg_0_LastName']")).isDisplayed();
	if(c8==true)
	System.out.println("Please enter your Lastname");
	  
	c9= driver.findElement(By.xpath(".//*[@id='gmail-address-label']/strong")).isDisplayed();
	   
	if(c9==true)
	System.out.println("Create a Password Text is presnt"); 
	  
	c10=driver.findElement(By.xpath(".//*[@id='Passwd']")).isDisplayed();
	if(c10==true)
	System.out.println("Password TextBox is Present");  
	  
	driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("vaageswari1219");
	  
	sample=driver.findElement(By.xpath(".//*[@id='Passwd']")).getAttribute("value");
	  
	  
	c11= driver.findElement(By.xpath(".//*[@id='errormsg_0_GmailAddress']")).isDisplayed();
	if(c11==true)
	System.out.println("Username should not be empty,Please use between 6 and 30 characters");
	  
	c12= driver.findElement(By.xpath(".//*[@id='confirm-password-label']/strong")).isDisplayed();
	if(c12==true)
	System.out.println("Confirm your Password Text is presnt"); 
	  
	c13=driver.findElement(By.xpath(".//*[@id='PasswdAgain']")).isDisplayed();
	if(c13==true)
	System.out.println("CPassword TextBox is Present");  
	  
	driver.findElement(By.xpath(".//*[@id='PasswdAgain']")).sendKeys("vaageswari1219");
	     
	sample1=driver.findElement(By.xpath(".//*[@id='PasswdAgain']")).getAttribute("value");
	driver.findElement(By.xpath(".//*[@id='PasswdAgain']")).sendKeys(Keys.ENTER);
	  
	c14 = driver.findElement(By.xpath(".//*[@id='errormsg_0_Passwd']")).isDisplayed();
	if(c14==true)
	System.out.println("You can't leave Password field empty ");
	  
	if(sample.equals(sample1))
	    
	  {
	   System.out.println("Passwords are matching"); 
	  }
	  else
	   
	System.out.println("Passwords doesnt match");
	  
	  
	  
	  c15=driver.findElement(By.xpath(".//*[@id='BirthdayLabel']")).isDisplayed();
	  if(c15==true)
	  {
	   System.out.println("Birthday Text is Present");
	  }
	  
	   
	  driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).click();
	       driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[2]/div[@id=':5']")).click();
	       driver.findElement(By.id("BirthDay")).sendKeys("16");
	        driver.findElement(By.id("BirthYear")).sendKeys("1978");
	      
	        sample3=driver.findElement(By.id("BirthYear")).getAttribute("value");
	      
	        System.out.println("Birth year is" + sample3);
	      
	        DateFormat dateFormat = new SimpleDateFormat("yyyy");
	     Date date = new Date();
	     System.out.println(dateFormat.format(date));
	         
	        
	       driver.findElement(By.xpath(".//*[@id='Gender']/div")).click();
	       driver.findElement(By.xpath(".//*[@id='Gender']/div[2]/div[@id=':d']")).click();
	      
	       driver.findElement(By.name("RecoveryPhoneNumber")).sendKeys("9096245154");
	      
	       sample4= driver.findElement(By.name("RecoveryPhoneNumber")).getAttribute("value");
	       System.out.println("Entered Mobile number is " +sample4);
	      
	       driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("jhoney@gmail.com");
	      
	       sample5=driver.findElement(By.id("RecoveryEmailAddress")).getAttribute("value");
	      
	       System.out.println("Entered email ID is :" + sample5);
	      
	       Thread.sleep(20000);     
	      
	       /// Enter the capcha manually 
	      
	       System.out.println("Enter the capcha manually and wait for 20 seconnds");
	    
	       Thread.sleep(20000); 
	      
	       driver.findElement(By.id("TermsOfService")).click();
	      
	       System.out.println("Enter the capcha manually and wait for 20 seconnds");
	       driver.findElement(By.id("TermsOfService")).submit();
	          
	      
	       driver.findElement(By.id("next-button")).click();
	       System.out.println("Enter the verification code sent on ur registered mobile number");
	      
	       Thread.sleep(25000);
	      
	       driver.findElement(By.name("VerifyPhone")).click();
	      
	       System.out.println("your id is sucessfuly created");
	}*/

}
