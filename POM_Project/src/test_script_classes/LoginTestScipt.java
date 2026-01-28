package test_script_classes;

import page_classes.LoginPage;
import test_suites.LoginTestSuite;

public class LoginTestScipt extends LoginTestSuite
{

	public void performLogin() throws InterruptedException
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login();
	}
	
}
