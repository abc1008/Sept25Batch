package utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import test_script_classes.LoginTestScipt;

public class ListenerClass implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{
		String testCaseName = result.getName();
		ExtentReportHelper.startTest(testCaseName);
		
		try
		{
			LoginTestScipt loginTestScipt = new LoginTestScipt();
			loginTestScipt.performLogin();
		}
		catch (InterruptedException | IOException e)
		{
			e.printStackTrace();
		}
		

		System.out.println("onTestStart : " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{

		System.out.println("onTestSuccess");

	}

	@Override
	public void onTestFailure(ITestResult result)
	{

		System.out.println("onTestFailure");
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("onTestSkipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{

	}

	@Override
	public void onStart(ITestContext context)
	{
		System.out.println("onStart");
	}

	@Override
	public void onFinish(ITestContext context)
	{

		System.out.println("onFinish");
	}

}
