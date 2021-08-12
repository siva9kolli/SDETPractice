package org.sixAutomation.SDETTraining;

public class Polymorphism {
	
	public void sum(int a, int b) {
		int c;
		c = a+b;
		System.out.println("C value === " + c);
	}
	
	public void sum(int a, int b, int d) {
		int c;
		c = a+b+d;
		System.out.println("C value === " + c);
	}
	
	public void sum(int a, long b) {
		long c;
		c = a+b;
		System.out.println("C value === " + c);
	}
	
	public void rollNumber(int a) {
		System.out.println("a ===="  +a);
	}
	
	public void rollNumber(double b) {
		System.out.println("b ===="  +b);
	}
	
	public static void main(String args[]) {
		Polymorphism polymorphism = new Polymorphism();
		polymorphism.sum(10, 10);
		polymorphism.sum(1, 2, 3);
		polymorphism.sum(1, 10000);
		polymorphism.rollNumber(1);
		polymorphism.rollNumber(1.6);
		polymorphism.add(30, 30);
		polymorphism.add(30, 3000);
	}
	
	
	public int add(int a, int b) {
		int c;
		c = a+b;
		System.out.println("c value ==== " + c);
		return c;
	}
	
	public long add(int a, long b) {
		long c;
		c = a+b;
		System.out.println("c value ==== " + c);
		return c;
	}
	

}
