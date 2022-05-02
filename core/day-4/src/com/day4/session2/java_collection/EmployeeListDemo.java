package com.day4.session2.java_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeListDemo {

	public static void main(String[] args) {
		List<Employee> l = new ArrayList<>();

		l.add(new Employee(14, "raja"));
		l.add(new Employee(11, "amit"));
		l.add(new Employee(13, "ekta"));
		l.add(new Employee(1111, "pooja"));
		l.add(new Employee(71, "ravi"));

		//i want to iterate it
		System.out.println("------all emp list---------");
		printEmployeeList(l);
		
		Collections.sort(l);
		System.out.println("------all emp list as per Id---------");
		printEmployeeList(l);
		
		Collections.sort(l, new NameSorter());
		System.out.println("------all emp list as per name---------");
		printEmployeeList(l);
		
		
	}

	private static void printEmployeeList(List<Employee> l) {
		Iterator<Employee> it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
