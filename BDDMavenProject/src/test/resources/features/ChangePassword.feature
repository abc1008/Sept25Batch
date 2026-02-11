Feature: Change Password feature
	
	@Smoke
  Scenario: Verify change password with valid data
    Given navigate to Change Password screen
    When I enter new password, confirm password and hit ok button
    Then password should be changed successfully
    
    
  @Regression
  Scenario: Verify change password with invalid data
    Given navigate to Change Password screen
    When I enter new password, confirm password and hit ok button
    Then password should be changed successfully