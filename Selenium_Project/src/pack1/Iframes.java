package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver(); // launch browser
		driver.manage().window().maximize(); // method chaining
		driver.get("https://ui.vision/demo/webtest/frames/"); // hit url

		Thread.sleep(3000);
		
		
		// switch selenium focus from main webpage to that frame
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		
		WebElement textBox = driver.findElement(By.xpath("//input[@name='mytext3']"));
		textBox.sendKeys("ABC");
		
		Thread.sleep(3000);
		
//		switch selenium focus from iframe to main window
		
		driver.switchTo().defaultContent();
		
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		
		WebElement textBox2 = driver.findElement(By.xpath("//input[@name='mytext4']"));
		textBox2.sendKeys("PQR");
	
		
		
		driver.switchTo().defaultContent();
//		frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);  
		System.out.println("Switched to frame 3");
		
		WebElement frameInFrame = driver.findElement(By.xpath("//iframe[contains(@src,'https://docs.google.com/forms/d/1yfUq-G')]"));
		driver.switchTo().frame(frameInFrame);  
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='I am a human']")).click();
	
	
		driver.switchTo().defaultContent();
		
		
		
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1); 
		
		Thread.sleep(2000);
		WebElement textBox3 = driver.findElement(By.xpath("//input[@name='mytext1']"));
		textBox3.sendKeys("XYZ");
		
	
		

	}

}
