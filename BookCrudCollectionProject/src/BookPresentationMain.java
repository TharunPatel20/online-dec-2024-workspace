import java.util.List;
import java.util.Scanner;

import pojo.BookPojo;
import service.BookService;

public class BookPresentationMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BookService bookService = new BookService();
		
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
				System.out.println("***********************************************");
				System.out.println("LIST OF ALL BOOKS:");
				System.out.println("***********************************************");
				List<BookPojo> allBooks = bookService.getAllBooks();
				allBooks.stream().forEach((eachBook)->System.out.println(eachBook));
				System.out.println("***********************************************");
				break;
			case 2:
				System.out.println("***********************************************");
				System.out.println("Enter the Book ID : ");
				int bid = scan.nextInt();
				BookPojo fetchedBook = bookService.getABook(bid);
				System.out.println("***********************************************");
				if(fetchedBook == null) {
					System.out.println("Sorry, Book with ID: " + bid + " does not exist!");
				}else {
					System.out.println(fetchedBook);
				}
				System.out.println("***********************************************");
				break;
			case 3:
				System.out.println("add book");
				break;
			case 4:
				System.out.println("update book");
				break;
			case 5:
				System.out.println("***********************************************");
				System.out.println("Enter the Book ID : ");
				int bookId = scan.nextInt();
				BookPojo fBook = bookService.getABook(bookId);
				System.out.println("***********************************************");
				if(fBook == null) {
					System.out.println("Sorry, Book with ID: " + bookId + " does not exist!");
				}else {
					System.out.println(fBook);
				}
				System.out.println("***********************************************");
				System.out.println("Are you sure to delete this book (y/n) : ");
				char dAnswer = scan.next().charAt(0);
				if(dAnswer == 'y') {
					bookService.deleteBook(bookId);
				}
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
