package com.testdemo.sample;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BaseTest {
	
	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		System.out.println("In BeforeClass...");
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		System.out.println("In AfterClass...");
	}

}
