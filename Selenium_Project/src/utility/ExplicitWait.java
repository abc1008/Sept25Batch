package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
//	final int timeInSeconds = 10;
	
//	public ExplicitWait(int timeInSeconds)
//	{
//		this.timeInSeconds = timeInSeconds;
//	}
	
	
	public static void waitUntilElementIsVisible(WebDriver driver, WebElement ele,int timeInSeconds)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

}
