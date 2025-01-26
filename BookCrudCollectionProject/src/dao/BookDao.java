package dao;

import java.util.List;

import pojo.BookPojo;

public interface BookDao {
	List<BookPojo> getAllBooks();
	BookPojo getABook(int bookId);
	BookPojo addBook(BookPojo newBook);
	BookPojo updateBook(BookPojo editBook);
	void deleteBook(int bookId);
}
