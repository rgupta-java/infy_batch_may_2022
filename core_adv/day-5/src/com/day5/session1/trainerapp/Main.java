package com.day5.session1.trainerapp;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		ProcessTrainer processTrainer=new ProcessTrainer();
		//String id, String name, LocalDate date, String dept, Character gender
		Trainer trainer=new Trainer("1233", "r", LocalDate.now(), "IT", 'Z');
		
		processTrainer.processTrainerData(trainer);
	}
}
