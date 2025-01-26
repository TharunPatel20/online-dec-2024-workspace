import java.util.Scanner;

public class BookPresentationMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char answer = 'y';
		while(answer == 'y') {
			System.out.println("**************************");
			System.out.println("Book Management System");
			System.out.println("**************************");
			System.out.println("1. Fetch All Books");
			System.out.println("2. Fetch a Book by ID");
			System.out.println("3. Add a new Book");
			System.out.println("4. Update Book");
			System.out.println("5. Remove a Book by ID");
			System.out.println("6. Exit");
			System.out.println("**************************");
			System.out.println("Enter your option:");
			int option = scan.nextInt();
			System.out.println("**************************");
			switch(option) {
			case 1:
				System.out.println("fetch all books");
				break;
			case 2:
				System.out.println("fetch a book");
				break;
			case 3:
				System.out.println("add book");
				break;
			case 4:
				System.out.println("update book");
				break;
			case 5:
				System.out.println("delete book");
				break;
			case 6:
				System.out.println("***********************************************");
				System.out.println("Thankyou for using Book Management System!");
				System.out.println("***********************************************");
				System.exit(0);
			}
			System.out.println("Do you want to continue? (y/n) :");
			answer = scan.next().charAt(0);
		}
		
		
		
	}

}
