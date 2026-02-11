package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SimpleExtentReport
{

	
	public static void main(String[] args)
	{
		
		ExtentReports extentReport = new ExtentReports();

		String reportPath = "D:\\TRAININGS\\TRAININGS\\NEW BATCH\\Reports\\TestReport.html";
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(reportPath);
		
		extentReport.attachReporter(sparkReport);
		
		
		ExtentTest testCase1 = extentReport.createTest("Test_1");  // start the test case
		
		
		testCase1.log(Status.PASS, "Test Log Pass");
		testCase1.log(Status.FAIL, "Test Log Fail");
		
//		Execution
		
		extentReport.flush(); // ending test case and report file will be generated on path
		
		
	}
}
