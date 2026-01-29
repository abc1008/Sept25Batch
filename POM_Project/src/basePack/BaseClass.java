package basePack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import test_script_classes.HeaderTestScipt;
import test_script_classes.LoginTestScipt;
import utility.PropertyReader;

public class BaseClass {

	public static WebDriver driver;
	
	@BeforeSuite
	public void initDriver() throws IOException
	{
		if(PropertyReader.read("Browser").equalsIgnoreCase("CHROME"))
		{
			driver = new ChromeDriver(); // launch browser
		}
		else if(PropertyReader.read("Browser").equalsIgnoreCase("EDGE"))
		{
			driver = new EdgeDriver(); // launch browser
		}
		else
		{
			System.out.println("Invalid Browser");
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize(); // method chaining
		driver.get(PropertyReader.read("TestSiteUrl")); // hit url
	}
	
	@BeforeMethod
	public void login() throws InterruptedException, IOException
	{
		LoginTestScipt loginTestScipt = new LoginTestScipt();
		loginTestScipt.performLogin();
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
		driver.quit();
	}
	
}
