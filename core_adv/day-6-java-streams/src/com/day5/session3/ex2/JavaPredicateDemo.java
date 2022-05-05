package com.day5.session3.ex2;

import java.util.function.Predicate;

import com.common.Employee;

public class JavaPredicateDemo {
	
	public static void main(String[] args) {
		/*
		 * Predicate
		 * Funcation
		 * Consumer
		 * Supplier
		 * 
		 */
		//Predicate : T--> boolean 	: test
		//your name contain ra or not
//		Predicate<String> nameContainRa= name-> name.toLowerCase().contains("ra");
//		System.out.println(nameContainRa.test("RAjiv"));
		
		Predicate<Integer> predicateForEven=number-> number%2==0;
		
		//lambda vs method ref=> internally both are same method ref is even more elegent way!
											//T---> boolean
		Predicate<Employee> richEmpPredicate= e->e.getSalary()>=3000000;
		
		Predicate<Employee> richEmpPredicateV2= Employee::isRich;
		
		
		
		Predicate<Employee> itDeptPredicate= e-> e.getDept().equals("IT");
		
		Predicate<Employee> itDeptPredicateV2= Employee::isWorkingInIt;
		
		
		//hey i want to get predicate  for emp who is rich as well as working in it dept
		
		Predicate<Employee> richAndItDeptPredicate=richEmpPredicateV2.and(itDeptPredicateV2);
		
		Employee employee=new Employee(1111, "amit", 7000000, "IT");
		
		boolean result =richAndItDeptPredicate.test(employee);
		System.out.println(result);

	}

}
