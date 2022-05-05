package com.day5.session3.ex2;

import java.util.function.Consumer;

import com.common.Employee;

public class Java8Consumer {

	public static void main(String[] args) {
		//it take something and print it 
		//w a consumer print ur name
		Consumer<String>consumer= name-> System.out.println(name);
		
		String name="raja";
		consumer.accept(name);
			
		Consumer<Employee>consumer2= emp-> System.out.println(emp);
		
		//or
		
		Consumer<Employee>consumer3=System.out::println;
		
		Employee emp=new Employee(1, "raja", 7800000, "Sales");
		consumer3.accept(emp);
	}
}
