package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass3
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();  // launch browser
		driver.manage().window().maximize();  // method chaining
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");  // hit url
		
		Thread.sleep(3000);
		
		
//		 locate webelement - findElement
		WebElement emailTextBox = driver.findElement(By.id("input-email"));
		
//		Enter Text :  sendKeysThread.sleep(3000);
		emailTextBox.sendKeys("ag89111@gmail.com");
		
		
		Thread.sleep(3000);

//		Sending Keyboard Keys
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB)
				.sendKeys("Password01")
				.sendKeys(Keys.TAB)
				.sendKeys(Keys.TAB)
				.sendKeys(Keys.ENTER)   // on login button
				.build()
				.perform();
		
		
		
	
		
		
		
	}

}
