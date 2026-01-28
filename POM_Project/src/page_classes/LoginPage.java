package page_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
//	Variables
	private final String textBoxEmailByPath = "//input[@placeholder='Email']";
	private final String textBoxPasswordByPath = "//input[@placeholder='Password']";
	private final String buttonLoginByPath = "//button[@type='submit']";
	
	
	@FindBy(xpath = textBoxEmailByPath)
	private WebElement textBoxEmail;
	
	@FindBy(xpath = textBoxPasswordByPath)
	private WebElement textBoxPassword;
	
	@FindBy(xpath = buttonLoginByPath)
	private WebElement buttonLogin;
	
	
//	Constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);   // initialize webelements
	}
	

//	Methods
	public void login() throws InterruptedException
	{
		textBoxEmail.sendKeys("adityaganjkar88@gmail.com");
		textBoxPassword.sendKeys("abcd@1234");
		buttonLogin.click();
		
		
		Thread.sleep(5000);
	}
	
	

}
