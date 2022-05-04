package com.day5.session2.data_time;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//java 6 date and time
public class DateTime {

	public static void main(String[] args) {
		//date and time api befre java 8 is badly design 
		
//		Date date=new Date(13,12,20);
//		System.out.println(date);
		
//		LocalDate date=LocalDate.now();
//		System.out.println(date);
		
//		LocalDate date=LocalDate.of(2011, Month.JANUARY	, 11);
//		System.out.println(date);
//		System.out.println(date.getYear());
//		System.out.println(date.getMonth());
//		System.out.println(date.getDayOfYear());
		
		
		//parse method : it used to parese the date string
		//string ---> date
//		String dateString="2011-06-01";
//		LocalDate date=LocalDate.parse(dateString);
//		System.out.println(date);
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dateString="01/06/2011";
//		LocalDate date=LocalDate.parse(dateString);
		LocalDate dob=LocalDate.parse(dateString, formatter);
		System.out.println(dob);
		
		//age of this person
		LocalDate dodayDate=LocalDate.now();
		
		Period period=Period.between(dob, dodayDate);
		
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		
		
		
		
	}
}
