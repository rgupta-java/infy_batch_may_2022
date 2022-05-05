package com.day5.session3.ex2;

import java.util.function.BiFunction;
import java.util.function.Function;

import com.common.Employee;
import com.common.EmployeeDTO;

public class Java8FuncationDemo {

	public static void main(String[] args) {
		//Funcation
		//wap to give lenth of the person name
		
		Function<String, Integer> function= name->  name.length();
		
		System.out.println(function.apply("i am the champion"));
		
		//Function==> BiFucation "rajiv" "gupta"
				// input1  input2   op
		BiFunction<String, String, String> biFunction=(fName, lName)->  fName.concat(lName);
			
		System.out.println(biFunction.apply("infy", "champs"));
		
		//I have a object of Employee and i want to convert it to EmployeeDTO
		
		//?
		Function<Employee, EmployeeDTO> converter1=emp-> empToEmpDTO(emp);

		
	}

	private static EmployeeDTO empToEmpDTO(Employee emp) {
		EmployeeDTO dto=new EmployeeDTO();
		dto.setId(emp.getId());
		dto.setName(emp.getName());
		dto.setSalary(emp.getSalary());
		return dto;
	}
}




