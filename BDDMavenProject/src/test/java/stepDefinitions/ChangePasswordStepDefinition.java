package stepDefinitions;


import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_classes.HeaderPage;
import page_classes.LoginPage;

public class ChangePasswordStepDefinition
{
	HeaderPage headerPage;
	LoginPage loginPage;
	
	public ChangePasswordStepDefinition()
	{
		headerPage = new HeaderPage(Hooks.driver);
		loginPage = new LoginPage(Hooks.driver);
	}
	
	
	@Given("navigate to Change Password screen")
	public void navigateToChangePassword()
	{
		headerPage.clickProfileIconAndSelectChangePassword();
	}
	
	
	@When("I enter new password, confirm password and hit ok button")
	public void enterPasswords() throws InterruptedException
	{
		headerPage.enterNewPasswordAndConfirmPasswordHitOk();
	}

	
	
	@Then("password should be changed successfully")
	public void verifyPasswordChange()
	{
		headerPage.verifyPasswordChange();
	}
	

}
