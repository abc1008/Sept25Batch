package pack1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 
{

	
	@Test(priority = 3)
	public void testCase1()
	{
		System.out.println("testCase1");
	}
	
	
	@Test(priority = 1, invocationCount = 4)
	public void testCase2()
	{
		System.out.println("testCase2");
	}
	
	@Test(priority = -2, enabled = false)
	public static void ztestCase3()
	{
		System.out.println("testCase3");
	}
	
	@Test(priority = 2)
	public static void testCase4()
	{
		System.out.println("testCase4");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	
	
	

}
