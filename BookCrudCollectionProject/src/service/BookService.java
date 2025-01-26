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
	
	public List<BookPojo> getAllBooks(){
		return bookDao.getAllBooks();
	}
	
	public BookPojo getABook(int bookId) {
		return bookDao.getABook(bookId);
	}
	
	public BookPojo addBook(BookPojo newBook) {
		return bookDao.addBook(newBook);
	}
	
	public BookPojo updateBook(BookPojo editBook) {
		return bookDao.updateBook(editBook);
	}
	
	public void deleteBook(int bookId) {
		bookDao.deleteBook(bookId);
	}
}
