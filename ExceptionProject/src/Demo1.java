public class Demo1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c = 0;
		
		System.out.println("Going to divide...");
		c = a / b; // 1. JVM identifies the type of exception
					// 2. JVM creates an object of the exception type ArithmeticException
					// 3. JVM with throw the object
					// 4. since we have not handled the exception, the default handler will handle it
					// 5. if control goes to default handler it will never come back to the program
		
		System.out.println("Answer is : " + c);
		System.out.println("Division over...");
	}
}
