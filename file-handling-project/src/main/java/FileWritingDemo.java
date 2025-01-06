import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingDemo {

	public static void main(String[] args) {
		// get a sentence as input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in a sentence : ");
		String str = scan.nextLine();
		
		// next we have write str in a file named sample.txt
		try {
			FileWriter fw = new FileWriter("sample.txt");
			fw.write(str);
			fw.flush();
			System.out.println("Sentence writtern to file...");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
