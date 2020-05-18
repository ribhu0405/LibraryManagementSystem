package com.library.bean;

public class Book {

	private String bookId;
	
	private String bookName;
	
	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "ID: " + this.getBookId() + ", Name: "+ this.getBookName();
	}
	
}
