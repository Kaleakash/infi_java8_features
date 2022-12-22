package com;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//class MyFunction implements Function<String, String>{
//	@Override
//	public String apply(String name) {
//		
//		return "Welcome Mr "+name;
//	}
//}
public class PreDefinedFunctionalInterfaces {

	public static void main(String[] args) {
		// without Lambda Expression 
//		MyFunction ff1 = new MyFunction();
//		System.out.println(ff1.apply("Ravi"));
//		
		// with Lambda Expression 
		
		Function<String, String> ff2 = (name)->"Welcome Miss "+name;
		
		System.out.println(ff2.apply("Reeta"));
		
		Function<String, String> ff3 = (name)->name.toUpperCase();
		System.out.println(ff3.apply("Mahesh"));
		
		Function<String, String> ff4 = (name)->name.toLowerCase();
		System.out.println(ff4.apply("Mahesh"));
		
		Function<String, Integer> ff5 = (name)->name.length();
		
		System.out.println(ff5.apply("Welcome to Java Training"));
		
		
		Supplier<String> ss1 = ()->"Welcome to My function interface with lamda";
		System.out.println(ss1.get());
		
		Supplier<Integer> ss2 = ()->{
			Random rr = new Random();
			return rr.nextInt();
		};
		
		System.out.println(ss2.get());
		
		
		Supplier<Integer> ss3 = ()->new Random().nextInt();
		
		System.out.println(ss3.get());
		
		Consumer<Integer> cc1 = (n)->System.out.println("Value is "+n);
		Consumer<String> cc2 = (name)->System.out.println("Name is "+name);
		
		cc1.accept(10);
		cc2.accept("Ramesh");
		
		Predicate<Integer> p1 = (n)->n>21;		// return boolean value 
		System.out.println(p1.test(10));
		System.out.println(p1.test(30));	
	}

}
