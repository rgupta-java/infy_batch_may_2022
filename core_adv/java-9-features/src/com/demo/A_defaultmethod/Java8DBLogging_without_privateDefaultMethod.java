package com.demo.A_defaultmethod;

public interface Java8DBLogging_without_privateDefaultMethod {

	default void logInfo(String message) {
		//	Step1: Connect to DataBase
		//	Setp2: Log Info Message
		//	Setp3: Close the DataBase connection
	}

	default void logWarn(String message) {
		//Step1: Connect to DataBase
		//Setp2: Log Warn Message
		//Setp3: Close the DataBase connection
	}

	default void logError(String message) {
		//Step1: Connect to DataBase
		//Setp2: Log Error Message
		//Setp3: Close the DataBase connection
	}

	default void logFatal(String message) {
		//Step1: Connect to DataBase
		//Setp2: Log Fatal Message
		//Setp3: Close the DataBase connection
	}
}