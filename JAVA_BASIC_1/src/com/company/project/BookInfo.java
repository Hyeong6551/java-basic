package com.company.project;

class BookInfo {
	public static int cnt=0;
	private int no;
	private String title;
	private String author;
	private String publisher;
	
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	public String getAuthor() { return author; }
	public void setAuthor(String author) { this.author = author; }
	public String getPublisher() { return publisher; }
	public void setPublisher(String publisher) { this.publisher = publisher; }
	
	public BookInfo(int cnt, int no, String title, String author, String publisher) {
		super();
		BookInfo.cnt = cnt;
		this.no = no;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	public BookInfo(String title, String author, String publisher) {
		super();
		this.no = ++cnt;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	@Override
	public String toString() { return "BookInfo [cnt=" + cnt + ", no=" + no + ", Title=" + title + ", bookAuthor=" + author + ", publisher=" + publisher + "]\n"; }

}
