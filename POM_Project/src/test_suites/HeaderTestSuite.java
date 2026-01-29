package test_suites;

import org.testng.annotations.Test;

import basePack.BaseClass;
import test_script_classes.HeaderTestScipt;

public class HeaderTestSuite extends BaseClass
{

	
	@Test
	public void tc_123_UpdatePasswordTest()
	{
		HeaderTestScipt headerTestScipt = new HeaderTestScipt();
		headerTestScipt.performUpdatePassword();
	}
	
}
