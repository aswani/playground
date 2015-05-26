package creational.singlton;

public class SingltonPattern {
	private SingltonPattern() {

	}

	private static class SingltonHolder {
		private static final SingltonPattern INSTANCE = new SingltonPattern();
	}

	// this Is THREAD SAFE
	public static SingltonPattern getSinglton() {
		System.err.println(SingltonHolder.INSTANCE);
		return SingltonHolder.INSTANCE;
	}

}
