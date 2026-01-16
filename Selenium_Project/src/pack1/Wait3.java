package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;
import utility.ExplicitWait;
import utility.JSMethods;

public class Wait3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver(); // launch browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // dynamic wait
		driver.manage().window().maximize(); // method chaining
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html"); // hit url

//		Thread.sleep(3000);

		driver.findElement(By.id("btn1")).click();

//		SYNTAX: Explicit

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));
		
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(250))    // 500 milliseconds
				.ignoring(NullPointerException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));
		

		driver.findElement(By.id("txt1")).sendKeys("ABC");

		driver.findElement(By.id("btn2")).click();

		WebElement text2 = driver.findElement(By.id("txt2"));
		ExplicitWait.waitUntilElementIsVisible(driver, text2, 15);

		driver.findElement(By.id("txt2")).sendKeys("PQR");
		
		
		
//		Visibility of elem
//		Invisiblity of ele
//		ele to be Clickable
//		Alert to be present
//		frameToBeAvailableAndSwitchToIt
//		numberOfWindowsToBe
		
		
	}
}
