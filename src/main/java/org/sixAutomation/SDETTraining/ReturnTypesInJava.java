package org.sixAutomation.SDETTraining;

public class ReturnTypesInJava {
	
	public static void main(String args[]) {
		ReturnTypesInJava returnTypesInJava = new ReturnTypesInJava();
		returnTypesInJava.addTwoNumbers();
		returnTypesInJava.getValue("Hello Java");
		returnTypesInJava.getBoolValue();
	}
	
	public int addTwoNumbers() {
		int a = 10;
		int b =20;
		System.out.println("a+b ==== " + (a+b));
		return a+b;
	}
	
	public String getValue(String message) {
		System.out.println("getValue === " + message);
		return message;
	}
	
	public boolean getBoolValue() {
		return false;
	}

	
}
