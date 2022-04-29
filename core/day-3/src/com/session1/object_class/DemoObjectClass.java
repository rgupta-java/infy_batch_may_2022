package com.session1.object_class;

import java.util.Objects;

//lord shiva
class Employee {

	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	//dry run this code at ur end
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	

}

public class DemoObjectClass {

	public static void main(String[] args) {
		Employee employee1 = new Employee(11, "Raja");

		Employee employee2 = new Employee(11, "Raja");

		if (employee1.equals(employee2)) {
			System.out.println("eq");
		} else
			System.out.println("not eq");

		// System.out.println(employee);//best thing about toString() u dont have to
		// call it ... java will call it

	}

}
