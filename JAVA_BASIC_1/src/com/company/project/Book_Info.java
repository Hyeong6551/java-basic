package com.company.project;

class Book_Info {
	private int cnt=0;
	String bookName;
	String bookInfo;
	String bookAuthor;
	
	public Book_Info(String bookName, String bookInfo, String bookAuthor) {
		super();
		this.bookName = bookName;
		this.bookInfo = bookInfo;
		this.bookAuthor = bookAuthor;
	}
	
	@Override
	public String toString() {
		return "Book_Info [cnt=" + cnt + ", bookName=" + bookName + ", bookInfo=" + bookInfo + "]";
	}

	public String getBookName() { return bookName; }
	public void setBookName(String bookName) { this.bookName = bookName; }
	public String getBookInfo() { return bookInfo; }
	public void setBookInfo(String bookInfo) { this.bookInfo = bookInfo; }
	public String getBookAuthor() { return bookAuthor; }
	public void setBookAuthor(String bookAuthor) { this.bookAuthor = bookAuthor; }
}
