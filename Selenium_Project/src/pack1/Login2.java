package pack1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login2
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();  // launch browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // dynamic wait
		driver.manage().window().maximize();  // method chaining
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  // hit url
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
		
		
		
		
		
		

		
		
	}

}
