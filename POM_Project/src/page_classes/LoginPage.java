package page_classes;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExplicitWait;
import utility.PropertyReader;

public class LoginPage {
	
	WebDriver driver;
	
//	Variables
	private final String textBoxEmailByPath = "//input[@placeholder='Email']";
	private final String textBoxPasswordByPath = "//input[@placeholder='Password']";
	private final String buttonLoginByPath = "//button[@type='submit']";
	private final String dropdownProfileIconById = "page-header-user-dropdown";
	
	
	@FindBy(xpath = dropdownProfileIconById)
	private WebElement dropdownProfileIcon;
	
	
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
	public void login() throws InterruptedException, IOException
	{
		try 
		{
			textBoxEmail.sendKeys(PropertyReader.read("UserId"));
			textBoxPassword.sendKeys(PropertyReader.read("Password"));
			buttonLogin.click();
			
			ExplicitWait.waitUntilElementIsVisibleByLocator(driver, By.id(dropdownProfileIconById));
		
			if(dropdownProfileIcon.isDisplayed())
			{
				System.out.println("Login Successful");
			}
			else
			{
				System.out.println("Login Failed");
			}
			
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in method 'login' : "+e.getMessage());
		}
	}
	
	

}
