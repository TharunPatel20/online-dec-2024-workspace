import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (ArithmeticException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void method1() throws IOException {
		//try {
			method2();
		//} catch (ArithmeticException | IOException e) {
		//	e.printStackTrace();
		//}
	}
	
	public static void method2() throws ArithmeticException, IOException {
		//try {
			method3();
		//} catch (ArithmeticException | IOException e) {
		//	e.printStackTrace();
		//}
	}
	
	public static void method3() throws IOException, ArithmeticException {
		
//		try {
//			FileWriter f = new FileWriter("sample.txt");
//		}catch(ArithmeticException ae) {
//			ae.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		FileWriter f = new FileWriter("sample.txt");
		int c = 5 / 0;
	}
}
