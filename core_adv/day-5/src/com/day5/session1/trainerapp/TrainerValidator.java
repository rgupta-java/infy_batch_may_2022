package com.day5.session1.trainerapp;

import java.time.LocalDate;
import java.time.Period;

public class TrainerValidator {
	public static boolean isIdValid(String id) {
		return id.length()==5;
	}
	
	public static boolean isDeptValid(String deptName) {
		//CS/ IT/EEE/ ECE
		return deptName.matches("CS | IT | EEE | ECE");
	}
	
	public static boolean isGenderValid(Character gender) {
		//M/F
		return gender.toString().matches("M|F");
	}
	
	
	public static boolean isNameValid(String name) {
		return name.matches("[a-zA-Z]{4,30}([\\s][a-zA-Z]+)*");
	}
	
	public static boolean isAgeValid(LocalDate dob) {
		//it should past date
		boolean notPastDate= dob.isAfter(LocalDate.now());
		
		Period period=Period.between(dob, LocalDate.now());
		//he/she should be more then 21
		int age=period.getYears();
		
		return notPastDate && age>=21;
	}
	
}
