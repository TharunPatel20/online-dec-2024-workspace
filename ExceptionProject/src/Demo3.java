
public class Demo3 {
	public static void main(String[] args) {
//		ArithmeticException ae = new ArithmeticException();
//		throw ae; // used to throw an exception object explicitly
					// doesnt make much sense to throw in0built exception like this
		
		int option = 3;
		try {
			if(option < 1 || option >5) {
				InvalidOptionException ioe = new InvalidOptionException(option);
				throw ioe;
			}
		}catch(InvalidOptionException ie) {
			System.out.println(ie.getMessage());
		}
		
		System.out.println("Over...");
		
	}
}
