package demo;
public class DebuggingDemo {
	public static void main(String[] args) {
		String[] allCities = {"Chennai", "Pune", "Mumbai"};
		int len = allCities.length;
		for(int i=0;i<len;i++) {
			System.out.println(allCities[i]);
		}
		System.out.println("All cities printed...");
		method1(40);
		System.out.println("method 1 called...");
		System.out.println("testing");
	}
	
	public static void method1(int number) {
		int num = number * number;
		System.out.println(num);
	}
}
