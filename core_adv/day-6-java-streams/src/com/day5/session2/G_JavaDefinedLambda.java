package com.day5.session2;
import java.util.*;
//what is funcational interface? sinle abstract method

import com.common.Employee;


public class G_JavaDefinedLambda {
	
	public static void main(String[] args) {
		//Collection vs Stream processing
		List<Employee> employees=Arrays.asList(
				new Employee(121, "rajat", 670000, "Sales"),
				new Employee(127, "rajiv", 990000, "Trainer"),
				new Employee(1, "ekta", 80000, "Engg"),
				new Employee(199, "tarun", 90000, "Sales")
			);
		
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return Double.compare(o2.getSalary(), o1.getSalary());
			}
		});
		
		//1-ist attempt
		
		Collections.sort(employees, (Employee o1, Employee o2)-> {
				return Double.compare(o2.getSalary(), o1.getSalary());
			
		});
		
		

		//2-2nd attempt
		
		Collections.sort(employees, (Employee o1, Employee o2)-> 
				 Double.compare(o2.getSalary(), o1.getSalary())
		);
		
	//3-3nd attempt
		
		Collections.sort(employees, ( o1,  o2)-> Double.compare(o2.getSalary(), o1.getSalary()));
		
		for(Employee emp: employees) {
			System.out.println(emp);
		}
		
	}

}
