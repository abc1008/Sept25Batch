package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver(); // launch browser
		driver.manage().window().maximize(); // method chaining
		driver.get("https://testing.qaautomationlabs.com/checkbox.php"); // hit url

		Thread.sleep(3000);
		
		 WebElement chkbox = driver.findElement(By.xpath("//input[@id='chk3']"));
		 
		 boolean isEnabled = chkbox.isEnabled();
		 
		 if(isEnabled == true)
		 {
			 System.out.println("Checkbox is enabled");
		 }
		 else
		 {
			 System.out.println("Checkbox is not enabled");
		 }

		
		
	}
}

