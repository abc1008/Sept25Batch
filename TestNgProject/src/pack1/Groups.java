package pack1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groups {

	@Test(groups = "SMOKE")
	public void testCase1() {
		System.out.println("testCase1");
		Assert.fail();
	}

	@Test(groups = "REGRESSION")
	public void testCase2() {
		System.out.println("testCase2");
	}

	@Test(groups = "SMOKE", dependsOnMethods = "testCase1")
	public void testCase3() {
		System.out.println("testCase3");
	}

	@Test(priority = 6, groups = "REGRESSION")
	public void testCase4() {
		System.out.println("testCase4");
	}
	
	@Test(priority = 6, dependsOnGroups = "SMOKE")
	public void testCase11() {
		System.out.println("testCase4");
	}

}
