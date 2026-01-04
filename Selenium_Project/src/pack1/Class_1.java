package pack1;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_1
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();  // launch browser
		driver.manage().window().maximize();  // method chaining
		driver.get("https://www.facebook.com/");  // hit url
		
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
//		driver.close();   // close only currently focused window
		driver.quit();   // close entire browser
		
		
		
		
	}
	
	
	
	
}
