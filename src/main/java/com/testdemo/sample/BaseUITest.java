package com.testdemo.sample;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testdemo.salesforce.pages.HomePage;

import framework.util.Browser;

import org.testng.annotations.AfterClass;

public class BaseUITest extends BaseTest {
	
	public Browser browser;
	
	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		browser = new Browser();
		System.out.println("In UI.BeforeClass...");
	}
	
	
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		System.out.println("In UI.AfterClass...");
		browser.quit();
	}

}
