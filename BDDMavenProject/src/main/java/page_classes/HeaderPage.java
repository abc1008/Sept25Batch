package page_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExplicitWait;
import utility.ExtentReportHelper;

public class HeaderPage
{

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
		PageFactory.initElements(driver, this); // initialize webelements
	}

//	Methods
	public boolean updatePassword()
	{
		boolean testResult = false;
		try
		{
			dropdownProfileIcon.click();
			ExtentReportHelper.logInfo("Clicked on profile icon.");
			optionChangePassword.click();

			textBoxPassword.sendKeys("abcd@1234");
			textBoxConfirmPassword.sendKeys("abcd@1234");
			buttonUpdate.click();

			if (msgSuccess.getText().contains("Success!"))
			{
				System.out.println("msg : " + msgSuccess.getText());
				System.out.println("Password updated successfully.");
				ExtentReportHelper.logPass("Password updated successfully.");
				testResult = true;
			}
			else
			{
				System.out.println("msg : " + msgSuccess.getText());
				System.out.println("Failed to update password.");
				ExtentReportHelper.logFail("Failed to update password.");
			}

			ExplicitWait.waitUntilInVisibilityOfElement(driver, msgSuccess);
		}
		catch (Exception e)
		{
			ExtentReportHelper.logFail("Exception in method 'updatePassword': " + e.getMessage());
		}

		return testResult;

	}
	
	public void clickProfileIconAndSelectChangePassword()
	{
		dropdownProfileIcon.click();
		ExtentReportHelper.logInfo("Clicked on profile icon.");
		optionChangePassword.click();

	}
	
	public void enterNewPasswordAndConfirmPasswordHitOk() throws InterruptedException
	{
		Thread.sleep(2000);
		textBoxPassword.sendKeys("abcd@1234");
		textBoxConfirmPassword.sendKeys("abcd@1234");
		buttonUpdate.click();
	}
	
	
	public void verifyPasswordChange()
	{
		if (msgSuccess.getText().contains("Success!"))
		{
			System.out.println("Password updated successfully.");
			ExtentReportHelper.logPass("Password updated successfully.");
		}
		else
		{
			System.out.println("Failed to update password.");
			ExtentReportHelper.logFail("Failed to update password.");
		}

		ExplicitWait.waitUntilInVisibilityOfElement(driver, msgSuccess);
	}

	public void logout()
	{
		try
		{
			dropdownProfileIcon.click();
			optionLogout.click();

			ExplicitWait.waitUntilElementIsVisible(driver, textBoxEmail);

			if (textBoxEmail.isDisplayed())
			{
				ExtentReportHelper.logPass("Logout Successful");
			}
			else
			{
				ExtentReportHelper.logFail("Logout Failed");
			}
		}
		catch (Exception e)
		{
			ExtentReportHelper.logFail("Exception in method 'logout': " + e.getMessage());
		}

	}

}
