package nLayeredDemo.core.concretes;

import nLayeredDemo.JLogger.JLoggerManager;
import nLayeredDemo.core.abstracts.LoggerService;

public class JLoggerManagerAdapter implements LoggerService {

	@Override
	public void log(String message) {
		
		JLoggerManager loggerManager = new JLoggerManager();
		loggerManager.log(message);
	}

}