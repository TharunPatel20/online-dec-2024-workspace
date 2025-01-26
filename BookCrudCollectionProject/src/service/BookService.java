package service;

import java.util.List;

import dao.BookDao;
import dao.BookDaoCollectionImpl;
import pojo.BookPojo;

public class BookService {
	BookDao bookDao;
	
	public BookService() {
		bookDao = new BookDaoCollectionImpl();
	}
	
	List<BookPojo> getAllBooks(){
		return bookDao.getAllBooks();
	}
	
	BookPojo getABook(int bookId) {
		return bookDao.getABook(bookId);
	}
	
	BookPojo addBook(BookPojo newBook) {
		return bookDao.addBook(newBook);
	}
	
	BookPojo updateBook(BookPojo editBook) {
		return bookDao.updateBook(editBook);
	}
	
	void deleteBook(int bookId) {
		bookDao.deleteBook(bookId);
	}
}
