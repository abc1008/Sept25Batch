package test_suites;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import basePack.BaseClass;
import test_script_classes.HeaderTestScipt;


@Listeners(utility.ListenerClass.class)
public class HeaderTestSuite extends BaseClass
{
	
	@Test
	public void tc_123_UpdatePasswordTest()
	{
		Assert.assertTrue( new HeaderTestScipt().performUpdatePassword());
	}
	
	
//	Before Suite
	
	
}
