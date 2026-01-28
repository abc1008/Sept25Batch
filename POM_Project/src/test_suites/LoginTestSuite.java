package test_suites;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import test_script_classes.LoginTestScipt;

public class LoginTestSuite {

	public static WebDriver driver;
	
	@BeforeMethod
	public void initDriver()
	{
		driver = new ChromeDriver(); // launch browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize(); // method chaining
		driver.get("https://devsite.testometer.co.in/login"); // hit url
	}
	
	
	
	@Test
	public void tc_123_LoginTest() throws InterruptedException
	{
		LoginTestScipt loginTestScipt = new LoginTestScipt();
		loginTestScipt.performLogin();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
