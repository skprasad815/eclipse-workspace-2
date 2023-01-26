package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Reading_Properties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println(System.getProperty("user.dir"));
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("E:\\onlinebatch\\seleniumprg\\src\\TestNG\\Emloyee.properties");
	     prop.load(ip);
	     System.out.println(prop.getProperty("name"));
	     System.out.println(prop.getProperty("hobbies"));
	     System.out.println(prop.getProperty("empid"));
	     
	}

}
