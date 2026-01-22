package pack1;

import org.testng.annotations.Test;

public class TestClass3 
{

	@Test(priority = 3)
	public void testCase5() {
		System.out.println("testCase5");
	}

	@Test(priority = 1)
	public void testCase4() {
		System.out.println("testCase4");
	}

}
