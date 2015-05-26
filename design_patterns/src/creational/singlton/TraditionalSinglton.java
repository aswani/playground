package creational.singlton;

public class TraditionalSinglton {
	private static TraditionalSinglton singlton;
	private TraditionalSinglton() {
		
	}
	//prior to java 5 this would lead to problems In threaded Application
	public static TraditionalSinglton getSinglton() {
		if (singlton==null) {
			singlton=new TraditionalSinglton();
			System.err.println(singlton);
		}
		return singlton;
	}

}
