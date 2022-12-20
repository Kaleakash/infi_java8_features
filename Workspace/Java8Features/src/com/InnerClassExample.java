package com;

class Outer {
	int a;
	void dis1() {
		System.out.println("This is outer class non static method");
	}
	
	class Inner {
		void dis2() {
			System.out.println("This is inner class method");
		}
	}
	
	static int b;
	
	static void dis3() {
		System.out.println("This is outer class static method");
	}
	
	static class InnerStatic {
		void dis4() {
			System.out.println("This is static inner class method");
		}
	}
}

public class InnerClassExample {

	public static void main(String[] args) {
	Outer out = new Outer();
	out.dis1();					// outer class non stati method through object. 
	out.dis3();					// outer class static method through object 
	Outer.dis3();					// as well as through class name. 
	
	Outer.Inner in1 = new Outer().new Inner();	// syntax to create non static inner class object 
	in1.dis2();
	
	Outer.InnerStatic in2  = new Outer.InnerStatic();		// syntax to create static inner class object.
	in2.dis4();
	}

}
