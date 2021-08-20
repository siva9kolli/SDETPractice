package org.sixAutomation.SDETTraining;

public class InterfaceUnderstanding extends InterfaceChild{
	
	

	public static void main(String args[]) {
//		
		InterfaceUnderstanding interfaceUnderstanding = new InterfaceUnderstanding();
		interfaceUnderstanding.test1();
		interfaceUnderstanding.test2();
		
		InterfaceChild interfaceChild = new InterfaceUnderstanding();
		
		InterfaceTest interfaceTest = new InterfaceUnderstanding();
		interfaceTest.test4();
		interfaceTest.test5();
		
		interfaceChild.test1();
	}
}
