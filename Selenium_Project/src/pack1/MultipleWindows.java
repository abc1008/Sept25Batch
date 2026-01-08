package pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleWindows
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver(); // launch browser
		driver.manage().window().maximize(); // method chaining
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // hit url

		Thread.sleep(6000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		// 2 - 
		
//		getWindowHandle();
		
		 String mainWinId = driver.getWindowHandle();  // currently focused window 
		 System.out.println(mainWinId);
		 
		 
		 Set<String> allWins = driver.getWindowHandles(); // all win ids which are currently open
		 
		 
		 for(String win : allWins)
		 {
			 if(!win.equals(mainWinId))
			 {
				 driver.switchTo().window(win);
				 System.out.println("switched to win : "+ win);
			 }
		 }
		 
		

	}
}

