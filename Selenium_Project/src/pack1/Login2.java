package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login2
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();  // launch browser
		driver.manage().window().maximize();  // method chaining
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  // hit url
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.partialLinkText("OrangeHRM,")).click();
		
		
		

		
		
	}

}
