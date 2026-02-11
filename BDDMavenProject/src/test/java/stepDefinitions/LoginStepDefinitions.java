package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions
{
	WebDriver driver;
	
	@Given("I have launched the browser")
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // method chaining
	}
	
	@And("hit the url")
	public void hitUrl()
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	
	
	@When("I enter valid credentials")
	public void enterCredentials() throws InterruptedException
	{
		WebElement emailTextBox = driver.findElement(By.id("input-email"));

//		Enter Text :  sendKeysThread.sleep(3000);
		emailTextBox.sendKeys("adityaganjkar8@gmail.com");

		Thread.sleep(3000);

		WebElement passwordTextBox = driver.findElement(By.name("password"));
		passwordTextBox.sendKeys("UnlockMe@123");
	}
	
	
	@And("hit login button")
	public void hitLoginButton()
	{
		driver.findElement(By.xpath("//input[contains(@class,'btn-primary')]")).click();
	}
	
	@Then("I should be logged in successfully")
	public void verifyLogin()
	{
		System.out.println("Login Verified");
	}
	
	

}
