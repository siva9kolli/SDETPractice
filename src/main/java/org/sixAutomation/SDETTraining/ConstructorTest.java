package org.sixAutomation.SDETTraining;

public class ConstructorTest {
	
	public void test1() {
		System.out.println("Method Test");
	}
	
	public ConstructorTest() {
		System.out.println("Constructor Test");
	}
	
	public ConstructorTest(String name) {
		System.out.println("Constructor Test" + name);
	}
	
	public ConstructorTest(int number) {
		System.out.println("Constructor Test" + number);
	}
	
	public static void main(String args[]) {
		ConstructorTest constructorTest = new ConstructorTest();
		ConstructorTest constructorTest1 = new ConstructorTest("Automation");
		ConstructorTest constructorTest2 = new ConstructorTest(1);
		constructorTest.test1();
		constructorTest1.test1();
		
		//constructorTest = new ConstructorTest();
	}

}
