package com.demo.A_defaultmethod;

public interface Java9DBLogging {
	default void logInfo(String message) {
		log(message, "INFO");
	}

	default void logWarn(String message) {
		log(message, "WARN");
	}

	default void logError(String message) {
		log(message, "ERROR");
	}

	default void logFatal(String message) {
		log(message, "FATAL");
	}

	private void log(String msg, String logLevel) {
		//Step1: Connect to DataBase
		//Step2: Log Message with the Provided logLevel
		//Step3: Close the DataBase Connection
	}
}