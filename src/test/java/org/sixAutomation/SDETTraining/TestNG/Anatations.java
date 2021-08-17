package org.sixAutomation.SDETTraining.TestNG;

import org.testng.annotations.Test;

public class Anatations {
	
	@Test
	public void loginTest() {
		System.out.println("Test 1");
	}
	
	
	@Test
	public void registrationTest() {
		System.out.println("Test 2");
	}
	
	@Test
	public void homeTest() {
		System.out.println("Test 3");
	}
	
	public void javaTest1() {
		System.out.println("Java Test 1");
	}
	
	public void javaTest2() {
		System.out.println("Java Test 2");
	}
	
	public void javaTest3() {
		System.out.println("Java Test 3");
	}

	
	public static void main(String args[]) {
		Anatations anatations = new Anatations();
		anatations.javaTest1();
		anatations.javaTest3();
		anatations.javaTest2();
	}
}
