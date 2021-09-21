package org.sixAutomation.SDETTraining.TestNG;

import org.testng.annotations.Test;

public class TestNGExecutions1 {

	@Test
	public void test3() {
		System.out.println("Exevuting Test3");
	}
	
	@Test(dependsOnMethods = "test3", groups = {"smoke", "reg"})
	public void test4() {
		System.out.println("Exevuting Test4");
	}

}
