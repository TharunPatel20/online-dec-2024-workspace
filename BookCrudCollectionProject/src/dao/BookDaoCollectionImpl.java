package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import pojo.BookPojo;

public class BookDaoCollectionImpl implements BookDao {

	List<BookPojo> dataStore;
	
	public BookDaoCollectionImpl() {
		dataStore = new ArrayList<>();
		dataStore.add(new BookPojo(101, "Harry Potter and the Prisoner of Azkaban", 500));
		dataStore.add(new BookPojo(102, "Harry Potter and the Order of Phoenix", 550));
		dataStore.add(new BookPojo(103, "Harry Potter and the Half Blood Prince", 600));
	}
	
	@Override
	public List<BookPojo> getAllBooks() {
		return dataStore;
	}

	@Override
	public BookPojo getABook(int bookId) {
		BookPojo fetchedBook = null;
		Optional<BookPojo> fetchedOptionalBook = dataStore
													.stream()
													.filter((eachBook)->eachBook.getBookId()== bookId).findFirst();
		if(fetchedOptionalBook.isPresent()) {
			fetchedBook = fetchedOptionalBook.get();
		}
		return fetchedBook;
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		int newBookId = dataStore.get(dataStore.size() - 1).getBookId() + 1;
		newBook.setBookId(newBookId);
		dataStore.add(newBook);
		return newBook;
	}

	@Override
	public BookPojo updateBook(BookPojo editBook) {
		return null;
	}

	@Override
	public void deleteBook(int bookId) {
		dataStore = dataStore.stream().filter((eachBook)->eachBook.getBookId()!=bookId).toList();
	}

}
