package basePack;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import test_script_classes.HeaderTestScipt;
import utility.ExtentReportHelper;
import utility.PropertyReader;

public class BaseClass
{

	public static WebDriver driver;

	@BeforeSuite
	public void initDriver() throws IOException
	{
		
		LocalDateTime time = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd_MM_yy_hhmmss");
		
		String formattedDate =  time.format(format);
		
		System.out.println(formattedDate);
		
		
		if (PropertyReader.read("Browser").equalsIgnoreCase("CHROME"))
		{
			driver = new ChromeDriver(); // launch browser
		}
		else if (PropertyReader.read("Browser").equalsIgnoreCase("EDGE"))
		{
			driver = new EdgeDriver(); // launch browser
		}
		else
		{
			System.out.println("Invalid Browser");
		}

		ExtentReportHelper extentReportHelper = new ExtentReportHelper(driver, formattedDate);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize(); // method chaining
		driver.get(PropertyReader.read("TestSiteUrl")); // hit url
	}

	@BeforeMethod
	public void login() throws InterruptedException, IOException
	{
//		ExtentReportHelper.startTest("Test_1");
//		LoginTestScipt loginTestScipt = new LoginTestScipt();
//		loginTestScipt.performLogin();
	}

	@AfterMethod
	public void logout()
	{
		HeaderTestScipt headerTestScipt = new HeaderTestScipt();
		headerTestScipt.performLogout();
	}

	@AfterSuite
	public void tearDown()
	{
		ExtentReportHelper.endTest();
		driver.quit();
	}

}
