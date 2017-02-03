package team4.library.project.book;

import java.util.Date;

public class Book {
	private int bookCode;
	private String libraryId;
	private int stateNo;
	private int genreNo;
	private String bookName;
	private String bookAuthor;
	private String bookPublisher;
	private Date bookFirstday;
	private int bookTotalday;
	private int bookTotalCount;
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	public String getLibraryId() {
		return libraryId;
	}
	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
	}
	public int getStateNo() {
		return stateNo;
	}
	public void setStateNo(int stateNo) {
		this.stateNo = stateNo;
	}
	public int getGenreNo() {
		return genreNo;
	}
	public void setGenreNo(int genreNo) {
		this.genreNo = genreNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	public Date getBookFirstday() {
		return bookFirstday;
	}
	public void setBookFirstday(Date bookFirstday) {
		this.bookFirstday = bookFirstday;
	}
	public int getBookTotalday() {
		return bookTotalday;
	}
	public void setBookTotalday(int bookTotalday) {
		this.bookTotalday = bookTotalday;
	}
	public int getBookTotalCount() {
		return bookTotalCount;
	}
	public void setBookTotalCount(int bookTotalCount) {
		this.bookTotalCount = bookTotalCount;
	}
	}
