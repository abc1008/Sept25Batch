package test_script_classes;

import basePack.BaseClass;
import page_classes.HeaderPage;
import utility.ExtentReportHelper;

public class HeaderTestScipt extends BaseClass
{

	public boolean performUpdatePassword()
	{
		boolean testResult = false;

		try
		{
			HeaderPage headerPage = new HeaderPage(driver);
			if (headerPage.updatePassword() == true)
			{
				ExtentReportHelper.logPass("Password updated successfully");
				testResult = true;
			}
			else
			{
				System.out.println("Failed to update password");
				ExtentReportHelper.logFail("Failed to update password");
			}

		}
		catch (Exception e)
		{
			System.out.println("Exception in method :performUpdatePassword " + e.getMessage());
			ExtentReportHelper.logFail("Exception in method :performUpdatePassword " + e.getMessage());
		}

		return testResult;
	}

	public void performLogout()
	{
		HeaderPage headerPage = new HeaderPage(driver);
		headerPage.logout();
	}

}
