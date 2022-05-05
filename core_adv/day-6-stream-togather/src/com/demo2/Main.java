package com.demo2;
import java.util.*;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		Department account = new Department("Account", 75); 
	      Department hr = new Department("HR", 50);
	      Department ops = new Department("OP", 25);
	      Department tech = new Department("Tech", 150);          
	   
	      List<Employee> employeeList = Arrays.asList(
	    		  				new  Employee("David", 32, "banglore", account), 
	                           new  Employee("Brayan", 25, "chennai", hr),
	                           new  Employee("JoAnne", 45, "noida", ops),
	                           new  Employee("Jake", 65, "noida", hr),
	                           new  Employee("Brent", 55, "banglore", hr),
	                           new  Employee("Allice", 23, "banglore", ops),
	                           new  Employee("Austin", 30, "Negombo", tech),
	                           new  Employee("Gerry", 29, "banglore", tech),
	                           new  Employee("Scote", 20, "chennai", ops),
	                           new  Employee("Branden", 32, "banglore", account),
	                           new  Employee("Iflias", 31, "noida", hr));
	      
	      //Find all employees who lives in ‘banglore’ city,
	      //sort them by their name and print the names of employees.
//	      
//	      employeeList.stream()
//	      .filter(e-> e.getCity().equals("banglore"))
//	      .sorted(Comparator.comparing(Employee::getName))
//	      .map(e->e.getName())
//	      .forEach(e->System.out.println(e));
	      
	      //Find distinct department names that employees work for.
	      List<String> namesOfDepts=employeeList
	    		  .stream()
	    		  .map(e->e.getDepartment().getDepartmentName())
	    		  .distinct()
	    		  .collect(Collectors.toList());
	      
	      //
	}
}




