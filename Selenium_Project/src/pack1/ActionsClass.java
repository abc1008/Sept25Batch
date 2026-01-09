package pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver(); // launch browser
		driver.manage().window().maximize(); // method chaining
		driver.get("https://tutorialsninja.com/demo/"); // hit url

		Thread.sleep(3000);

		WebElement mp3Player = driver.findElement(By.xpath("//a[text()='MP3 Players']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(mp3Player).build().perform();   //mouse hover
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Show AllMP3 Players']")).click();
	
		
		
		
		

	}
}
