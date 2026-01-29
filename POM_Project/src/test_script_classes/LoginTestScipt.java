package test_script_classes;

import java.io.IOException;

import basePack.BaseClass;
import page_classes.LoginPage;

public class LoginTestScipt extends BaseClass
{

	public void performLogin() throws InterruptedException, IOException
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login();
	}
	
}
