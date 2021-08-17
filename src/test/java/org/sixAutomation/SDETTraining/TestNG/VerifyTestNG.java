package org.sixAutomation.SDETTraining.TestNG;

import org.testng.annotations.*;

public class VerifyTestNG extends ProjectBase{
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Test Data initialization");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Test Data Closure");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Login Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Logout Method");
	}
	
	@Test(dependsOnMethods = "booking")
	public void transactionTest() {
		System.out.println("Transaction Test");
	}

	@Test(dependsOnMethods = "loginTest")
	public void booking() {
		System.out.println("Booking Ticket Test");
	}
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
	}
}
