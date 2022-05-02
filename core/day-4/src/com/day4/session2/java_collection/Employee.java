package com.day4.session2.java_collection;

import java.util.Comparator;
import java.util.Objects;
//i want to sort as per name: extra sort seq: Comparator
//N
class NameSorter implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

//	1					Natual sort: default sort: Comparable
class Employee implements Comparable<Employee> {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	// dry run this code at ur end
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

	//how it is working: e1.compareTo(e2)
	@Override
	public int compareTo(Employee emp) {
		return Integer.compare(this.getId(), emp.getId());
	}

}