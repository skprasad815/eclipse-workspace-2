package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junitannot {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setupclass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("teardownclass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("teardown");
	}

	@Test
	public void a1002() {
		System.out.println("a1001");
	}

	@Test
	
		public void a1001()
		{
		System.out.println("a1002");
	}
	

}
