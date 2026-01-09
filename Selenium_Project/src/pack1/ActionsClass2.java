package pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass2
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver(); // launch browser
		driver.manage().window().maximize(); // method chaining
		driver.get("https://demoqa.com/buttons"); // hit url

		Thread.sleep(3000);

		WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
		
//		scroll
		JavascriptExecutor js = (JavascriptExecutor)driver;  // type-casting
		js.executeScript("arguments[0].scrollIntoView();", rightClickButton);
		
		
		Thread.sleep(2000);

		Actions act = new Actions(driver);
		act.contextClick(rightClickButton).build().perform();   // right click

		String text = driver.findElement(By.id("rightClickMessage")).getText();
		System.out.println(text);
		
		
		WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
		js.executeScript("arguments[0].scrollIntoView();", doubleClickBtn);
		
		
		Thread.sleep(4000);
		act.doubleClick(doubleClickBtn).build().perform();   // doubleClick
		
		String text2= driver.findElement(By.id("doubleClickMessage")).getText();
		System.out.println(text2);
		
		
		

	}
}
;