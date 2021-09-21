package org.sixAutomation.SDETTraining.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNGExecutions2 {

	@Test(groups = {"smoke"})
	public void test5() {
		System.out.println("Exevuting Test5");
	}
	
	@Test(groups = "reg")
	public void test6() {
		System.out.println("Exevuting Test6");
	}

}
