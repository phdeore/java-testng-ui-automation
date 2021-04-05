package com.testdemo.sample;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.util.BaseTest;

public class SampleTest extends BaseTest {
	
	@Override
	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		super.beforeClass();
	}
	
	@Test
	public void testIntegerAddition() {
		Assert.assertEquals(3 + 2, 5);
	}
	
	@Test
	public void testFloatAddition() {
		Assert.assertEquals(3.00 + 2.00, 5.00);
	}
	
	@Override
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		super.afterClass();
	}

}
