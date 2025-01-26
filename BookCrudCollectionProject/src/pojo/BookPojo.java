package pojo;

public class BookPojo {
	private int bookId;
	private String bookTitle;
	private int bookPrice;
	
	public BookPojo() {}

	public BookPojo(int bookId, String bookTitle, int bookPrice) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "BookPojo [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookPrice=" + bookPrice + "]";
	}
}
