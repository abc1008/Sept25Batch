package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Assrtions2 
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
		
		String dataFromUi = "ABC";
		
		Assert.assertEquals(dataFromUi, "ABC");
		
	}
	
	
	@Test
	public void testCase3()
	{
		System.out.println("testCase3");
		
		String dataFromUi = "ABC";
		
		Assert.assertNotEquals(dataFromUi, "ABC");
		
	}
	
	
	@Test
	public void testCase4()
	{
		System.out.println("testCase4");
		
		String dataFromUi = "ABC";
		
		Assert.assertTrue(dataFromUi.equals("PQR"));
		
	}
	
	@Test
	public void testCase5()
	{
		System.out.println("testCase5");
		
		String dataFromUi = "ABC";
		
		Assert.assertFalse(dataFromUi.equals("PQR"));
		
	}
	
	

	
	
	

}
