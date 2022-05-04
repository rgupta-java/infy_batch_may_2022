package com.day5.session1.trainerapp;

import java.time.LocalDate;

public class Trainer {
	private String id;	//alpha number min 5 char
	private String name;// name validateion 
	private LocalDate date;//it should not pass date and trainer age > 21
	private String dept;//CS/ IT/EEE/ ECE
	private Character gender;//M/ F
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		this.gender = gender;
	}
	public Trainer(String id, String name, LocalDate date, String dept, Character gender) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.dept = dept;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", date=" + date + ", dept=" + dept + ", gender=" + gender
				+ "]";
	}
	
	
	
}
