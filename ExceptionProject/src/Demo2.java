
public class Demo2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c = 0;
		
		System.out.println("Going to divide...");
		try {
			c = a / b; // 1. JVM identifies the type of exception
						// 2. JVM creates an object of the exception type ArithmeticException
						// 3. JVM with throw the object
						// 4. Since we have a handler, control goes to the catch block
						// 5. after catch block is executed, program continues till the end

		}catch (ArithmeticException ae) {
			System.out.println("Exception has occured...");
			b = 1;
			c = a / b;
		}catch (IndexOutOfBoundsException ie) {
			System.out.println(ie.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			// finally block is meant for closing of resources that were opened in the try block
			// we have a newer syntax of try/catch called try with resources, here we dont need a finally block
			System.out.println("finally block called...");
		}
		
		System.out.println("Answer is : " + c);
		System.out.println("Division over...");
	}

}
