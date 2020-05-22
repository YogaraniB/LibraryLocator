package com.tvm.LibraryBookLocator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookRack {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String bookRackId;
private String bookType;

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getBookRackId() {
	return bookRackId;
}
public void setBookRackId(String bookRackId) {
	this.bookRackId = bookRackId;
}
public String getBookType() {
	return bookType;
}
public void setBookType(String bookType) {
	this.bookType = bookType;
}
public BookRack(String bookRackId, String bookType) {
	super();
	this.bookRackId = bookRackId;
	this.bookType = bookType;
}
public BookRack() {
	super();
	// TODO Auto-generated constructor stub
}


}
