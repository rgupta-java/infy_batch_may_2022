package com.day4.session2.java_collection;

import java.util.*;

public class HelloWorldCollection {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<>();
		
		l.add("foo");
		l.add("foo");
		l.add("raja");
		l.add("amit");
		l.add("pooja");
		
		//hey pls sort them
		
		//algo
		System.out.println(l);
		Collections.sort(l);
		/// -6_1=-5
		System.out.println(l);
		
		//Binary search
		
		int index=Collections.binarySearch(l, "ekta");
		System.out.println(index);
		
		//System.out.println(l);
		
		//enhace for loop
		
//		for(String data: l) {
//			System.out.println(data);
//		}
		
		//Iterator (very very imp)
//		Iterator<String> it=l.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		
//		Iterator<String> it=l.iterator();
//		it.next();
//		it.remove();
//		it.remove();
		
		
		
		//java 8 ways
		
		//so good about arraylist: it allow random search
		
//		String data=l.get(2);
//		System.out.println(data);
		
		
		
		
		//collection only support object...
//		List l = new ArrayList();
//		l.add(3);// how hell this is working?
//		l.add("foo");
//		l.add(66.55);
//		l.add(new Employee(2, "raj"));
//		
//		Employee e=(Employee) l.get(1);
//		
//		System.out.println(e);
		
	}

}
