package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();  // launch browser
		driver.manage().window().maximize();  // method chaining
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");  // hit url
		
		Thread.sleep(3000);
		
		
//		 locate webelement - findElement
		WebElement emailTextBox = driver.findElement(By.id("input-email"));
		
//		Enter Text :  sendKeys
		emailTextBox.sendKeys("ag89111@gmail.com");
		
		
	}

}
