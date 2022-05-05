package com.day5.session3.ex_streams;
import java.util.*;
//what is funcational interface? sinle abstract method
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.common.Employee;


public class G_JavaDefinedLambda {
	
	public static void main(String[] args) {
		//Collection vs Stream processing
		List<Employee> employees=Arrays.asList(
				new Employee(121, "rajat", 670000, "Sales"),
				new Employee(127, "rajiv", 990000, "Trainer"),
				new Employee(1, "ekta", 80000, "Engg"),
				new Employee(199, "tarun", 900000, "Sales")
			);
		
		//stream processing
		
		//java 1.7			:(
		//i want name of emp those are working in Sales department and sorted by there salary desc
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return Double.compare(o2.getSalary(), o1.getSalary());
			}
		});
		
		List<Employee> empSales=new ArrayList<Employee>();
		for(Employee emp: employees) {
			if(emp.getDept().equals("Sales")) {
				empSales.add(emp);
			}
		}
		
		List<String> nameOfEmpSalesDept=new ArrayList<String>();
		for(Employee emp: empSales) {
			nameOfEmpSalesDept.add(emp.getName());
		}
		//finally i have to print it
		for(String name:nameOfEmpSalesDept) {
			System.out.println(name);
		}
		//java 1.8		:)
		
		System.out.println("---------declative data processing--------------");
		
		//i want name of emp those are working in Sales department 
		
		List<String> names=employees
				.stream()
				.filter(emp->emp.getDept().equals("Sales"))
				.map(emp-> emp.getName())//we have the steam of name--> List of name
			     .collect(Collectors.toList());
		
		
		
//		List<String> names=employees.stream()
//				.filter(e-> e.getDept().equals("Sales"))
//				.sorted(Comparator.comparing(Employee::getSalary).reversed())
//				.map(emp-> emp.getName())
//				.collect(Collectors.toList());
//			
//		names.forEach(name-> System.out.println(name));
				
	}

}



