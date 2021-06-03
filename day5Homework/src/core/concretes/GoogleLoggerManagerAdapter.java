package core.concretes;

import core.abstracts.LoggerService;
import google.GoogleLoggerManager;

public class GoogleLoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String message) {
		GoogleLoggerManager manager = new GoogleLoggerManager();
		manager.logWithGoogle(message);
		
	}

}
