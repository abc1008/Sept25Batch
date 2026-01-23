package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Assrtions 
{

	
	@Test
	public void testCase1()
	{
		System.out.println("testCase1");
		
		Assert.fail();   // its used to mark test case as fail.
		
		System.out.println("After Assert");
		
	}
	
	
	@Test
	public void testCase2()
	{
		System.out.println("testCase2");
		
		SoftAssert sa = new SoftAssert();
		sa.fail();
		
		System.out.println("After Assert");
		
		sa.assertAll(); // apply the assertion to a test case
		
		
		System.out.println("After assertAll");
	}
	
	

	
	
	

}
