package pack1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver(); // launch browser
		driver.manage().window().maximize(); // method chaining
		driver.get("https://www.facebook.com/r.php?entry_point=login"); // hit url

		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//select[@id='day']")).click();
//		
//		Thread.sleep(2000);
		
		List<WebElement> allDays = driver.findElements(By.xpath("//select[@id='day']//option"));
		
		
		for(WebElement day : allDays)
		{
			System.out.println(day.getText());
			
			if(day.getText().equals("10"))
			{
				day.click();
			}
		}
		
		Thread.sleep(2000);
		
 		 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
 		 Select select = new Select(month);
 		 
// 		 select.selectByIndex(4);
 		 
// 		select.selectByValue("6");

 		 select.selectByVisibleText("Dec");
		
	}
}

