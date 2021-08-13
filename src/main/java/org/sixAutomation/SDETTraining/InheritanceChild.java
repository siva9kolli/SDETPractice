package org.sixAutomation.SDETTraining;

public class InheritanceChild extends InheritanceParent{
	
	public static void main(String args[]) {
		InheritanceChild inheritanceChild = new InheritanceChild();
		InheritanceParent inheritanceParent = new InheritanceChild();
		// parent parentref. = new child 
		//inheritanceChild.mul(inheritanceChild.l, 20);
		inheritanceChild.mul(1, 2);
		inheritanceParent.mul(1, 2);
		
		
	}
	
	public void mul(int a, int b) {
		System.out.println("a * b ===" + (a*b) + (a + b));
	}
}
