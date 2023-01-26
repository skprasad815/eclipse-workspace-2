package TestNGpkg;

public class DataProvider {

	public static void main(String[] args) {
		
	}
		public  Object[][] getData(){
			Object data[][] = new Object[2][3];
			
			data[0][0]="U1";
			data[0][1]="P1";
			data[0][2]="xyz@gmail.com";
			
			data[1][0]="U2";
			data[1][1]="P2";
			data[1][2]="abc@gmail.com";
			
			return data;
	}
		public void testlogin(String uname,String pwd,String email)
		{
			System.out.println("---"+uname +pwd + email);
		}}

