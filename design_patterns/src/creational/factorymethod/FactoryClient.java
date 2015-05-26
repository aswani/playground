package creational.factorymethod;

public class FactoryClient{
	public static void main(String[] args) {
		AbstarctLoggerCreator loggerCreator=new XMLLoggerCreator();
		Logger logger = loggerCreator.createLogger();
		new LoggerClient().performLogging(logger);
	}
	
}

class LoggerClient{
	public void performLogging(Logger logger) {
		logger.log("message");
	}
}