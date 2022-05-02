package com.day4.session1.ex_handing;
class Emp{
	
	private int id;
	private String name;
	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
	
}
//Unchecked Ex
public class MoreExOfUnchekedEx {
	
	public static void main(String[] args) {
	
		int x[]= {4,5,6};
		System.out.println(x[3]);
		
//		Emp emp=null;
//		System.out.println(emp.toString());
		
//		String name=null;
//		System.out.println(name.toUpperCase());
	}

}
