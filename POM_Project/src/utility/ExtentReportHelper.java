package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportHelper
{
	private static ExtentReports extentReport;
	private static ExtentTest extentTest;
	
	public ExtentReportHelper()
	{
		extentReport = new ExtentReports();

		String reportPath = "D:\\TRAININGS\\TRAININGS\\NEW BATCH\\Reports\\TestReport.html";
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(reportPath);
		extentReport.attachReporter(sparkReport);
	}
	
	
	public static void startTest(String testCaseName)
	{
		extentTest = extentReport.createTest(testCaseName);
	}
	
	
	public static void logPass(String message)
	{
		extentTest.log(Status.PASS, message);
	}
	
	public static void logFail(String message)
	{
		extentTest.log(Status.FAIL, message);
	}
	
	public static void logInfo(String message)
	{
		extentTest.log(Status.INFO, message);
	}
	
	public static void endTest()
	{
		extentReport.flush();
	}

}
