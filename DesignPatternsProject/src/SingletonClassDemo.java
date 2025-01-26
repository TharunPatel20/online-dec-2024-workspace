
public class SingletonClassDemo {

	public static void main(String[] args) {
//		SingletonClass sc1 = new SingletonClass();
//		SingletonClass sc2 = new SingletonClass();
//		SingletonClass sc3 = new SingletonClass();
		
		SingletonClass sc4 = SingletonClass.getIntance();
		sc4.msg = "hello";
		SingletonClass sc5 = SingletonClass.getIntance();
		sc5.msg = "welcome";
		SingletonClass sc6 = SingletonClass.getIntance();
		sc6.msg = "java";
		System.out.println(sc4.msg);
		System.out.println(sc5.msg);
		System.out.println(sc6.msg);
		
	}

}
