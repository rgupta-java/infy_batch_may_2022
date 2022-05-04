package com.day5.session1.trainerapp;

public class ProcessTrainer {

	//check the validatity of given data if data is invalid print the error message
	//if value put that data into a database (file)
	
	public static boolean processTrainerData(Trainer trainer) {
//		boolean isValidId=TrainerValidator.isIdValid(trainer.getId());
//		if(isValidId)
//			System.out.println("id is valide");
//		else 
//			System.out.println("id is not valid");
		
		boolean isValidName=TrainerValidator.isNameValid(trainer.getName());
		if(isValidName)
			System.out.println("name is valide");
		else 
			System.out.println("name is not valid");
		
		return true;
	}
}
