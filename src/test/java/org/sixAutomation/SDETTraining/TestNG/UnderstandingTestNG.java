package org.sixAutomation.SDETTraining.TestNG;

import org.testng.annotations.*;

public class UnderstandingTestNG {
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	
	@Test
	public void test() {
		System.out.println("Test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}

}
