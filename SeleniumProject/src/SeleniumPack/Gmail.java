package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		try {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\santo\\Desktop\\latestJars\\chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(
					"https://accounts.google.com/signup/v2/webcreateaccount?biz=false&cc=IN&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%26ogbl%2F&dsh=S-1978922723%3A1669722108639589&emr=1&flowEntry=SignUp&flowName=GlifWebSignIn&ifkv=ARgdvAtETGPWiYzucpu_CMdKa0EHlO1k-vODUwYbWTmEBMOwIOiV1AwvhTstIUm2uUL0AVNCUpCE&ltmpl=default&osid=1&rm=false&scc=1&service=mail&ss=1");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.id("firstName")).sendKeys("sanjay kumar", Keys.ENTER);
			driver.findElement(By.id("lastName")).sendKeys("prasad", Keys.ENTER);
			driver.findElement(By.name("Username")).sendKeys("ksanjay815", Keys.ENTER);
			driver.findElement(By.name("Passwd")).sendKeys("ksanjay815", Keys.ENTER);
			driver.findElement(By.name("ConfirmPasswd")).sendKeys("ksanjay815", Keys.ENTER);
			driver.findElement(By.className("VfPpkd-muHVFf-bMcfAe")).click();
			driver.findElement(By.className("VfPpkd-vQzf8d")).click();

			driver.close();
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
