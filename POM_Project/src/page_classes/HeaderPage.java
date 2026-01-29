package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExplicitWait;

public class HeaderPage {
	
	WebDriver driver;
	
//	Variables
	private final String dropdownProfileIconById = "page-header-user-dropdown";
	private final String optionChangePasswordByXpathPath = "//span[text()='Change Password']";
	private final String textBoxPasswordByXpathPath = "//form[@id='form-update-user-password']//input[@name='password']";
	private final String textBoxConfirmPasswordByXpathPath = "//form[@id='form-update-user-password']//input[@name='confirm_pass']";
	private final String buttonUpdateByXpath = "//button[@type='submit' and text()='Update']";
	private final String msgSuccessByXpath = "//span[@class='jconfirm-title']";
	private final String optionLogoutByXpathPath = "//span[text()='Logout']";
	private final String textBoxEmailByPath = "//input[@placeholder='Email']";
	
	
	@FindBy(xpath = textBoxEmailByPath)
	private WebElement textBoxEmail;
	
	@FindBy(xpath = optionLogoutByXpathPath)
	private WebElement optionLogout;
	
	@FindBy(id = dropdownProfileIconById)
	private WebElement dropdownProfileIcon;
	
	@FindBy(xpath = optionChangePasswordByXpathPath)
	private WebElement optionChangePassword;
	
	@FindBy(xpath = textBoxPasswordByXpathPath)
	private WebElement textBoxPassword;
	
	@FindBy(xpath = textBoxConfirmPasswordByXpathPath)
	private WebElement textBoxConfirmPassword;
	
	@FindBy(xpath = buttonUpdateByXpath)
	private WebElement buttonUpdate;
	
	@FindBy(xpath = msgSuccessByXpath)
	private WebElement msgSuccess;
	
	
//	Constructor
	public HeaderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);   // initialize webelements
	}
	

//	Methods
	public void updatePassword()
	{
		try 
		{
			dropdownProfileIcon.click();
			optionChangePassword.click();
			
			textBoxPassword.sendKeys("abcd@1234");
			textBoxConfirmPassword.sendKeys("abcd@1234");
			buttonUpdate.click();
			
			if(msgSuccess.getText().contains("Success!"))
			{
				System.out.println("Password updated successfully.");
			}
			else
			{
				System.out.println("Failed to update password.");
			}
			
			ExplicitWait.waitUntilInVisibilityOfElement(driver,msgSuccess);
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in method 'updatePassword': "+e.getMessage());
		}

	}
	
	public void logout()
	{
		try {
			dropdownProfileIcon.click();
			optionLogout.click();
			
			ExplicitWait.waitUntilElementIsVisible(driver, textBoxEmail);

			if(textBoxEmail.isDisplayed())
			{
				System.out.println("Logout Successful");
			}
			else
			{
				System.out.println("Logout Failed");
			}
		} 
		catch (Exception e) {
			System.out.println("Exception in method 'logout': "+e.getMessage());
		}
	
	}
	
	
	

}
