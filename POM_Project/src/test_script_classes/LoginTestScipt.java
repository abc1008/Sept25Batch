package test_script_classes;

import java.io.IOException;
import java.security.cert.Extension;

import basePack.BaseClass;
import page_classes.LoginPage;
import utility.ExtentReportHelper;

public class LoginTestScipt extends BaseClass
{

	public void performLogin() throws InterruptedException, IOException
	{
		try
		{
			LoginPage loginPage = new LoginPage(driver);
			
			if(loginPage.login())
			{
				ExtentReportHelper.logPass("User logged in.");
			}
			else
			{
				System.out.println("User login failed.");
			}
		}
		catch (IOException e)
		{
			System.out.println("Exception in method : performLogin "+e.getMessage());
		}
	}
	
}
