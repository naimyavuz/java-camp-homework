package core.concretes;

import core.abstracts.LoggerService;

public class LoggerManager implements LoggerService {

	@Override
	public void logToSystem(String message) {
		System.out.println("Logged with default service.");
		
	}

}
