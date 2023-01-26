package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotationprg12 {
  @Test(priority = 3)
  public void vTest1() {
	  System.out.println("testcases");
  }
  @Test(priority = 2)
  public void bTest2() {
	 System.out.println("testcases2");
  }
  @Test(priority = 1)
  public void gTest3() {
	  System.out.println("testcases3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("aftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeclassz");
	  //login
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforetest");
	  //url
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforesuite");
	  //browser
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("aftersuite");
  }

}
