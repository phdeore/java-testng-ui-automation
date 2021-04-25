package com.testdemo.sample;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BaseAPITest extends BaseTest {
	
	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		System.out.println("In API.BeforeClass...");
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		System.out.println("In API.AfterClass...");
	}

}
