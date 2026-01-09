package pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver(); // launch browser
		driver.manage().window().maximize(); // method chaining
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // hit url

		Thread.sleep(6000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		
//		getWindowHandle();
		
		 String mainWinId = driver.getWindowHandle();  // currently focused window 
		 System.out.println("mainWinId : "+mainWinId);
		 
		 
		 Set<String> allWins = driver.getWindowHandles(); // all win ids which are currently open
		 
		 
		 for(String win : allWins)
		 {
			 if(!win.equals(mainWinId))
			 {
//				 driver.switchTo().window(win);  // switch selenium focus to another window
				 System.out.println(win);
			 }
		 }
		 
		 
//		 Code to switch to Nth window 
		 
		 
//		 driver.switchTo().window(win); 
		 

//		 Convert above set into a List
		 
		 List<String> listWindowHandles = new ArrayList<String>(allWins);
		 
		 System.out.println();
		 System.out.println("Window Handles using List");
		 System.out.println();
		 
		 
		 
		 for(String win : listWindowHandles)
		 {
			 if(!win.equals(mainWinId))
			 {
				 System.out.println(win);
			 }
		 }
		 
		 driver.switchTo().window(listWindowHandles.get(3));
		 System.out.println("switched to window : "+ listWindowHandles.get(3));

		 
		 Thread.sleep(2000);
		 driver.findElement(By.id("Form_submitForm_EmailHomePage")).sendKeys("ag89111@gmail.com");
		 
		 
		 
	}
}

