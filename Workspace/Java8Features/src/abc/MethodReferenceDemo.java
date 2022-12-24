package abc;

import java.util.function.Function;
import java.util.stream.Stream;

interface Info {
	public String sayHello(String name);
}
class InfoRef1 {			// static method reference 
	public static String sayHello(String name) {
		return "Welcome user wth static method reference "+name;
	}
}
class InfoRef2 {			// non static method reference 
	public String sayHello(String name) {
		return "Welcome user wth non static method reference "+name;
	}
}
public class MethodReferenceDemo {

	public static void main(String[] args) {
		// using lambda expression 
//		Info obj1 = (name)->"Welcome user "+name;
//		System.out.println(obj1.sayHello("Ravi"));
//
//		Info obj2 = (name)->"Hi "+name;
//		System.out.println(obj2.sayHello("Ravi"));
//		
//		Info obj3 = (name)->"Hello "+name;
//		System.out.println(obj3.sayHello("Ravi"));
//		
//		Info obj4 = InfoRef::sayHello;	// providing logic for sayHello from InfoRef
//		System.out.println(obj4.sayHello("Ajay"));
		
		//of method method which help to create steram for primitive value.
		
//		Stream<Integer> ss1 = Stream.of(2,5,6,8,1,3,8,9);
//		Integer num[]= {10,45,32,67,89,30};
//		Stream<Integer> ss2 = Stream.of(num);
		
		//ss1.forEach(v->System.out.print(v+" "));	// using labda experssion display the value 
		//ss1.map(v->v).forEach(v->System::out.print);
		
//		Function<String, Integer> ff1 = (name)->Integer.parseInt(name);
//		System.out.println(ff1.apply("10"));
//		
//		Function<String, Integer> ff2 = Integer::parseInt;
//		System.out.println(ff2.apply("20"));
		
//		Stream<Integer> ss1 = Stream.of(2,5,6,8,1,3,8,9);
//		//ss1.forEach(v->System.out.print(v+" "));
//		ss1.forEach(System.out::println);
		
//		Info obj3 = (name)->"Welcome "+name;
//		System.out.println(obj3.sayHello("Reeta"));
//		
//		Info obj4 = InfoRef1::sayHello;	// providing logic for sayHello from InfoRef
//		System.out.println(obj4.sayHello("Ajay"));
//		
//		InfoRef2 ref = new InfoRef2();
//		Info obj5 = ref::sayHello;
//		System.out.println(obj5.sayHello("Ramesh"));
//		
//		Stream<Integer> ss1 = Stream.of(2,5,6,8,1,3,8,9);
//		//ss1.forEach(v->System.out.print(v+" "));
//		ss1.forEach(System.out::print);
//		
//		Function<String, Integer> ff1 = (name)->Integer.parseInt(name);
//		System.out.println(ff1.apply("10"));
//		
//		Function<String, Integer> ff2 = Integer::parseInt;
//		System.out.println(ff2.apply("20"));
	}

}
