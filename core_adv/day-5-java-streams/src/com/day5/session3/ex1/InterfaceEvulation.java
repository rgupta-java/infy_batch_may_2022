package com.day5.session3.ex1;
//What is the need of default method and static method inside funcational interface?
import java.util.*;
//how to avoid diamond problem of the interface

interface MyInterface{
	void foo();
	default void foof2() {
		System.out.println("it is a defualt method of myInterface and now other parities are force to override :)");
	}
	public static void fooStatic() {
		System.out.println("i am stataic method ...");
	}
}
//ibm
class IbmImp implements MyInterface{

	@Override
	public void foo() {
		System.out.println("foo imp by IBM");
	}
	
}

class InfyImp implements MyInterface{

	@Override
	public void foo() {
		System.out.println("foo imp by infy");
	}
	
}

public class InterfaceEvulation {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("foo");
		list.add("bar");
		list.add("jar");
		list.add("kar");
		
		list.sort(( o1,  o2) ->o1.compareTo(o2));
		
		Collections.sort(list,( o1,  o2) ->o1.compareTo(o2) );
	}
}
