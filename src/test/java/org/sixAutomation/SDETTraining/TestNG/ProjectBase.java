package org.sixAutomation.SDETTraining.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ProjectBase {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Report Initializing");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Initilaizing WebDriver");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Kill WebDriver Session");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Report Finalize");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("get screensshot if test fails");
	}
}
