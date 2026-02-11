package hooks;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import page_classes.HeaderPage;
import utility.ExtentReportHelper;
import utility.PropertyReader;

public class Hooks
{
	public static WebDriver driver;
	
	@BeforeAll
	public static void before_All() throws IOException, InterruptedException
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
	

	
	@After
	public void after()
	{
		System.out.println("Logout Code");
		
		HeaderPage headerPage = new HeaderPage(driver);
		headerPage.logout();
		
	}
	
	
	@AfterAll
	public static void after_All()
	{
		ExtentReportHelper.endTest();
		driver.quit();
	}
	

}
