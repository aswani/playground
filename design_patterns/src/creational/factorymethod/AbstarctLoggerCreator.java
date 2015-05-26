package creational.factorymethod;



abstract class AbstarctLoggerCreator {
	abstract Logger createLogger();

	public Logger getLogger() {
		// depending on the subclass, we'll get a particular logger.
		Logger logger = createLogger();

		// could do other operations on the logger here

		return logger;
	}
}

class XMLLoggerCreator extends AbstarctLoggerCreator {

	@Override
	Logger createLogger() {
		// TODO Auto-generated method stub
		XMLLogger logger=new XMLLogger();
		return logger;
	}
}

