package TestNG;

import org.testng.annotations.DataProvider;

public class Dataprovider1 {
	@DataProvider
	//(name="regTestDataProvider")
	public  Object[][] getData(){
		Object data[][] = new Object[2][3];
		
		data[0][0]="U1";
		data[0][1]="P1";
		data[0][2]="xyz@gmail.com";
		
		data[1][0]="U2";
		data[1][1]="P2";
		data[1][2]="abc@gmail.com";
		
		return data ;
}
	public void testlogin(String uname,String pwd,String email)
	{
		System.out.println("---"+uname +pwd + email);
	}
}
