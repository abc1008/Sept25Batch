package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;


public class Screenshot{
	
	public static void printScreen(WebDriver driver) throws IOException
	{
		TakesScreenshot screen = (TakesScreenshot) driver;
		File screenshot = screen.getScreenshotAs(OutputType.FILE); // capture screenshot
		File path = new File("D:\\TRAININGS\\TRAININGS\\NEW BATCH\\Screenshot\\TestScreen.png");
		Files.copy(screenshot, path);
	}

}
