package pack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver(); // launch browser
		driver.manage().window().maximize(); // method chaining
		driver.get("https://demoqa.com/alerts"); // hit url

		Thread.sleep(3000);

		WebElement button = driver.findElement(By.id("confirmButton"));

//		javascript click
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);

		Thread.sleep(3000);

		Alert alert = driver.switchTo().alert();
		alert.dismiss();   // -- to click on Cancel button 
//		alert.accept();  -- to click on OK button 

	}

}
