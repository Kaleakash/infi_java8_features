package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIExample {

	public static void main(String[] args) {
	List<String> ll = new ArrayList<String>();
	ll.add("Ravi");ll.add("Ajay");ll.add("Vijay");ll.add("Reeta");ll.add("Mahesh");
	ll.add("Ramesh");ll.add("Raju");ll.add("Lokesh");ll.add("Ram");ll.add("Rai");
	System.out.println("retrieve each name one by one using iterator");
	Iterator<String> ii = ll.iterator();
	while(ii.hasNext()) {
		String name = ii.next();
		System.out.print(name+" ");
	}
	System.out.println();
	System.out.println("retrieve each name using stream api");
	
	Stream<String> ss = ll.stream();	// converting list to stream 
	ss.forEach((n)->System.out.print(n+" "));
	
	//ss.forEach((n)->System.out.print(n+" "));
	//System.out.println(ii);
	ll.stream().forEach(v->System.out.print(v+""));
	
	}

}
