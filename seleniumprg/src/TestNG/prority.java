package TestNG;

import org.testng.annotations.Test;

public class prority {
  
	  
	 
			@Test(priority=0)
			public void testCase1() {  
				System.out.println("Test Case 1");
				
			}
			@Test(priority=-1)
			public void testCase2() { 	 
				System.out.println("Test Case 2");
			}
  }

