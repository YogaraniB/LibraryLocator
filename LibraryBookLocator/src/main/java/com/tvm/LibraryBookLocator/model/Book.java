package com.tvm.LibraryBookLocator.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
@Id
	private Integer bookId;
	private String bookName;
	private String bookType;
	private String bookRack;
	private String isbn;
	private String bookDescription;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public String getBookRack() {
		return bookRack;
	}
	public void setBookRack(String bookRack) {
		this.bookRack = bookRack;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	public Book(Integer bookId, String bookName, String bookType, String bookRack, String isbn,
			String bookDescription) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookType = bookType;
		this.bookRack = bookRack;
		this.isbn = isbn;
		this.bookDescription = bookDescription;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
