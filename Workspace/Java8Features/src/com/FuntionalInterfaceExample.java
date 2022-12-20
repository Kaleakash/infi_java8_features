package com;
@FunctionalInterface
interface Info {
	void dis1();
	//void dis2();
	default void dis2() {
		System.out.println("This is default method");
	}
	default void dis3() {
		System.out.println("This is default method");
	}
	static void dis4() {
		System.out.println("This is static method");
	}
}
public class FuntionalInterfaceExample {

	public static void main(String[] args) {
		

	}

}
