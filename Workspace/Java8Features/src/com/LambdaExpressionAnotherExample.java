package com;
interface Hello {
	public void info();
}
interface Message{
	public void sayHello(String name);
}
interface Operation {
	public int add(int x, int y);
}
interface FindLargest {
	public int findLargest(int x, int y);
}
public class LambdaExpressionAnotherExample {

	public static void main(String[] args) {
		Hello h1 = ()->System.out.println("This is info interface in lambda style");
		h1.info();
		
		Message m1 = (name)->System.out.println("Say hello method "+name);
		m1.sayHello("Ravi");
		
		Message m2 = (abc)->System.out.println("Say Hello method "+abc);
		m2.sayHello("Ramesh");
		
		Message m3 = (String n)->System.err.println("Say Hello method "+n);
		m3.sayHello("Ajay");
		
		Message m4 = (a)->System.out.println(a);
		m4.sayHello("Dinesh");
		
		Operation op1 =(a,b)->a+b;			// by default return value with return keyword. 
		
		System.out.println(op1.add(10, 20));
		Operation op2= (x,y)->x+y;
		System.out.println(op2.add(1, 2));
		Operation op3 = (int x, int y)->x+y;
		System.out.println(op3.add(100, 200));
		
		FindLargest f1 = (int x, int y)-> {
			if(x>y) {
				return x;
			}else {
				return y;
			}
		};
		System.out.println(f1.findLargest(100, 200));
		
		Operation op4= (a,b)-> {return a+b;};
		System.out.println(op4.add(11,22));
		
	}

}
