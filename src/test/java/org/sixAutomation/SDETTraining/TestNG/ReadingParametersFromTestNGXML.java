package org.sixAutomation.SDETTraining.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ReadingParametersFromTestNGXML {
	
	@Test(groups = "smoke")
	public void test1() {
		System.out.println("Exevuting Test1");
	}
	
	@Test(dependsOnMethods = "test1", groups= {"reg"})
	public void test2() {
		System.out.println("Exevuting Test2");
	}


}
