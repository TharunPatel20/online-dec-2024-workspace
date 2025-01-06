import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingDemo {

	public static void main(String[] args) {
		// read the line from the file sample.txt
		byte[] data = null;
		try {
			FileInputStream fis = new FileInputStream("sample.txt");
			int size = fis.available();
			data = new byte[size];
			fis.read(data);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// write the line to the console
		String str = new String(data);
		System.out.println("From file : " + str);
	}

}
