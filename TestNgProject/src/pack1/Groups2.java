package pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groups2 
{


	@Test(groups = "REGRESSION")
	public void testCase5() {
		System.out.println("testCase5");
	}

	@Test(groups = "SMOKE")
	public void testCase6() {
		System.out.println("testCase6");
	}

	@Test(groups = "REGRESSION")
	public void testCase7() {
		System.out.println("testCase7");
	}
	

	@Test(groups = "SMOKE")
	public void testCase8() {
		System.out.println("testCase8");
	}
	

}
