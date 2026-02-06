package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

import basePack.BaseClass;

public class ExtentReportHelper
{
	private static WebDriver driver;
	private static ExtentReports extentReport;
	private static ExtentTest extentTest;
	
	public ExtentReportHelper(WebDriver driver, String dateTime)
	{
		this.driver = driver;
		extentReport = new ExtentReports();

		String reportPath = "D:\\TRAININGS\\TRAININGS\\NEW BATCH\\Reports\\TestReport_"+dateTime+".html";
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
		extentTest.log(Status.FAIL, message, printScreen(driver));
	}
	
	public static void logInfo(String message)
	{
		extentTest.log(Status.INFO, message);
	}
	
	public static void endTest()
	{
		extentReport.flush();
	}
	
	
	public static Media printScreen(WebDriver driver)
	{
		TakesScreenshot screen = (TakesScreenshot) driver;
		String screenshot = screen.getScreenshotAs(OutputType.BASE64); // capture screenshot

		return MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot).build();
		
	}

}
