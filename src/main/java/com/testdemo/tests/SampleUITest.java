package com.testdemo.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testdemo.salesforce.pages.HomePage;
import com.testdemo.salesforce.pages.LoginPage;
import com.testdemo.sample.BaseUITest;

public class SampleUITest extends BaseUITest {
	
	HomePage homePage;
	LoginPage loginPage;
	
	@Override
	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		super.beforeClass();
	}
	
	@Test
	public void verifyHomePage() {
		homePage = new HomePage(browser.getDriver());
		homePage.clickLogin();
	}
	
	@Test
	public void verifyLoginPage() {
		loginPage = new LoginPage(browser.getDriver());
		loginPage.setUsername("pd").setPassword("pa$$w0rd").login();
		assertEquals(
				"Please check your username and password. If you still can't log in, contact your Salesforce administrator.",
				loginPage.getLoginError());
	}
	
	@Override
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		super.afterClass();
	}

}
