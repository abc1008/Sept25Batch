package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import utility.JSMethods;

public class Wait2 {

	
	public static void main(String[] args) throws InterruptedException{
		
		
		WebDriver driver = new ChromeDriver();  // launch browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // dynamic wait
		driver.manage().window().maximize();  // method chaining
		driver.get("https://demoqa.com/alerts");  // hit url
		
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.id("timerAlertButton"));
		JSMethods.clickUsingJavaScript(driver, ele);
		System.out.println("Clicked");
		
//		SYNTAX: Explicit
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
		
		
//		SYNTAX: Fluent Wait
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(250))    // 500 milliseconds
				.ignoring(NullPointerException.class);
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		driver.switchTo().alert().accept();
		
		
		
		
	}
}
