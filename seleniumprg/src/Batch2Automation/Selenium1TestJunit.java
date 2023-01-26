package Batch2Automation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Selenium1TestJunit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");//browser
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");//dr4iver.quit
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");//login
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");//close
	}

	@Test
	public void test() {//inbox
		System.out.println("Test1");
	}

	@Test
	public void test2() {//sentitem
		System.out.println("Test2");
	}

}
