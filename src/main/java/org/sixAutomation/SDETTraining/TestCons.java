package org.sixAutomation.SDETTraining;

public class TestCons extends ConstructorTest{
	
	public TestCons() {
		System.out.println("TestCons");
	}
	
	public TestCons(String name) {
		System.out.println("TestCons"  +name);
	}
	
	public static void main(String args[]) {
		TestCons testCons = new TestCons();
		TestCons testCons1 = new TestCons("Selenium");
		
	}

}
