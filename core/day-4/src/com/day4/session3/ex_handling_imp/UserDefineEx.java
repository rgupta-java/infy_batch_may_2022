package com.day4.session3.ex_handling_imp;

class InvalidData extends Exception{
	public InvalidData(String message) {
		super(message);
	}
}

class NotSufficientFUnd extends Exception{
	public NotSufficientFUnd(String message) {
		super(message);
	}
}
class Account{
	private int id;
	private String name;
	private double balance;
	
	public Account(int id, String name, double balance) throws 
	InvalidData, NotSufficientFUnd {
		this.id = id;
		this.name = name;
		this.balance = balance;
		if(id<=0 || name.length()<4 || balance<=0)
			throw new InvalidData("invalid data");
		
		if(balance<=10000)
			throw new NotSufficientFUnd("not sufficient fund");
	}
	
	public void withdraw(double amount) {
		
	}
	public void deposit(double amount) {
		
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}
public class UserDefineEx {

	public static void main(String[] args) {
		try {
			Account account=new Account(0, null, 120);
		} catch (InvalidData | NotSufficientFUnd e) {
			System.out.println(e.getMessage());
		}
	}
}
