package com.day4.session3.set_ex;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class NameRevSorter implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
}
public class HelloSet {

	public static void main(String[] args) {
		
		Set<String> set= new TreeSet<>(new NameRevSorter());

		boolean status=set.add("foo");//true ie data is added or if return false data is not added
		boolean status1=set.add("foo");
		set.add("raja");
		set.add("amit");
		set.add("pooja");
		
		System.out.println(set);
		
		
//		Set<String> set= new LinkedHashSet<>();
//
//		boolean status=set.add("foo");//true ie data is added or if return false data is not added
//		boolean status1=set.add("foo");
//		set.add("raja");
//		set.add("amit");
//		set.add("pooja");
//		
//		System.out.println(set);
		
		
		
//		Set<String> set= new HashSet<>();
//
//		boolean status=set.add("foo");//true ie data is added or if return false data is not added
//		boolean status1=set.add("foo");
//		set.add("raja");
//		set.add("amit");
//		set.add("pooja");
//		
//		System.out.println(status);
//		System.out.println(status1);
//		System.out.println(set);

	}
}
