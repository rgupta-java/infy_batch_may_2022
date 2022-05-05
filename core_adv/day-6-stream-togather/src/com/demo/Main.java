package com.demo;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees=Arrays.asList(
				new Employee(121, "rajat", 2600000, "Sales"),
				new Employee(127, "rajiv", 3100000, "Trainer"),
				new Employee(1, "ekta", 4500000, "Engg"),
				new Employee(199, "tarun", 9900000, "Sales")
			);
		
//		for(Employee e: employees) {
//			System.out.println(e);
//		}
		//i want to print all emp records
		//ehance for loop or iterator
		//java 8 : stream way to the same thing
		
		//employees.stream().forEach(emp-> System.out.println(emp));
		
//		employees.forEach(emp-> System.out.println(emp));
		
		//employees.forEach(System.out::println);
		
		//we want to print only names emp-> name(only) Map
//		employees
//		.stream()
//		.map(emp-> emp.getName())
//		.forEach(name-> System.out.println(name));
		
		//we want to print only names emp-> name(only) Map but in sorted order
//		employees
//		.stream()
//		.map(emp-> emp.getName())
//		.sorted(( o1,  o2) ->o2.compareTo(o1))
//		.forEach(name-> System.out.println(name));
		
		//We have collection of emp i want to print subset of data: name, salary
		//1. IMP: u need to write a extra class 
		//2. THEN u have to use mapper emp-> employeeData
		
//		employees
//				.stream()
//				.map(e-> convertToEmpData(e))	//emp->empData
//				.forEach(ed-> System.out.println(ed));// it will print empData's
		
//		employees
//		.stream()
//		.map(Main::convertToEmpData)	//emp->empData
//		.forEach(ed-> System.out.println(ed));// it will print empData's

		
		//employees.forEach(e->System.out.println(e));
		
		//i want total no of all unique dept in which my emp are working
		
//		long count=employees.stream()
//				.map(e-> e.getDept())
//				.distinct()
//				.count();
//		
//		System.out.println(count);
		
		//i want get emp who are earning bw 25L to 30L
		System.out.println("-----------");
		employees.stream()
				.filter(e-> e.getSalary()>=2500000 && e.getSalary()<=3000000)
				.forEach(e-> System.out.println(e));
		
		//list of all rich emp name 3000000
		List<String> richEmps=employees.stream()
				.filter(Employee::isRich)
				.map(e-> e.getName())
				.collect(Collectors.toList());
		
		richEmps.forEach(name-> System.out.println(name));	
	}
	
	
	
	public static EmployeeData convertToEmpData(Employee employee) {
		return new EmployeeData(employee.getName(), employee.getSalary());
	}
}







