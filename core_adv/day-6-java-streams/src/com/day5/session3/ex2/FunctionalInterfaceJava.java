package com.day5.session3.ex2;

import java.io.Console;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.common.EmployeeDTO;
import com.day5.session2.Employee;
class Singer{
	private String singerName;
	private int rank;	//1-5 or else bad singer
	
	public Singer(String singerName, int rank) {
		this.singerName = singerName;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Singer [singerName=" + singerName + ", rank=" + rank + "]";
	}

	public String getSingerName() {
		return singerName;
	}

	public int getRank() {
		return rank;
	}
	
	
	
}
//funcational interface? why there are so imp: "they only support lambda exp"==> stream procesesing
@FunctionalInterface
interface Foo2{
	void foo();
}
public class FunctionalInterfaceJava {

	public static void main(String[] args) {
		
		// Most imp functional interface in java 8
		
		// Predicate :actually taking something and give me true or false
		// i want to have a predicate is no is even or odd
		
		Predicate<Integer> p1= no-> no%2==0;
		System.out.println(p1.test(21));
		
		// i want to have a predicate is name contain raj
		Predicate<String> p2=name-> name.contains("raj");
		System.out.println(p2.test("rajiv"));
		
		Singer singerObj=new Singer("abc", 10);
		
		Predicate<Singer> p3= singer->  singer.getRank()<=5;
		
		System.out.println(p3.test(singerObj));
		
		//if a emp is rich or not emp >=30L rich
		
		Predicate<Employee> predicateEmp=emp-> emp.getSalary()>=3000000;
		
		Employee employee=new Employee(121, "ravi", 5000000, "Sales");
		
		System.out.println(predicateEmp.test(employee));
		
		//can be combine 2 or more predicate Yes
		
		//emp is rich "and" his  dept is IT
		
		Predicate<Employee> predicateEmpDept=emp-> emp.getDept().equals("IT");
		
		Predicate<Employee>richAndItPredicate= predicateEmp.or(predicateEmpDept).negate();
		
		System.out.println(richAndItPredicate.test(employee));
		
		
		
		// Function is going to convert something into something else
		
		//i want to convert name(String) of a person in upper case( String)
		
		Function<String,String >function2=new Function<String, String>() {

			@Override
			public String apply(String t) {
				return null;
			}
		};
		
		Function<String,String >function= name -> name.toUpperCase();
			
		String upperName=function.apply("champs");
		
		System.out.println(upperName);
		
		
		//We need to convert a object of Employee to EmployeeDTO
		
		Function<Employee, EmployeeDTO> converterEmpToEmpDTO
		
		= e->  new EmployeeDTO(e.getId(), e.getName(), e.getSalary());
			
		
		
		// Consumer :eat something dont return anything. is used to print some data on console
		
		Consumer<String> consumer=
				 name-> System.out.println(name);
				 
		consumer.accept("you all are capable of being master in java");

		// biConsumer
		BiConsumer<String, String> biConsumer=( name,  dept)-> System.out.println(name+":"+dept);
			
		biConsumer.accept("Raj", "trainer");

		
		//Map<String, Integer> map = null;

		// Supplier

		// BiFunction

	}
}








