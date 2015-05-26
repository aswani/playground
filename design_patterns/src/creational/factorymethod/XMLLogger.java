package creational.factorymethod;

interface Logger{
	public void log(String message);
}

public class XMLLogger implements Logger {

	@Override
	public void log(String message) {
		System.err.println("XML message:"+message);
		
	}

}
