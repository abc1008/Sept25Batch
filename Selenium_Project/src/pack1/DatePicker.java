package pack1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver(); // launch browser
		driver.manage().window().maximize(); // method chaining
		driver.get("https://demo.automationtesting.in/Datepicker.html"); // hit url

		Thread.sleep(3000);
	
		
		driver.findElement(By.id("datepicker1")).click();
		Thread.sleep(2000);
		
	
		 
		 // List/array --  all months  -- HW 
		 
		 while(true)
		 {
			 WebElement monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			 WebElement prevButton = driver.findElement(By.xpath("//a[@title='Prev']"));
			 
			 String monthYearText = monthYear.getText();
			 
			 if(!monthYearText.equals("October 2025"))
			 {
				 prevButton.click();
			 }
			 else
			 {
				 break;
			 }
		 }
		 
		 driver.findElement(By.xpath("//a[text()='25']")).click();
		
		
		
	}
}

