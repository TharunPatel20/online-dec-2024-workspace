public class SingletonClass {
	
	private static SingletonClass sc;
	String msg;
	
	private SingletonClass() {}
	
	public static SingletonClass getIntance() {
		if(sc == null) {
			sc = new SingletonClass();
		}
		return sc;
	}
}
