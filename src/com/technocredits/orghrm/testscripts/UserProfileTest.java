package com.technocredits.orghrm.testscripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.technocredits.orghrm.base.PredefinedActions;
import com.technocredits.orghrm.pages.LoginPage;

public class UserProfileTest {

	@BeforeMethod
	public void setup() {
		System.out.println("STEP - Launch OrgHrm Application");
		PredefinedActions.start();
		LoginPage loginPage = new LoginPage();
		loginPage.enterCredentials("Admin", "0OGYrZ8kw@");
		System.out.println("Click on Login button");
		loginPage.clickOnLoginButton();
	}
	
	@Test
	public void verfiyUserMenuOptions() {
		
	}
}
