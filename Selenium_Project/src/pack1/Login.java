package pack1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import utility.PropertyReader;
import utility.Screenshot;

public class Login{
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		if(PropertyReader.read("Browser").equalsIgnoreCase("CHROME"))
		{
			driver = new ChromeDriver(); // launch browser
		}
		else
		{
			driver = new EdgeDriver(); // launch browser
		}
		
		
		
		
		driver.manage().window().maximize(); // method chaining
		driver.get(PropertyReader.read("TestSiteUrl")); // hit url

		Thread.sleep(3000);

//		 locate webelement - findElement
		WebElement emailTextBox = driver.findElement(By.id("input-email"));

//		Enter Text :  sendKeysThread.sleep(3000);
		emailTextBox.sendKeys(PropertyReader.read("UserId"));

		Thread.sleep(3000);

		WebElement passwordTextBox = driver.findElement(By.name("password"));
		passwordTextBox.sendKeys(PropertyReader.read("Password"));

		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();

//		ACtions Class Click

		WebElement button = driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]"));

		Actions act = new Actions(driver);
		act.click(button).build().perform();

//		Code to take screenshot

		boolean isErrorDisplayed = driver.findElement(By.xpath("//div[contains(@class,'alert-danger')]")).isDisplayed();
		if (isErrorDisplayed == true) 
		{
//			TakesScreenshot screen = (TakesScreenshot) driver;
//			File screenshot = screen.getScreenshotAs(OutputType.FILE); // capture screenshot
//			File path = new File("D:\\TRAININGS\\TRAININGS\\NEW BATCH\\Screenshot\\TestScreen.png");
//			Files.copy(screenshot, path);
			
			Screenshot.printScreen(driver);
			System.out.println("Screenshot Taken");
			
//			15012026_19_50_32
		}

	}

}
