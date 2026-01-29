package test_script_classes;

import basePack.BaseClass;
import page_classes.HeaderPage;

public class HeaderTestScipt extends BaseClass{
	
	public void performUpdatePassword()
	{
		HeaderPage headerPage = new HeaderPage(driver);
		headerPage.updatePassword();
	}
	
	public void performLogout()
	{
		HeaderPage headerPage = new HeaderPage(driver);
		headerPage.logout();
	}

}
