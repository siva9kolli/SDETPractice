package org.sixAutomation.SDETTraining;

public class UnderstandingMainMethod {
	
	public static void main(String args[]) {
		UnderstandingMainMethod understandingMainMethod = new UnderstandingMainMethod();
		sum(10, 20);
		understandingMainMethod.sum(20,  30);
		understandingMainMethod.sub(20, 10);
		
		
	}
	
	public static void sum(int a, int b) {
		int c;
		c= a+b;
		System.out.println("c value == "+ c);
	}
	
	public void sub(int a, int b) {
		int c;
		c = a-b;
		System.out.println("C value === " + c);
	}

}
